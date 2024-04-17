#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import org.springframework.stereotype.Repository;

@Repository
public class RepositoryApp implements RepositoryAppDAO {

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
