<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href = "CadastroCliente?action=listar">Listar Usuários</a>
	<table align="center">
		<tr>
			<td>ID</td>
			<td>Nome</td>
			<td>CPF</td>
			<td>Data de Nascimento</td>
			<td>Telefone Residencial</td>
			<td>Telefone Celular</td>			
			<td>E-mail</td>
			<td>Tipo</td>
			<td>Logradouro</td>
			<td>Número</td>
			<td>Bairro</td>
			<td>Cidade</td>
			<td>Estado</td>
			<td>Update</td>
			<td>Delete</td>
		  </tr>
		
		<c:forEach items="${clientes }" var="cliente">
			<tr>
				<td>${cliente.id }</td>
				<td>${cliente.nome }</td>
				<td>${cliente.cpf }</td>
				<td>${cliente.dataNasc }</td>
				<td>${cliente.telRes }</td>
				<td>${cliente.telCel }</td>
				<td>${cliente.email }</td>
				<td>${cliente.tipo }</td>
				<td>${cliente.endereco.numero }</td>
				<td>${cliente.endereco.logradouro }</td>
				<td>${cliente.endereco.bairro }</td>
				<td>${cliente.endereco.cidade }</td>
				<td>${cliente.endereco.estado }</td>
				<td><a href="CadastroCliente?action=alterar&id=${cliente.id }">Alterar</a></td>
				<td><a href="CadastroCliente?action=remover&id=${cliente.id }">Deletar</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>