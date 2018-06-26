package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Atendente;
import Model.Fachada;

/**
 * Servlet implementation class CadastroAtendente
 */
@WebServlet("/CadastroAtendente")
public class CadastroAtendente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Atendente atendente = new Atendente();
	Fachada fachada = new Fachada();

	RequestDispatcher rd = null;

	//Na página lista_clientes
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		if(request.getParameter("action") != null) {

			if(request.getParameter("action").toString().equals("novo")){

				request.setAttribute("action", "novo");

				rd = request.getRequestDispatcher("cadastro_admin_atendente.jsp");

			} else if(request.getParameter("action").toString().equals("alterar")) {

				try {

					Integer id = Integer.parseInt(request.getParameter("atendenteID"));
					request.setAttribute("atendenteID", id);

					atendente = fachada.pesquisarPorIdAt(id);
					fachada.alterarAtendente(atendente);

					request.setAttribute("atendentes", atendente);
					request.setAttribute("action", "alterar");

					rd = request.getRequestDispatcher("cadastro_admin_atendente_alterar.jsp");

				} catch (Exception e) {

					e.printStackTrace();

				}

			} else if(request.getParameter("action").toString().equals("remover")) {

				int id = Integer.parseInt(request.getParameter("atendenteID").toString());
				request.setAttribute("atendenteID", id);
				atendente.setId(id);

				try {

					fachada.removerAtendente(atendente);

					List<Atendente> getAtendentes = fachada.getAllAt();
					request.setAttribute("atendentes", getAtendentes);
					rd = request.getRequestDispatcher("listar_atendentes.jsp");

				} catch (Exception e) {

					e.printStackTrace();

				}

			} else if(request.getParameter("action").toString().equals("listar")) {

				try {

					List<Atendente> getAtendentes = fachada.getAllAt();
					request.setAttribute("atendentes", getAtendentes);
					rd = request.getRequestDispatcher("listar_atendentes.jsp");

				} catch (Exception e) {

					PrintWriter mensagem = new PrintWriter("");
					e.printStackTrace(mensagem);

				}
			}
		}
		
		rd.forward(request, response);

	}

	//Na página cadastro_admin_cliente
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String action = request.getParameter("action").toString();

		if(action.equals("inserir")) {

			try {

				atendente.setNome(request.getParameter("nome").toString());
				atendente.setCpf(request.getParameter("cpf").toString());
				atendente.setSenha(request.getParameter("senha").toString());
				atendente.setLogin(request.getParameter("login").toString());
				atendente.setDataNasc(request.getParameter("dataNasc").toString());
				atendente.setTelCel(request.getParameter("telCel").toString());
				atendente.setTelRes(request.getParameter("telRes").toString());
				atendente.setEmail(request.getParameter("email").toString());
				atendente.setTipo(request.getParameter("tipo").toString());

				fachada.inserirAtendente(atendente);

				List<Atendente> getAtendentes = fachada.getAllAt();
				request.setAttribute("atendentes", getAtendentes);
				rd = request.getRequestDispatcher("listar_atendentes.jsp");

			} catch (Exception e) {

				e.printStackTrace();

			}
		} 

		if(action.equals("alterar")) {

			try {

				atendente.setNome(request.getParameter("nome").toString());
				atendente.setCpf(request.getParameter("cpf").toString());
				atendente.setSenha(request.getParameter("senha").toString());
				atendente.setLogin(request.getParameter("login").toString());
				atendente.setDataNasc(request.getParameter("dataNasc").toString());
				atendente.setTelCel(request.getParameter("telCel").toString());
				atendente.setTelRes(request.getParameter("telRes").toString());
				atendente.setEmail(request.getParameter("email").toString());
				atendente.setTipo(request.getParameter("tipo").toString());

				fachada.alterarAtendente(atendente);

				List<Atendente> getAtendentes = fachada.getAllAt();
				request.setAttribute("atendentes", getAtendentes);
				rd = request.getRequestDispatcher("listar_atendentes.jsp");

			} catch (Exception e) {

				e.printStackTrace();

			}
		}

		rd.forward(request, response);		

	}
}
