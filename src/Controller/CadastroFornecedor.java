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

import Model.Fachada;
import Model.Fornecedor;

/**
 * Servlet implementation class CadastroFornecedor
 */
@WebServlet("/CadastroFornecedor")
public class CadastroFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Fornecedor fornecedor = new Fornecedor();
	Fachada fachada = new Fachada();

	RequestDispatcher rd = null;

	//Na página lista_clientes
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		if(request.getParameter("action") != null) {

			if(request.getParameter("action").toString().equals("novo")){

				request.setAttribute("action", "novo");

				rd = request.getRequestDispatcher("cadastro_admin_fornecedor.jsp");

			} else if(request.getParameter("action").toString().equals("alterar")) {

				try {

					Integer id = Integer.parseInt(request.getParameter("fornecedorID"));
					request.setAttribute("fornecedorID", id);

					fornecedor = fachada.pesquisarPorIdFor(id);
					fachada.alterarFornecedor(fornecedor);
					
					request.setAttribute("fornecedor", fornecedor);
					request.setAttribute("action", "alterar");
					
					rd = request.getRequestDispatcher("listar_fornecedores.jsp");

				} catch (Exception e) {

					e.printStackTrace();

				}

			} else if(request.getParameter("action").toString().equals("remover")) {

				int id = Integer.parseInt(request.getParameter("fornecedorID").toString());
				request.setAttribute("fornecedorID", id);
				fornecedor.setId(id);

				try {

					fachada.removerFornecedor(fornecedor);
					
					List<Fornecedor> getFornecedors = fachada.getAllFor();
					request.setAttribute("fornecedores", getFornecedors);
					rd = request.getRequestDispatcher("listar_fornecedores.jsp");

				} catch (Exception e) {

					e.printStackTrace();

				}

		} else if(request.getParameter("action").toString().equals("listar")) {

			try {
				
				List<Fornecedor> getFornecedors = fachada.getAllFor();
				request.setAttribute("fornecedor", getFornecedors);
				rd = request.getRequestDispatcher("listar_fornecedores.jsp");
				
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
				
				fornecedor.setCnpj(request.getParameter("cnpj").toString());
				fornecedor.setRazaoSocial(request.getParameter("razaoSocial").toString());
				fornecedor.setTelCel(request.getParameter("telCel").toString());
				fornecedor.setEmail(request.getParameter("email").toString());
				
				fachada.inserirFornecedor(fornecedor);
				
				List<Fornecedor> getFornecedors = fachada.getAllFor();
				request.setAttribute("fornecedores", getFornecedors);
				rd = request.getRequestDispatcher("listar_fornecedores.jsp");
				
			} catch (Exception e) {

				e.printStackTrace();
				
			}
		} 

		if(action.equals("alterar")) {

			try {
				
				fornecedor.setCnpj(request.getParameter("cnpj").toString());
				fornecedor.setRazaoSocial(request.getParameter("razaoSocial").toString());
				fornecedor.setTelCel(request.getParameter("telCel").toString());
				fornecedor.setEmail(request.getParameter("email").toString());
				
				fachada.alterarFornecedor(fornecedor);

				List<Fornecedor> getFornecedors = fachada.getAllFor();
				request.setAttribute("fornecedores", getFornecedors);
				rd = request.getRequestDispatcher("listar_fornecedores.jsp");
				
			} catch (Exception e) {

				e.printStackTrace();
				
			}
		}

		rd.forward(request, response);		

	}
}
