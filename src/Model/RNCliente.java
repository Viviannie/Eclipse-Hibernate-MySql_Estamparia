package Model;

import java.io.Serializable;
import java.util.List;

import Model.Cliente;
import Model.DAOCliente;
import Model.DAOFactory;

public class RNCliente {	

	private final DAOCliente daoCliente = DAOFactory.getDAOCliente();	

	public void inserir(Cliente c) {

		daoCliente.inserir(c);
	}

	public void remover(Cliente c) {

		daoCliente.remover(c);         

	}

	public void alterar(Cliente c) {

		daoCliente.alterar(c);

	}	

	public Cliente pesquisarPorId(Serializable id) {

		return daoCliente.pesquisarPorId(id);

	}

	public List<Cliente> getAllCli() {

		return daoCliente.getAll();

	}
	
	public void validarSenha(Cliente c) throws Exception  {

		if ((c.getSenha() == null) || (c.getSenha().trim().equals("")) || (c.getSenha().trim().length() != 8)) {

			throw new Exception("Senha inválida!");

		}
	}
	
	public void validarLogin(Cliente c) throws Exception  {

		if ((c.getLogin() == null) || (c.getLogin().trim().equals("")) || (c.getLogin().trim().length() <= 6 && c.getLogin().trim().length() >= 15)) {

			throw new Exception("Login inválido!");

		}
	}
		
	public void validarCpf(Cliente c) throws Exception  {

		if ((c.getCpf() == null) || (c.getCpf().trim().equals("")) || (c.getCpf().trim().length() != 14)) {

			throw new Exception("CPF inválido!");

		}
	}

	public void validarNome(Cliente c) throws Exception {

		if ((c.getNome() == null) || (c.getNome().trim().equals("")) || (c.getNome().trim().length() <= 6 && c.getNome().trim().length() >= 50)) {

			throw new Exception("Nome inválido!");

		}
	}

	public void validarData(Cliente c) throws Exception {

		if ((c.getDataNasc() == null) || (c.getDataNasc().trim().equals("")) || (c.getDataNasc().trim().length() != 10)) {

			throw new Exception("Data inválida!");

		}
	}
	
	public void validarTelRes(Cliente c) throws Exception {

		if ((c.getTelRes() == null) || (c.getTelRes().trim().equals("")) || (c.getTelRes().trim().length() != 13)) {

			throw new Exception("Número do telefone inválido!");

		}
	}
	
	public void validarTelCel(Cliente c) throws Exception {

		if ((c.getTelCel() == null) || (c.getTelCel().trim().equals("")) || (c.getTelCel().trim().length() != 14)) {

			throw new Exception("Número do celular inválido!");

		}
	}

	public void validarEmail(Cliente c) throws Exception  {

		if ((c.getEmail() == null) || (c.getEmail().trim().equals("")) || (c.getEmail().trim().length() <= 10 && c.getEmail().trim().length() >= 30)) {

			throw new Exception("E-mail inválido!");

		}
	}
	
	public void validarTipo(Cliente c) throws Exception  {

		if ((c.getTipo() == null) || (c.getTipo().trim().equals("")) || (c.getTipo().trim().length() != 7)) {

			throw new Exception("Tipo de usuário inválido!");

		}
	}

	public void verificaDuplicidadeId(Cliente c) throws Exception {

		try {

			Cliente x = daoCliente.pesquisarPorId(c.getId());

			if (x != null) {

				throw new Exception("Cliente existente.");

			}

		} catch (Exception e) {

			throw new Exception(e.getMessage());

		}
	}
}