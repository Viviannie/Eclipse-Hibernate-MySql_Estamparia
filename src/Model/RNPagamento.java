package Model;

import java.io.Serializable;
import java.util.List;

import Model.Pagamento;
import Model.DAOPagamento;
import Model.DAOFactory;

public class RNPagamento {
	
	private final DAOPagamento daoPagamento = DAOFactory.getDAOPagamento();

	public void inserir(Pagamento p) {

		daoPagamento.inserir(p);
	}

	public void remover(Pagamento p) {

		daoPagamento.remover(p);         

	}

	public void alterar(Pagamento p) {

		daoPagamento.alterar(p);

	}	

	public Pagamento pesquisarPorId(Serializable id) {

		return daoPagamento.pesquisarPorId(id);

	}

	public List<Pagamento> getAllPag() {

		return daoPagamento.getAll();

	}
	
	public void validarForma(Pagamento p) throws Exception  {

		if ((p.getForma() == null) || (p.getForma().trim().equals("")) || (p.getForma().trim().length() != 20)) {

			throw new Exception("Forma de pagamento inválida!");

		}
	}

	public void validarValorSerPago(Pagamento p) throws Exception {

		if ((p.getValorSerPago() == 0.0)) {

			throw new Exception("Valor a ser pago inválido!");

		}
	}

	public void validarStatus(Pagamento p) throws Exception {

		if ((p.getStatus() == null) || (p.getStatus().trim().equals("")) || (p.getStatus().trim().length() <= 10 && p.getStatus().trim().length() >= 20)) {

			throw new Exception("Status inválido!");

		}
	}

	public void verificaDuplicidade(Pagamento p) throws Exception {

		try {

			Pagamento x = daoPagamento.pesquisarPorId(p.getId());

			if (x != null) {

				throw new Exception("Pagamento existente.");

			}

		} catch (Exception e) {

			throw new Exception(e.getMessage());

		}
	}	
}