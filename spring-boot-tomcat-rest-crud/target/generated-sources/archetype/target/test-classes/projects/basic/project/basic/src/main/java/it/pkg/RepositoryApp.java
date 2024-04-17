package it.pkg;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryApp {

	public void list() {
		System.out.println("RepositoryApp :: list()");
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
