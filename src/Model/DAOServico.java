package Model;

import javax.persistence.EntityManagerFactory;

import Model.Servico;

public class DAOServico extends DAOGenerico<Servico> {
		
	public DAOServico(EntityManagerFactory emf) {
		
		super(emf);
		
	}
}