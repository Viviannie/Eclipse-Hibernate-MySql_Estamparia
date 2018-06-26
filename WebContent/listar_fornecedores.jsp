<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<title>Lista de Fornecedores</title>
	<meta charset="utf-8">
	  <meta name="viewport" content="width=device-width, initial-scale=1">
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
	</head>
	<body>		
		<div class="container">
		  <h2>Fornecedores Cadastrados</h2>           
		  <table class="table">
		    <thead>
		      <tr>
				<th>ID</th>
				<th>CNPJ</th>
				<th>Razão Social</th>
				<th>Telefone Celular</th>
				<th>E-mail</th>
				<th>Alterar</th>
				<th>Remover</th>
			  </tr>
		    </thead>
		    <c:forEach items="${fornecedores }" var="fornecedor">
		     <tbody>	 
				<tr>
					<td>${fornecedor.id }</td>
					<td>${fornecedor.cnpj }</td>
					<td>${fornecedor.razaoSocial }</td>
					<td>${fornecedor.telCel }</td>
					<td>${fornecedor.email }</td>
					<td><a href = "CadastroFornecedor?action=alterar&fornecedorID=${fornecedor.id }">Alterar</a></td>
					<td><a href = "CadastroFornecedor?action=remover&fornecedorID=${fornecedor.id }">Deletar</a></td>											
				</tr>		
		    </tbody>
			</c:forEach>
		  </table>
		</div>
	
	<br>
		<a href="CadastroFornecedor?action=novo" class="btn btn-info" role="button">Novo Fornecedor</a>
		<a href="CadastroFornecedor?action=listar" class="btn btn-info" role="button">Listar Fornecedores</a>		
		<a href="cadastro_usuario.jsp" class="btn btn-info" role="button">Home</a>
	
	<br>

	</body>
</html>