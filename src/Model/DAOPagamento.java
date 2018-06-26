package Model;

import javax.persistence.EntityManagerFactory;

import Model.Pagamento;

public class DAOPagamento extends DAOGenerico<Pagamento> {
		
	public DAOPagamento(EntityManagerFactory emf) {
		
		super(emf);
		
	}
}