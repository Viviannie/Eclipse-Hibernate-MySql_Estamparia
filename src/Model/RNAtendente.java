package Model;

import java.io.Serializable;
import java.util.List;

import Model.Atendente;
import Model.DAOAtendente;
import Model.DAOFactory;

public class RNAtendente {

	private final DAOAtendente daoAtendente = DAOFactory.getDAOAtendente();

	public void inserir(Atendente a) {

		daoAtendente.inserir(a);
	}

	public void remover(Atendente a) {

		daoAtendente.remover(a);         

	}

	public void alterar(Atendente a) {

		daoAtendente.alterar(a);

	}	

	public Atendente pesquisarPorId(Serializable id) {

		return daoAtendente.pesquisarPorId(id);

	}

	public List<Atendente> getAllAt() {

		return daoAtendente.getAll();

	}
	
	public void validarSenha(Atendente a) throws Exception  {

		if ((a.getSenha() == null) || (a.getSenha().trim().equals("")) || (a.getSenha().trim().length() != 8)) {

			throw new Exception("Senha inválida!");

		}
	}
	
	public void validarLogin(Atendente a) throws Exception  {

		if ((a.getLogin() == null) || (a.getLogin().trim().equals("")) || (a.getLogin().trim().length() <= 6 && a.getLogin().trim().length() >= 15)) {

			throw new Exception("Login inválido!");

		}
	}
	
	public void validarCpf(Atendente a) throws Exception  {

		if ((a.getCpf() == null) || (a.getCpf().trim().equals("")) || (a.getCpf().trim().length() != 14)) {

			throw new Exception("CPF inválido!");

		}
	}

	public void validarNome(Atendente a) throws Exception {

		if ((a.getNome() == null) || (a.getNome().trim().equals("")) || (a.getNome().trim().length() <= 6 && a.getNome().trim().length() >= 50)) {

			throw new Exception("Nome inválido!");

		}
	}

	public void validarData(Atendente a) throws Exception {

		if ((a.getDataNasc() == null) || (a.getDataNasc().trim().equals("")) || (a.getDataNasc().trim().length() != 10)) {

			throw new Exception("Data inválida!");

		}
	}
	
	public void validarTelRes(Atendente a) throws Exception {

		if ((a.getTelRes() == null) || (a.getTelRes().trim().equals("")) || (a.getTelRes().trim().length() != 13)) {

			throw new Exception("Número do telefone inválido!");

		}
	}
	
	public void validarTelCel(Atendente a) throws Exception {

		if ((a.getTelCel() == null) || (a.getTelCel().trim().equals("")) || (a.getTelCel().trim().length() != 14)) {

			throw new Exception("Número do celular inválido!");

		}
	}

	public void validarEmail(Atendente a) throws Exception  {

		if ((a.getEmail() == null) || (a.getEmail().trim().equals("")) || ((a.getEmail().trim().length() <= 10 && a.getEmail().trim().length() >= 30))) {

			throw new Exception("E-mail inválido!");

		}
	}
	
	public void validarTipo(Atendente a) throws Exception  {

		if ((a.getTipo() == null) || (a.getTipo().trim().equals("")) || (a.getTipo().trim().length() != 9)) {

			throw new Exception("Tipo de usuário inválido!");

		}
	}

	public void verificaDuplicidade(Atendente a) throws Exception {

		try {

			Atendente x = daoAtendente.pesquisarPorId(a.getId());

			if (x != null) {

				throw new Exception("Cliente existente.");

			}

		} catch (Exception e) {

			throw new Exception(e.getMessage());

		}
	}
}