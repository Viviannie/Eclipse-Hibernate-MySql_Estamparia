<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastro</title>
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
		
	</head>
	<body>
	
		<div class="container">
		
		
		<h1>Cadastrar Usuário</h1>
		
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="#">Estamparia NVT</a>
		
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">		      
		      <li class="nav-item dropdown">
		        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		          Cadastro
		        </a>
		        <div class="dropdown-menu" aria-labelledby="navbarDropdown">		       
		          <a class="dropdown-item" href="cadastro_admin_cliente.jsp">Cliente</a>
		          <a class="dropdown-item" href="cadastro_admin_atendente.jsp">Atendente</a>
		          <a class="dropdown-item" href="cadastro_admin_designer.jsp">Designer</a>
		          <a class="dropdown-item" href="cadastro_admin_fornecedor.jsp">Fornecedor</a>
		        </div>
		      </li>
		      <li class="nav-item dropdown">
		        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		          Lista de Usuários
		        </a>
		       <div class="dropdown-menu" aria-labelledby="navbarDropdown">
		          <a class="dropdown-item" href="listar_clientes.jsp">Cliente</a>
		          <a class="dropdown-item" href="listar_atendentes.jsp">Atendente</a>
		          <a class="dropdown-item" href="listar_designers.jsp">Designer</a>
		          <a class="dropdown-item" href="listar_fornecedores.jsp">Fornecedor</a>
		        </div>
		      </li>
		    </ul>
		  </div>
		</nav>		
		</div>
	
	</body>
</html>