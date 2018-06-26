package Model;

import java.io.Serializable;
import java.util.List;

import Model.Pedido;
import Model.DAOPedido;
import Model.DAOFactory;

public class RNPedido {
	
	private final DAOPedido daoPedido = DAOFactory.getDAOPedido();

	public void inserir(Pedido p) {

		daoPedido.inserir(p);
	}

	public void remover(Pedido p) {

		daoPedido.remover(p);         

	}

	public void alterar(Pedido p) {

		daoPedido.alterar(p);

	}	

	public Pedido pesquisarPorId(Serializable id) {

		return daoPedido.pesquisarPorId(id);

	}

	public List<Pedido> getAllPed() {

		return daoPedido.getAll();

	}
	
	public void validarDataCompra(Pedido p) throws Exception  {

		if ((p.getDataCompra() == null)) {

			throw new Exception("Data da Compra inválida!");

		}
	}

	public void validarDataEntrega(Pedido p) throws Exception {

		if ((p.getDataEntrega()) == null) {

			throw new Exception("Data de Entrega inválida!");

		}
	}

	public void validarValorProduto(Pedido p) throws Exception {

		if ((p.getValorProduto() == 0.0)) {

			throw new Exception("Valor do Produto inválido!");

		}
	}
	
	public void validarValorServico(Pedido p) throws Exception {

		if ((p.getValorServico() == 0.0)) {

			throw new Exception("Valor do Serviço inválido!");

		}
	}
	
	public void validarQtdProduto(Pedido p) throws Exception {

		if ((p.getQtdProduto() == 0)) {

			throw new Exception("Quantidade do Produto inválido!");

		}
	}

	public void validarTipoServico(Pedido p) throws Exception  {

		if ((p.getTipoServico() == null) || (p.getTipoServico().trim().equals("")) || (p.getTipoServico().trim().length() != 30)) {

			throw new Exception("Tipo de Serviço inválido!");

		}
	}

	public void verificaDuplicidade(Pedido p) throws Exception {

		try {

			Pedido x = daoPedido.pesquisarPorId(p.getId());

			if (x != null) {

				throw new Exception("Pedido existente.");

			}

		} catch (Exception e) {

			throw new Exception(e.getMessage());

		}
	}	
}