package Model;

import javax.persistence.EntityManagerFactory;

import Model.Cliente;
import Model.DAOGenerico;

public class DAOCliente extends DAOGenerico<Cliente> {
	
	public DAOCliente(EntityManagerFactory emf) {
		
		super(emf);
		
	}	
	
	/*@SuppressWarnings("unchecked")
	public List<Cliente> getAllClientes() {

		List<Cliente> clientes = new ArrayList<>();

		Session session = ((Session) em).getSessionFactory().openSession();

		Query query = session.createQuery("from Cliente cli");
		clientes = query.list();

		return clientes;
		
		
		Query query = this.em.createQuery("SELECT c FROM Cliente c WHERE c.cpf = :cpf", Cliente.class);
        query.setParameter("cpf", cpf);
        Cliente cliente = (Cliente) query.getSingleResult();
		return cliente;

	}*/
	
}