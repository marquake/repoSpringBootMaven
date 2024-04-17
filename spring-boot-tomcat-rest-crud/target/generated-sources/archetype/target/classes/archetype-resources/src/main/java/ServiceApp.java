#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceApp {

	@Autowired
	RepositoryApp repositoryApp;

	public void list() {
		System.out.println("ServiceApp :: list()");
		repositoryApp.list();
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
