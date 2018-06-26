package Model;

import javax.persistence.EntityManagerFactory;

import Model.Endereco;

public class DAOEndereco extends DAOGenerico<Endereco> {
		
	public DAOEndereco(EntityManagerFactory emf) {
		
		super(emf);
		
	}
}