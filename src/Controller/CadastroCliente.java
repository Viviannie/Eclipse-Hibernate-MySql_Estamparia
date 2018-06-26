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

import Model.Cliente;
import Model.Endereco;
import Model.Fachada;

/**
 * Servlet implementation class CadastroCliente
 */
@WebServlet("/CadastroCliente")
public class CadastroCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Cliente cliente = new Cliente();
	Endereco endereco = new Endereco();
	Fachada fachada = new Fachada();

	RequestDispatcher rd = null;

	//Na página lista_clientes
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		if(request.getParameter("action") != null) {

			if(request.getParameter("action").toString().equals("novo")){

				request.setAttribute("action", "novo");

				rd = request.getRequestDispatcher("cadastro_admin_cliente.jsp");

			} else if(request.getParameter("action").toString().equals("alterar")) {

				try {
					
					Integer id = Integer.parseInt(request.getParameter("clienteID"));
					request.setAttribute("clienteID", id);

					cliente = fachada.pesquisarPorIdCli(id);
					fachada.alterarCliente(cliente);
					
					request.setAttribute("cliente", cliente);
					request.setAttribute("action", "alterar");
					
					rd = request.getRequestDispatcher("cadastro_admin_cliente_alterar.jsp");

				} catch (Exception e) {

					e.printStackTrace();

				}

			} else if(request.getParameter("action").toString().equals("remover")) {

				int id = Integer.parseInt(request.getParameter("clienteID").toString());
				request.setAttribute("clienteID", id);
				cliente.setId(id);

				try {

					fachada.removerCliente(cliente);
					
					List<Cliente> getClientes = fachada.getAllCli();
					request.setAttribute("clientes", getClientes);
					rd = request.getRequestDispatcher("listar_clientes.jsp");

				} catch (Exception e) {

					e.printStackTrace();

				}

			} else if(request.getParameter("action").toString().equals("listar")) {

				try {
					
					List<Cliente> getClientes = fachada.getAllCli();
					request.setAttribute("clientes", getClientes);
					rd = request.getRequestDispatcher("listar_clientes.jsp");
					
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

		String action = request.getParameter("action").toString();

		if(action.equals("inserir")) {

			try {
				
				cliente.setNome(request.getParameter("nome").toString());
				cliente.setCpf(request.getParameter("cpf").toString());
				cliente.setSenha(request.getParameter("senha").toString());
				cliente.setLogin(request.getParameter("login").toString());
				cliente.setDataNasc(request.getParameter("dataNasc").toString());
				cliente.setTelCel(request.getParameter("telCel").toString());
				cliente.setTelRes(request.getParameter("telRes").toString());
				cliente.setEmail(request.getParameter("email").toString());
				cliente.setTipo(request.getParameter("tipo").toString());
				endereco.setNumero(Integer.parseInt(request.getParameter("numero").toString()));
				endereco.setLogradouro(request.getParameter("logradouro").toString());
				endereco.setBairro(request.getParameter("bairro").toString());
				endereco.setCidade(request.getParameter("cidade").toString());
				endereco.setEstado(request.getParameter("estado").toString());

				cliente.setEndereco(endereco);
				fachada.inserirCliente(cliente);
				
				List<Cliente> getClientes = fachada.getAllCli();
				request.setAttribute("clientes", getClientes);
				rd = request.getRequestDispatcher("listar_clientes.jsp");

			} catch (Exception e) {

				e.printStackTrace();

			}
		} 

		if(action.equals("alterar")) {

			try {
				
				cliente.setNome(request.getParameter("nome").toString());
				cliente.setCpf(request.getParameter("cpf").toString());
				cliente.setSenha(request.getParameter("senha").toString());
				cliente.setLogin(request.getParameter("login").toString());
				cliente.setDataNasc(request.getParameter("dataNasc").toString());
				cliente.setTelCel(request.getParameter("telCel").toString());
				cliente.setTelRes(request.getParameter("telRes").toString());
				cliente.setEmail(request.getParameter("email").toString());
				cliente.setTipo(request.getParameter("tipo").toString());
				endereco.setNumero(Integer.parseInt(request.getParameter("numero").toString()));
				endereco.setLogradouro(request.getParameter("logradouro").toString());
				endereco.setBairro(request.getParameter("bairro").toString());
				endereco.setCidade(request.getParameter("cidade").toString());
				endereco.setEstado(request.getParameter("estado").toString());

				cliente.setEndereco(endereco);
				fachada.alterarCliente(cliente);
				
				List<Cliente> getClientes = fachada.getAllCli();
				request.setAttribute("clientes", getClientes);
				rd = request.getRequestDispatcher("listar_clientes.jsp");

			} catch (Exception e) {

				e.printStackTrace();

			}
		}

		rd.forward(request, response);		

	}
}
