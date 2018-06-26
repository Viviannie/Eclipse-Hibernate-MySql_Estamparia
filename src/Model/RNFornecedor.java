package Model;

import java.io.Serializable;
import java.util.List;

import Model.Fornecedor;
import Model.DAOFornecedor;
import Model.DAOFactory;

public class RNFornecedor {
	
	private final DAOFornecedor daoFornecedor = DAOFactory.getDAOFornecedor();

	public void inserir(Fornecedor f) {

		daoFornecedor.inserir(f);
	}

	public void remover(Fornecedor f) {

		daoFornecedor.remover(f);         

	}

	public void alterar(Fornecedor f) {

		daoFornecedor.alterar(f);

	}	

	public Fornecedor pesquisarPorId(Serializable id) {

		return daoFornecedor.pesquisarPorId(id);

	}

	public List<Fornecedor> getAllFor() {

		return daoFornecedor.getAll();

	}
	
	public void validarCnpj(Fornecedor f) throws Exception  {

		if ((f.getCnpj() == null) || (f.getCnpj().trim().equals("")) || (f.getCnpj().trim().length() != 18)) {

			throw new Exception("Cnpj inválido!");

		}
	}

	public void validarRazaoSocial(Fornecedor f) throws Exception {

		if ((f.getCnpj() == null) || (f.getCnpj().trim().equals("")) || (f.getCnpj().trim().length() <= 6 && f.getCnpj().trim().length() >= 30)) {

			throw new Exception("RazÃo Social inválida!");

		}
	}
	
	public void validarTelCel(Fornecedor f) throws Exception {

		if ((f.getTelCel() == null) || (f.getTelCel().trim().equals("")) || (f.getTelCel().trim().length() != 14)) {

			throw new Exception("Número do celular inválido!");

		}
	}

	public void validarEmail(Fornecedor f) throws Exception  {

		if ((f.getEmail() == null) || (f.getEmail().trim().equals("")) || ((f.getEmail().trim().length() <= 10 && f.getEmail().trim().length() >= 30))) {

			throw new Exception("E-mail inválido!");

		}
	}

	public void verificaDuplicidade(Fornecedor f) throws Exception {

		try {

			Fornecedor x = daoFornecedor.pesquisarPorId(f.getId());

			if (x != null) {

				throw new Exception("Fornecedor existente.");

			}

		} catch (Exception e) {

			throw new Exception(e.getMessage());

		}
	}
}