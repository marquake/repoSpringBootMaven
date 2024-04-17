package com.spring.app.spring_boot_tomcat_rest_crud_layers_params.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.spring_boot_tomcat_rest_crud_layers_params.dao.RepositoryApp;

@Service
public class ServiceApp {

	@Autowired
	RepositoryApp repositoryApp;

	public List<Integer> list() {
		System.out.println("ServiceApp :: list()");
		return repositoryApp.list();
	}

	public void add() {
		System.out.println("ServiceApp :: add()");
		repositoryApp.add();
	}

	public void update() {
		System.out.println("ServiceApp :: update()");
		repositoryApp.update();
	}

	public void delete() {
		System.out.println("ServiceApp :: delete()");
		repositoryApp.update();
	}

}
