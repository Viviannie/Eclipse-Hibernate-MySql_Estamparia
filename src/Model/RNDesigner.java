package Model;

import java.io.Serializable;
import java.util.List;

import Model.Designer;
import Model.DAODesigner;
import Model.DAOFactory;

public class RNDesigner {
	
	private final DAODesigner daoDesigner = DAOFactory.getDAODesigner();

	public void inserir(Designer d) {

		daoDesigner.inserir(d);
	}

	public void remover(Designer d) {

		daoDesigner.remover(d);         

	}

	public void alterar(Designer d) {

		daoDesigner.alterar(d);

	}	

	public Designer pesquisarPorId(Serializable id) {

		return daoDesigner.pesquisarPorId(id);

	}

	public List<Designer> getAllDes() {

		return daoDesigner.getAll();

	}
	
	public void validarSenha(Designer d) throws Exception  {

		if ((d.getSenha() == null) || (d.getSenha().trim().equals("")) || (d.getSenha().trim().length() != 8)) {

			throw new Exception("Senha inválida!"); 

		}
	}
	
	public void validarLogin(Designer d) throws Exception  {

		if ((d.getLogin() == null) || (d.getLogin().trim().equals("")) || (d.getLogin().trim().length() <= 6 && d.getLogin().trim().length() >= 15)) {

			throw new Exception("Login inválido!");

		}
	}
	
	public void validarCpf(Designer d) throws Exception  {

		if ((d.getCpf() == null) || (d.getCpf().trim().equals("")) || (d.getCpf().trim().length() != 14)) {

			throw new Exception("CPF inválido!");
 
		}
	}

	public void validarNome(Designer d) throws Exception {

		if ((d.getNome() == null) || (d.getNome().trim().equals("")) || (d.getNome().trim().length() <= 6 && d.getNome().trim().length() >= 50)) {

			throw new Exception("Nome inválido!");

		}
	}

	public void validarData(Designer d) throws Exception { 

		if ((d.getDataNasc() == null) || (d.getDataNasc().trim().equals("")) || (d.getDataNasc().trim().length() != 10)) {

			throw new Exception("Preencher data!");

		}
	}
	
	public void validarTelRes(Designer d) throws Exception {

		if ((d.getTelRes() == null || (d.getTelRes().trim().equals("")) || (d.getTelRes().trim().length() != 13))) {

			throw new Exception("Número do telefone inválido!");

		}
	}
	
	public void validarTelCel(Designer d) throws Exception {

		if ((d.getTelCel() == null) || (d.getTelCel().trim().equals("")) || (d.getTelCel().trim().length() != 14)) {

			throw new Exception("Número do celular inválido!");

		}
	}

	public void validarEmail(Designer d) throws Exception  {

		if ((d.getEmail() == null) || (d.getEmail().trim().equals("")) || ((d.getEmail().trim().length() <= 10 && d.getEmail().trim().length() >= 30))) {

			throw new Exception("E-mail inválido!");

		}
	}
	
	public void validarTipo(Designer d) throws Exception  {

		if ((d.getTipo() == null) || (d.getTipo().trim().equals("")) || (d.getTipo().trim().length() != 8)) {

			throw new Exception("Tipo de usuário inválido!");

		}
	}

	public void verificaDuplicidade(Designer d) throws Exception {

		try {

			Designer x = daoDesigner.pesquisarPorId(d.getId());

			if (x != null) {

				throw new Exception("Designer existente.");

			}

		} catch (Exception e) {

			throw new Exception(e.getMessage());

		}
	}
}