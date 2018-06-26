package Model;

import java.io.Serializable;
import java.util.List;

import Model.Atendente;
import Model.Cliente;
import Model.Designer;
import Model.Endereco;
import Model.Fornecedor;
import Model.Pagamento;
import Model.Pedido;
import Model.Produto;
import Model.Servico;

public class Fachada {

	private static Fachada instancia;

	private static RNAtendente rnAtendente;
	private static RNCliente rnCliente;
	private static RNDesigner rnDesigner;
	private static RNEndereco rnEndereco;
	private static RNFornecedor rnFornecedor;
	private static RNPagamento rnPagamento;
	private static RNPedido rnPedido;
	private static RNProduto rnProduto;
	private static RNServico rnServico;

	public Fachada() {

		rnAtendente = new RNAtendente();
		rnCliente = new RNCliente();
		rnDesigner = new RNDesigner();
		rnEndereco = new RNEndereco();
		rnFornecedor = new RNFornecedor();
		rnPagamento = new RNPagamento();
		rnPedido = new RNPedido();
		rnProduto = new RNProduto();
		rnServico = new RNServico();

	}

	public static Fachada getInstancia() {

		if (instancia == null) {

			instancia = new Fachada();

		}

		return instancia;

	}

	//Atendente
	public void inserirAtendente(Atendente atendente) throws Exception {

		rnAtendente.validarCpf(atendente);
		rnAtendente.validarData(atendente);
		rnAtendente.validarEmail(atendente);
		rnAtendente.validarLogin(atendente);
		rnAtendente.validarNome(atendente);
		rnAtendente.validarSenha(atendente);
		rnAtendente.validarTelCel(atendente);
		rnAtendente.validarTelRes(atendente);
		rnAtendente.validarTipo(atendente);
		rnAtendente.verificaDuplicidade(atendente);
		rnAtendente.inserir(atendente);

	}

	public void alterarAtendente(Atendente atendente) throws Exception {

		rnAtendente.validarCpf(atendente);
		rnAtendente.validarData(atendente);
		rnAtendente.validarEmail(atendente);
		rnAtendente.validarLogin(atendente);
		rnAtendente.validarNome(atendente);
		rnAtendente.validarSenha(atendente);
		rnAtendente.validarTelCel(atendente);
		rnAtendente.validarTelRes(atendente);
		rnAtendente.validarTipo(atendente);
		rnAtendente.alterar(atendente);

	}

	public void removerAtendente(Atendente atendente) {

		rnAtendente.remover(atendente);

	}

	public Atendente pesquisarPorIdAt(Serializable id) {

		return rnAtendente.pesquisarPorId(id);

	}

	public List<Atendente> getAllAt(){

		return rnAtendente.getAllAt();

	}


	//Cliente
	public void inserirCliente(Cliente cliente) throws Exception {

		rnCliente.validarCpf(cliente);
		rnCliente.validarData(cliente);
		rnCliente.validarEmail(cliente);
		rnCliente.validarLogin(cliente);
		rnCliente.validarNome(cliente);
		rnCliente.validarSenha(cliente);
		rnCliente.validarTelCel(cliente);
		rnCliente.validarTelRes(cliente);
		rnCliente.validarTipo(cliente);
		rnCliente.verificaDuplicidadeId(cliente);
		rnCliente.inserir(cliente);

	}

	public void alterarCliente(Cliente cliente) throws Exception {

		rnCliente.validarCpf(cliente);
		rnCliente.validarData(cliente);
		rnCliente.validarEmail(cliente);
		rnCliente.validarLogin(cliente);
		rnCliente.validarNome(cliente);
		rnCliente.validarSenha(cliente);
		rnCliente.validarTelCel(cliente);
		rnCliente.validarTelRes(cliente);
		rnCliente.validarTipo(cliente);
		rnCliente.alterar(cliente);

	}

	public void removerCliente(Cliente cliente) throws Exception {

		rnCliente.remover(cliente);

	}

	public Cliente pesquisarPorIdCli(Serializable id) throws Exception {

		return rnCliente.pesquisarPorId(id);

	}

	public List<Cliente> getAllCli(){

		return rnCliente.getAllCli();

	}

	//Endereco
	public void inserirEndereco(Endereco endereco) throws Exception {

		rnEndereco.validarBairro(endereco);
		rnEndereco.validarCidade(endereco);
		rnEndereco.validarEstado(endereco);
		rnEndereco.validarLogradouro(endereco);
		rnEndereco.validarNumero(endereco);
		rnEndereco.inserir(endereco);

	}

	public void alterarEndereco(Endereco endereco) throws Exception {

		rnEndereco.validarBairro(endereco);
		rnEndereco.validarCidade(endereco);
		rnEndereco.validarEstado(endereco);
		rnEndereco.validarLogradouro(endereco);
		rnEndereco.validarNumero(endereco);
		rnEndereco.alterar(endereco);

	}

	public void removerEndereco(Endereco endereco) {

		rnEndereco.remover(endereco);

	}

	public List<Endereco> getAllEnd(){

		return rnEndereco.getAllEnd();

	}

	//Designer
	public void inserirDesigner(Designer designer) throws Exception {

		rnDesigner.validarCpf(designer);
		rnDesigner.validarData(designer);
		rnDesigner.validarLogin(designer);
		rnDesigner.validarSenha(designer);
		rnDesigner.validarEmail(designer);
		rnDesigner.validarNome(designer);
		rnDesigner.validarTelCel(designer);
		rnDesigner.validarTelRes(designer);
		rnDesigner.validarTipo(designer);
		rnDesigner.verificaDuplicidade(designer);
		rnDesigner.inserir(designer);

	}

	public void alterarDesigner(Designer designer) throws Exception {

		rnDesigner.validarCpf(designer);
		rnDesigner.validarData(designer);
		rnDesigner.validarLogin(designer);
		rnDesigner.validarSenha(designer);
		rnDesigner.validarEmail(designer);
		rnDesigner.validarNome(designer);
		rnDesigner.validarTelCel(designer);
		rnDesigner.validarTelRes(designer);
		rnDesigner.validarTipo(designer);
		rnDesigner.alterar(designer);

	}

	public void removerDesigner(Designer designer) {

		rnDesigner.remover(designer);

	}

	public Designer pesquisarPorId(Serializable id) {

		return rnDesigner.pesquisarPorId(id);

	}
	
	public List<Designer> getAllDes(){

		return rnDesigner.getAllDes();

	}

	//Fornecedor
	public void inserirFornecedor(Fornecedor fornecedor) throws Exception {

		rnFornecedor.validarCnpj(fornecedor);
		rnFornecedor.validarEmail(fornecedor);
		rnFornecedor.validarRazaoSocial(fornecedor);
		rnFornecedor.validarTelCel(fornecedor);
		rnFornecedor.verificaDuplicidade(fornecedor);
		rnFornecedor.inserir(fornecedor);

	}

	public void alterarFornecedor(Fornecedor fornecedor) throws Exception {

		rnFornecedor.validarCnpj(fornecedor);
		rnFornecedor.validarEmail(fornecedor);
		rnFornecedor.validarRazaoSocial(fornecedor);
		rnFornecedor.validarTelCel(fornecedor);
		rnFornecedor.alterar(fornecedor);

	}

	public void removerFornecedor(Fornecedor fornecedor) {

		rnFornecedor.remover(fornecedor);

	}

	public Fornecedor pesquisarPorIdFor(Serializable id) {

		return rnFornecedor.pesquisarPorId(id);

	}
	
	public List<Fornecedor> getAllFor(){

		return rnFornecedor.getAllFor();

	}

	//Pagamento
	public void inserirPagamento(Pagamento pagamento) throws Exception {

		rnPagamento.validarForma(pagamento);
		rnPagamento.validarStatus(pagamento);
		rnPagamento.validarValorSerPago(pagamento);
		rnPagamento.verificaDuplicidade(pagamento);
		rnPagamento.inserir(pagamento);

	}

	public void alterarPagamento(Pagamento pagamento) throws Exception {

		rnPagamento.validarForma(pagamento);
		rnPagamento.validarStatus(pagamento);
		rnPagamento.validarValorSerPago(pagamento);
		rnPagamento.alterar(pagamento);

	}

	public void removerPagamento(Pagamento pagamento) {

		rnPagamento.remover(pagamento);

	}

	public Pagamento pesquisarPorIdPag(Serializable id) {

		return rnPagamento.pesquisarPorId(id);

	}
	
	public List<Pagamento> getAllPag(){

		return rnPagamento.getAllPag();

	}

	//Pedido
	public void inserirPedido(Pedido pedido) throws Exception {

		rnPedido.validarDataCompra(pedido);
		rnPedido.validarDataEntrega(pedido);
		rnPedido.validarQtdProduto(pedido);
		rnPedido.validarTipoServico(pedido);
		rnPedido.validarValorProduto(pedido);
		rnPedido.validarValorServico(pedido);
		rnPedido.verificaDuplicidade(pedido);
		rnPedido.inserir(pedido);

	}

	public void alterarDesigner(Pedido pedido) throws Exception {

		rnPedido.validarDataCompra(pedido);
		rnPedido.validarDataEntrega(pedido);
		rnPedido.validarQtdProduto(pedido);
		rnPedido.validarTipoServico(pedido);
		rnPedido.validarValorProduto(pedido);
		rnPedido.validarValorServico(pedido);
		rnPedido.alterar(pedido);

	}

	public void removerCliente(Pedido pedido) {

		rnPedido.remover(pedido);

	}

	public Pedido pesquisarPorIdPed(Serializable id) {

		return rnPedido.pesquisarPorId(id);

	}
	
	public List<Pedido> getAllPed(){

		return rnPedido.getAllPed();

	}

	//Produto
	public void inserirProduto(Produto produto) throws Exception {

		rnProduto.validarDescricao(produto);
		rnProduto.validarNome(produto);
		rnProduto.validarQtdEstoque(produto);
		rnProduto.validarUf(produto);
		rnProduto.verificaDuplicidade(produto);
		rnProduto.inserir(produto);

	}

	public void alterarProduto(Produto produto) throws Exception {

		rnProduto.validarDescricao(produto);
		rnProduto.validarNome(produto);
		rnProduto.validarQtdEstoque(produto);
		rnProduto.validarUf(produto);
		rnProduto.alterar(produto);

	}

	public void removerProduto(Produto produto) {

		rnProduto.remover(produto);

	}

	public Produto pesquisarPorIdProd(Serializable id) {

		return rnProduto.pesquisarPorId(id);

	}
	
	public List<Produto> getAllProd(){

		return rnProduto.getAllProd();

	}

	//Servico
	public void inserirServico(Servico servico) throws Exception {

		rnServico.validarStatus(servico);
		rnServico.validarTipoImpressao(servico);
		rnServico.verificaDuplicidade(servico);
		rnServico.inserir(servico);

	}

	public void alterarServico(Servico servico) throws Exception {

		rnServico.validarStatus(servico);
		rnServico.validarTipoImpressao(servico);
		rnServico.alterar(servico);

	}

	public void removerServico(Servico servico) {

		rnServico.remover(servico);

	}

	public Servico pesquisarPorIdServ(Serializable id) {

		return rnServico.pesquisarPorId(id);

	}
	
	public List<Servico> getAllServ(){

		return rnServico.getAllServ();

	}
}