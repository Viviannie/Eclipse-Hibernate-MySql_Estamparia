package Model;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="tb_pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pedido")
	private int id;
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Calendar dataCompra;
	@Temporal(TemporalType.DATE)
	@Column(nullable=false)
	private Calendar dataEntrega;
	@Column(precision=8, scale=2, nullable=false)
	private double valorProduto;
	@Column(precision=8, scale=2, nullable=false)
	private double valorServico;
	@Column(length=3)
	private int qtdProduto;
	@Column(length=30)
	private String tipoServico;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_cliente", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Cliente clientes;
	
	@OneToMany(mappedBy="pedidos", fetch=FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Servico> servicos;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_servico", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Designer designers;
	
	@OneToMany(mappedBy="pedidos", fetch=FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Produto> produtos;
	
	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	public Collection<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(Collection<Servico> servicos) {
		this.servicos = servicos;
	}

	public Designer getDesigners() {
		return designers;
	}

	public void setDesigners(Designer designers) {
		this.designers = designers;
	}

	public Collection<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}

	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Calendar getDataCompra() {
		return dataCompra;
	}
	
	public void setDataCompra(int dia, int mes, int ano) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, ano);
		c.set(Calendar.MONTH, mes);
		c.set(Calendar.DAY_OF_MONTH, dia);
		this.dataCompra = c;
	}
	
	public Calendar getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(int dia, int mes, int ano) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, ano);
		c.set(Calendar.MONTH, mes);
		c.set(Calendar.DAY_OF_MONTH, dia);
		this.dataEntrega = c;
	}
	
	public double getValorProduto() {
		return valorProduto;
	}
	
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	
	public double getValorServico() {
		return valorServico;
	}
	
	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}
	
	public int getQtdProduto() {
		return qtdProduto;
	}
	
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	
	public String getTipoServico() {
		return tipoServico;
	}
	
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}	
}