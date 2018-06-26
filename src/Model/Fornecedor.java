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
import javax.persistence.Table;

@Entity
@Table(name="tb_fornecedor")
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_fornecedor")
	private int id;
	@Column(length=18, nullable=false)
	private String cnpj;
	@Column(length=30, nullable=false)
	private String razaoSocial; //Nome fantasia.
	@Column(length=14)
	private String telCel;
	@Column(length=30, nullable=false)
	private String email;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="Produto_Fornecedor", schema="anotacoes",
		       joinColumns=@JoinColumn(name="id_fornecedor"),
		       inverseJoinColumns=@JoinColumn(name="id_produto"))
	private Collection<Produto> produtos;
	
	public Collection<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getTelCel() {
		return telCel;
	}

	public void setTelCel(String telCel) {
		this.telCel = telCel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}