package Model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_produto")
	private int id;
	@Column(length=50)
	private String nome;
	@Column(length=2)
	private String uf;
	@Column(length=40)
	private String descricao;
	@Column(length=3)
	private int qtdEstoque;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_pedido", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Pedido pedidos;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="Produto_Fornecedor", schema="anotacoes",
		       joinColumns=@JoinColumn(name="id_produto"),
		       inverseJoinColumns=@JoinColumn(name="id_fornecedor"))
	private Collection<Fornecedor> fornecedores;
	
	public Pedido getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}

	public Collection<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Collection<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
}