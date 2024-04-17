package com.spring.app.spring_boot_tomcat_rest_crud_layers_params.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryApp implements RepositoryAppDAO {

	public List<Integer> list() {
		System.out.println("RepositoryApp :: list()");
		return Arrays.asList(1,2,3,4,5);
	}

	public void add() {
		System.out.println("RepositoryApp :: add()");
	}

	public void update() {
		System.out.println("RepositoryApp :: update()");
	}

	public void delete() {
		System.out.println("RepositoryApp :: delete()");
	}

}
