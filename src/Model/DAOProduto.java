package Model;

import javax.persistence.EntityManagerFactory;

import Model.Produto;

public class DAOProduto extends DAOGenerico<Produto> {
		
	public DAOProduto(EntityManagerFactory emf) {
		
		super(emf);
		
	}
}