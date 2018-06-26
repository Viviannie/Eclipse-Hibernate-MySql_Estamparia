package Model;

import javax.persistence.EntityManagerFactory;

import Model.Atendente;
import Model.DAOGenerico;

public class DAOAtendente extends DAOGenerico<Atendente> {
	
	public DAOAtendente(EntityManagerFactory emf) {
		
		super(emf);
		
	}
}