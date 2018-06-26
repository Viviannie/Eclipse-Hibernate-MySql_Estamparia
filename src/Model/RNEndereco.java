package Model;

import java.util.List;

import Model.Endereco;
import Model.DAOEndereco;
import Model.DAOFactory;

public class RNEndereco {
	
	private final DAOEndereco daoEndereco = DAOFactory.getDAOEndereco();
	
	public void inserir(Endereco e) {

		daoEndereco.inserir(e); 
	}

	public void remover(Endereco c) {

		daoEndereco.remover(c);         

	}

	public void alterar(Endereco c) {

		daoEndereco.alterar(c);

	}	

	public List<Endereco> getAllEnd() {

		return daoEndereco.getAll();

	}
	
	public void validarLogradouro(Endereco e) throws Exception  {

		if ((e.getLogradouro() == null) || (e.getLogradouro().trim().equals("")) || (e.getLogradouro().trim().length() != 15)) {

			throw new Exception("Logradouro inválido!");

		}
	}

	public void validarNumero(Endereco e) throws Exception {

		if (e.getNumero() == 0) {

			throw new Exception("Número inválido!");

		}
	}

	public void validarBairro(Endereco e) throws Exception {

		if ((e.getBairro() == null) || (e.getBairro().trim().equals("")) || (e.getBairro().trim().length() != 80)) {

			throw new Exception("Bairro inválido!");

		}
	}

	public void validarCidade(Endereco e) throws Exception {

		if ((e.getCidade() == null) || (e.getCidade().trim().equals("")) || (e.getCidade().trim().length() != 80)) {

			throw new Exception("Cidade inválida!");
		}

	}

	public void validarEstado(Endereco e) throws Exception {

		if ((e.getEstado() == null) || (e.getEstado().trim().equals("")) || (e.getEstado().trim().length() != 50)) {

			throw new Exception("Estado inválido!");

		}
	}

}
