package Model;

import javax.persistence.EntityManagerFactory;

import Model.Fornecedor;

public class DAOFornecedor extends DAOGenerico<Fornecedor> {
	
	public DAOFornecedor(EntityManagerFactory emf) {
		
		super(emf);
		
	}
}