<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<title>Lista de Designers</title>
	<meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	</head>
	<body>		
		<div class="container">
		  <h2>Designers Cadastrados</h2>           
		  <table class="table">
		    <thead>
		      <tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Login</th>
				<th>CPF</th>
				<th>Data de Nascimento</th>
				<th>Telefone Residencial</th>
				<th>Telefone Celular</th>
				<th>E-mail</th>
				<th>Tipo</th>
				<th>Alterar</th>
				<th>Remover</th>
			  </tr>
		    </thead>
		    <c:forEach items="${designers }" var="designer">
		    <tbody>	    
				<tr>
					<td>${designer.id }</td>
					<td>${designer.nome }</td>
					<td>${designer.login }</td>
					<td>${designer.cpf }</td>
					<td>${designer.dataNasc }</td>
					<td>${designer.telRes }</td>
					<td>${designer.telCel }</td>
					<td>${designer.email }</td>
					<td>${designer.tipo }</td>
					<td><a href="CadastroDesigner?action=alterar&designerID=${designer.id }">Alterar</a></td>
					<td><a href="CadastroDesigner?action=remover&designerID=${designer.id }">Deletar</a></td>
				</tr>
		    </tbody>
			</c:forEach>
		  </table>
		</div>
	
	<br>
		<a href="CadastroDesigner?action=novo" class="btn btn-info" role="button">Novo Designer</a>	
		<a href="CadastroDesigner?action=listar" class="btn btn-info" role="button">Listar Designers</a>	
		<a href="cadastro_usuario.jsp" class="btn btn-info" role="button">Home</a>
	
	<br>
	
	</body>
</html>