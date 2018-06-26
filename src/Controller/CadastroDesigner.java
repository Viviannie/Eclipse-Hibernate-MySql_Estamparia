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

import Model.Designer;
import Model.Fachada;

/**
 * Servlet implementation class CadastroDesigner
 */
@WebServlet("/CadastroDesigner")
public class CadastroDesigner extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Designer designer = new Designer();
	Fachada fachada = new Fachada();

	RequestDispatcher rd = null;

	//Na página lista_clientes
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		if(request.getParameter("action") != null) {

			if(request.getParameter("action").toString().equals("novo")){

				request.setAttribute("action", "novo");

				rd = request.getRequestDispatcher("cadastro_admin_designer.jsp");

			} else if(request.getParameter("action").toString().equals("alterar")) {

				try {

					Integer id = Integer.parseInt(request.getParameter("designerID"));
					request.setAttribute("designerID", id);

					Designer designer = fachada.pesquisarPorId(id);					
					fachada.alterarDesigner(designer);

					request.setAttribute("designer", designer);
					request.setAttribute("action", "alterar");

					rd = request.getRequestDispatcher("cadastro_admin_designer_alterar.jsp");

				} catch (Exception e) {

					e.printStackTrace();

				}

			} else if(request.getParameter("action").toString().equals("remover")) {

				int id = Integer.parseInt(request.getParameter("designerID").toString());
				request.setAttribute("designerID", id);
				designer.setId(id);

				try {

					fachada.removerDesigner(designer);

					List<Designer> getDesigners = fachada.getAllDes();
					request.setAttribute("designers", getDesigners);
					rd = request.getRequestDispatcher("listar_designers.jsp");

				} catch (Exception e) {

					e.printStackTrace();

				}

			} else if(request.getParameter("action").toString().equals("listar")) {

				try {

					List<Designer> getDesigners = fachada.getAllDes();
					request.setAttribute("designers", getDesigners);
					rd = request.getRequestDispatcher("listar_designers.jsp");

				} catch (Exception e) {

					PrintWriter mensagem = new PrintWriter("");
					e.printStackTrace(mensagem);

				}
			}

			rd.forward(request, response);
			
		}
	}

	//Na página cadastro_admin_cliente
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String action = request.getParameter("action").toString();

		if(action.equals("inserir")) {

			try {

				designer.setNome(request.getParameter("nome").toString());
				designer.setCpf(request.getParameter("cpf").toString());
				designer.setSenha(request.getParameter("senha").toString());
				designer.setLogin(request.getParameter("login").toString());
				designer.setDataNasc(request.getParameter("dataNasc").toString());
				designer.setTelCel(request.getParameter("telCel").toString());
				designer.setTelRes(request.getParameter("telRes").toString());
				designer.setEmail(request.getParameter("email").toString());
				designer.setTipo(request.getParameter("tipo").toString());

				fachada.inserirDesigner(designer);

				List<Designer> getDesigners = fachada.getAllDes();
				request.setAttribute("designers", getDesigners);
				rd = request.getRequestDispatcher("listar_designers.jsp");

			} catch (Exception e) {

				e.printStackTrace();

			}
		} 

		if(action.equals("alterar")) {

			try {

				designer.setNome(request.getParameter("nome").toString());
				designer.setCpf(request.getParameter("cpf").toString());
				designer.setSenha(request.getParameter("senha").toString());
				designer.setLogin(request.getParameter("login").toString());
				designer.setDataNasc(request.getParameter("dataNasc").toString());
				designer.setTelCel(request.getParameter("telCel").toString());
				designer.setTelRes(request.getParameter("telRes").toString());
				designer.setEmail(request.getParameter("email").toString());
				designer.setTipo(request.getParameter("tipo").toString());

				fachada.alterarDesigner(designer);

				List<Designer> getDesigners = fachada.getAllDes();
				request.setAttribute("designers", getDesigners);
				rd = request.getRequestDispatcher("listar_designers.jsp");

			} catch (Exception e) {

				e.printStackTrace();

			}
		}

		rd.forward(request, response);		

	}
}
