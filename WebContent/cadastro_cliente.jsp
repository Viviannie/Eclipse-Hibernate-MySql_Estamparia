<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastrar Cliente</title>
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
		
	</head>
	<body>
	
		<div class="container">
		
		
		<h1>Cadastro de Clientes</h1>
		
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="#">Estamparia NVT</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item active">
		        <a class="nav-link" href="index.jsp">Home<span class="sr-only">(index.jsp)</span></a>
		      </li>
		    </ul>
		  </div>
		</nav>
			
			<br>
		
			<form action="CadastroCliente" method="post">
			  <div class="form-group">
			    <label for="nomeID">Nome</label>
			    <input type="text" name="nome" value="${cliente.nome }" class="form-control" id="nomeID" placeholder="Digitar Nome Completo" required>
			  </div>
			  <div class="form-group">
			    <label for="cpfID">CPF</label>
			    <input type="text" name="cpf" value="${cliente.cpf }" class="form-control" id="cpfID" placeholder="xxx.xxx.xxx-xx" required>
			  </div>
			  <div class="form-group">
			    <label for="dataID">Data de Nascimento</label>
			    <input type="text" name="dataNasc" value="${cliente.dataNasc }" class="form-control" id="dataID" placeholder="xx/xx/xxxx">
			  </div>
			  <div class="form-group">
			    <label for="telResID">Telefone Residencial</label>
			    <input type="tel" name="telRes" value="${cliente.telRes }" class="form-control" id="telResID" placeholder="(xx)xxxx-xxxx">
			  </div>
			  <div class="form-group">
			    <label for="telCelID">Telefone Celular</label>
			    <input type="tel" name="telCel" value="${cliente.telCel }" class="form-control" id="telCelID" placeholder="(xx)xxxxx-xxxx">
			  </div>			 
			  <div class="form-group">
			    <label for="emailID">E-mail</label>
			    <input type="email" name="email" value="${cliente.email }" class="form-control" id="emailID" placeholder="E-mail" required>
			  </div>
			  <div class="form-group">
			    <label for="tipoID">Tipo de Usuário</label>
			    <input type="tipo" name="tipo" value="${cliente.tipo }" class="form-control" id="tipoID" placeholder="Cliente/Designer/Atendente" required>
			  </div>
			  <div class="form-group">
			    <label for="logradouroID">Logradouro</label>
			    <input type="text" name="logradouro" value="${cliente.endereco.logradouro }" class="form-control" id="logradouroID" placeholder="Logradouro" required>
			  </div>
			  <div class="form-group">
			    <label for="numeroID">Número</label>
			    <input type="text" name="numero" value="${cliente.endereco.numero }" class="form-control" id="numeroID" placeholder="Nº" required>
			  </div>
			  <div class="form-group">
			    <label for="bairroID">Bairro</label>
			    <input type="text" name="bairro" value="${cliente.endereco.bairro }" class="form-control" id="logradouroID" placeholder="Bairro" required>
			  </div>
			  <div class="form-group">
			    <label for="cidadeID">Cidade</label>
			    <input type="text" name="cidade" value="${cliente.endereco.cidade }" class="form-control" id="cidadeID" placeholder="Cidade" required>
			  </div>
			  <div class="form-group">
			    <label for="estadoID">Estado</label>
			    <input type="text" name="estado" value="${cliente.endereco.estado }" class="form-control" id="estadoID" placeholder="XX" required>
			  </div>
			  <div class="form-group">
			    <label for="loginID">Login</label>
			    <input type="text" name="login" value="${cliente.login }" class="form-control" id="loginID" placeholder="Digitar seu Login" required>
			  </div>
			  <div class="form-group">
			    <label for="senhaID">Senha</label>
			    <input type="password" name="senha" value="${cliente.senha }" class="form-control" id="senhaID" placeholder="Digitar sua Senha" required>
			  </div>
			  
			  <br>
			  <tr>
				<td>
					<input type="hidden" value="inserir" name="action">
					<input type="hidden" value="${cliente.id}" name="clienteID">
				</td>
			  </tr>
	
			  <button type="submit" class="btn btn-primary">Salvar</button>
			</form>
			
			<br>
		
		</div>
	
	</body>
</html>