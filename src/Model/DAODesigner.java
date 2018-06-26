package Model;

import javax.persistence.EntityManagerFactory;

import Model.Designer;

public class DAODesigner extends DAOGenerico<Designer>{

	public DAODesigner(EntityManagerFactory emf) {
		
		super(emf);
		
	}
}