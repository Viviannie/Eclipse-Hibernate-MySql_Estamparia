package Model;

import javax.persistence.EntityManagerFactory;

import Model.Pedido;

public class DAOPedido extends DAOGenerico<Pedido> {
	
	public DAOPedido(EntityManagerFactory emf) {
		
		super(emf);
		
	}
}