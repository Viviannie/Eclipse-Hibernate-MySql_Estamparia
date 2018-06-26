<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastrar Atendente</title>
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
		
	</head>
	<body>
	
		<div class="container">
		
		
		<h1>Cadastro de Atendentes</h1>
		
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
		
			<form action="CadastroAtendente" method="post">
			  <div class="form-group">
			    <label for="nomeID">Nome</label>
			    <input type="text" name="nome" value="${atendente.nome }" class="form-control" id="nomeID" placeholder="Digitar Nome Completo" required>
			  </div>
			  <div class="form-group">
			    <label for="cpfID">CPF</label>
			    <input type="text" name="cpf" value="${atendente.cpf }" class="form-control" id="cpfID" placeholder="xxx.xxx.xxx-xx" required>
			  </div>
			  <div class="form-group">
			    <label for="dataID">Data de Nascimento</label>
			    <input type="text" name="dataNasc" value="${atendente.dataNasc }" class="form-control" id="dataID" placeholder="xx/xx/xxxx">
			  </div>
			  <div class="form-group">
			    <label for="telResID">Telefone Residencial</label>
			    <input type="tel" name="telRes" value="${atendente.telRes }" class="form-control" id="telResID" placeholder="(xx)xxxx-xxxx">
			  </div>
			  <div class="form-group">
			    <label for="telCelID">Telefone Celular</label>
			    <input type="tel" name="telCel" value="${atendente.telCel }" class="form-control" id="telCelID" placeholder="(xx)xxxxx-xxxx">
			  </div>			 
			  <div class="form-group">
			    <label for="emailID">E-mail</label>
			    <input type="email" name="email" value="${atendente.email }" class="form-control" id="emailID" placeholder="E-mail" required>
			  </div>
			  <div class="form-group">
			    <label for="tipoID">Tipo de Usuário</label>
			    <input type="tipo" name="tipo" value="${atendente.tipo }" class="form-control" id="tipoID" placeholder="Atendente" required>
			  </div>
			  <div class="form-group">
			    <label for="loginID">Login</label>
			    <input type="text" name="login" value="${atendente.login }" class="form-control" id="loginID" placeholder="Digitar seu Login" required>
			  </div>
			  <div class="form-group">
			    <label for="senhaID">Senha</label>
			    <input type="password" name="senha" value="${atendente.senha }" class="form-control" id="senhaID" placeholder="Digitar sua Senha" required>
			  </div>			  
			  
			  <br>
			  <tr>
				<td>
					<input type="hidden" value="alterar" name="action">
					<input type="hidden" type="text" value="${atendente.id}" name="atendenteID" id="atendenteID">
				</td>
			  </tr>
	
			  <button type="submit" class="btn btn-primary">Salvar</button>
			</form>
			
			<br>
		
		</div>
	
	</body>
</html>