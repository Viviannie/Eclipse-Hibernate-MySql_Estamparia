package Model;

import java.io.Serializable;
import java.util.List;

import Model.Servico;
import Model.DAOServico;
import Model.DAOFactory;

public class RNServico {
	
	private final DAOServico daoServico = DAOFactory.getDAOServico();

	public void inserir(Servico s) {

		daoServico.inserir(s);
	}

	public void remover(Servico s) {

		daoServico.remover(s);         

	}

	public void alterar(Servico s) {

		daoServico.alterar(s);

	}	

	public Servico pesquisarPorId(Serializable id) {

		return daoServico.pesquisarPorId(id);

	}

	public List<Servico> getAllServ() {

		return daoServico.getAll();

	}
	
	public void validarTipoImpressao(Servico s) throws Exception  {

		if ((s.getTipoImpressao() == null) || (s.getTipoImpressao().trim().equals("")) || (s.getTipoImpressao().trim().length() != 30)) {

			throw new Exception("Tipo de Impressão inválida!");

		}
	}

	public void validarStatus(Servico s) throws Exception {

		if ((s.getStatus() == null) || (s.getStatus().trim().equals("")) || (s.getStatus().trim().length() != 6)) {

			throw new Exception("Nome inválido!");

		}
	}
	
	public void verificaDuplicidade(Servico s) throws Exception {

		try {

			Servico x = daoServico.pesquisarPorId(s.getId());

			if (x != null) {

				throw new Exception("Serviço existente.");

			}

		} catch (Exception e) {

			throw new Exception(e.getMessage());

		}
	}
}