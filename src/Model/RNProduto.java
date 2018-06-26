package Model;

import java.io.Serializable;
import java.util.List;

import Model.Produto;
import Model.DAOProduto;
import Model.DAOFactory;

public class RNProduto {
	
	private final DAOProduto daoProduto = DAOFactory.getDAOProduto();

	public void inserir(Produto p) {

		daoProduto.inserir(p);
	}

	public void remover(Produto p) {

		daoProduto.remover(p);         

	}

	public void alterar(Produto p) {

		daoProduto.alterar(p);

	}	

	public Produto pesquisarPorId(Serializable id) {

		return daoProduto.pesquisarPorId(id);

	}

	public List<Produto> getAllProd() {

		return daoProduto.getAll();

	}
	
	public void validarNome(Produto p) throws Exception  {

		if ((p.getNome() == null) || (p.getNome().trim().equals("")) || (p.getNome().trim().length() <= 6 && p.getNome().trim().length() >= 50)) {

			throw new Exception("Nome inválido!");

		}
	}

	public void validarUf(Produto p) throws Exception {

		if ((p.getUf() == null) || (p.getUf().trim().equals("")) || (p.getUf().trim().length() != 2)) {

			throw new Exception("UF inválido!");

		}
	}
	
	public void validarDescricao(Produto p) throws Exception {

		if ((p.getDescricao() == null) || (p.getDescricao().trim().equals("")) || (p.getDescricao().trim().length() <= 5 && p.getDescricao().trim().length() >= 40)) {

			throw new Exception("Descrição do Produto inválida!");

		}
	}
	
	public void validarQtdEstoque(Produto p) throws Exception  {

		if ((p.getQtdEstoque() == 0)) {

			throw new Exception("Quantidade em Estoque inválido!");

		}
	}

	public void verificaDuplicidade(Produto p) throws Exception {

		try {

			Produto x = daoProduto.pesquisarPorId(p.getId());

			if (x != null) {

				throw new Exception("Produto existente.");

			}

		} catch (Exception e) {

			throw new Exception(e.getMessage());

		}
	}
}