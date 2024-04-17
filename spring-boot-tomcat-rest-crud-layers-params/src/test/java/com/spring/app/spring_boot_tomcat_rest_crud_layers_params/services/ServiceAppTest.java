package com.spring.app.spring_boot_tomcat_rest_crud_layers_params.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.spring.app.spring_boot_tomcat_rest_crud_layers_params.dao.RepositoryApp;

@RunWith(MockitoJUnitRunner.class)
class ServiceAppTest {

	@InjectMocks
	ServiceApp serviceApp;
	
	@Mock
	RepositoryApp repositoryApp;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	final void testList() {
		// Given
		List<Integer> li = Arrays.asList(1,2,3,4,5);
		// Then
		//List<Integer> linew = (List<Integer>) when(serviceApp.list()).thenReturn(li);

		when(serviceApp.list()).thenReturn(Arrays.asList(1,2,3,4,5));
	
		List<Integer> linew = serviceApp.list();
		
		assertThat(serviceApp).isNotNull();
		//System.out.println(linew.size());
		//System.out.println(linew.size());
		
		
		// verify
		assertTrue(linew.size() == 5);

		//fail("Not yet implemented"); // TODO
	}

	@Test
	final void testAdd() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	final void testUpdate() {
		//fail("Not yet implemented"); // TODO
	}

	@Test
	final void testDelete() {
		//fail("Not yet implemented"); // TODO
	}

}
