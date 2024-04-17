package com.spring.app.spring_boot_tomcat_rest_crud_layers_params.dao;

import java.util.List;

public interface RepositoryAppDAO {

	public List<Integer> list();

	public void add();

	public void update();

	public void delete();

}
