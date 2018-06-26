package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter(); 
        
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if(login.equals("Annie") && senha.equals("123456")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("login", login);
			session.setAttribute("senha", senha);
			response.sendRedirect("cadastro_usuario.jsp");
			
		} else {
			
			out.print("Nome de usuário ou senha inválidos!");  
			response.sendRedirect("index.jsp");
			
		}
		
		out.close();
		
	}

}
