package Model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAOFactory {

	private static final EntityManagerFactory factory;

	static {

		try {

			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			
		}

		factory = Persistence.createEntityManagerFactory("estamparia");

	}

	public static DAOAtendente getDAOAtendente(){

		DAOAtendente daoAt = new DAOAtendente(factory);
		return daoAt;

	}

	public static DAOCliente getDAOCliente(){

		DAOCliente daoCli = new DAOCliente(factory);
		return daoCli;

	}

	public static DAODesigner getDAODesigner(){

		DAODesigner daoDes = new DAODesigner(factory);
		return daoDes;

	}

	public static DAOEndereco getDAOEndereco(){

		DAOEndereco daoEnd = new DAOEndereco(factory);
		return daoEnd;

	}

	public static DAOFornecedor getDAOFornecedor(){

		DAOFornecedor daoFor = new DAOFornecedor(factory);
		return daoFor;

	}

	public static DAOPagamento getDAOPagamento(){

		DAOPagamento daoPag = new DAOPagamento(factory);
		return daoPag;

	}

	public static DAOPedido getDAOPedido(){

		DAOPedido daoPed = new DAOPedido(factory);
		return daoPed;

	}

	public static DAOProduto getDAOProduto(){

		DAOProduto daoProd = new DAOProduto(factory);
		return daoProd;

	}

	public static DAOServico getDAOServico(){

		DAOServico daoSer = new DAOServico(factory);
		return daoSer;

	}	
}