<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastrar Fornecedor</title>
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
		
	</head>
	<body>
	
		<div class="container">
		
		
		<h1>Cadastro de Fornecedores</h1>
		
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="#">Estamparia NVT</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item active">
		        <a class="nav-link" href="cadastro_usuario.jsp">Home<span class="sr-only">(cadastro_usuario.jsp)</span></a>
		      </li>
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
		          Listar Usuários
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
			
			<br>
		
			<form action="CadastroFornecedor" method="post">
			  <div class="form-group">
			    <label for="cnpjID">CNPJ</label>
			    <input type="text" name="cnpj" value="${fornecedor.cnpj }" class="form-control" id="cnpjID" placeholder="xx.xxx.xxx/xxxx-xx" required>
			  </div>
			  <div class="form-group">
			    <label for="razaoSocialID">Razão Social</label>
			    <input type="text" name="razaoSocial" value="${fornecedor.razaoSocial }" class="form-control" id="razaoSocialID" placeholder="Digite sua Razão Social" required>
			  </div>
			  <div class="form-group">
			    <label for="telCelID">Telefone Celular</label>
			    <input type="tel" name="telCel" value="${fornecedor.telCel }" class="form-control" id="telCelID" placeholder="(xx)xxxxx-xxxx">
			  </div>
			  <div class="form-group">
			    <label for="emailID">Email</label>
			    <input type="email" name="email" value="${fornecedor.email }" class="form-control" id="emailID" placeholder="Digite seu E-mail" required>
			  </div>
			  
			  <br>
			  <tr>
				<td>
					<input type="hidden" value="inserir" name="action">
					<input type="hidden" type="text" value="${fornecedor.id}" name="fornecedorID" id="fornecedorID">
				</td>
			  </tr>
	
			  <button type="submit" class="btn btn-primary">Salvar</button>
			</form>
			
			<br>
		
		</div>
	
	</body>
</html>