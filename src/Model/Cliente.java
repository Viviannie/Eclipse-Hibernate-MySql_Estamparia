package Model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="tb_cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cliente")
	private int id;
	@Column(length=8, nullable=false)
	private String senha;
	@Column(length=15, nullable=false)
	private String login;	
	@Column(length=50, nullable=false)
	private String nome;
	@Column(length=14, nullable=false)
	private String cpf;
	@Column(length=10)
	private String dataNasc;
	@Column(length=13)
	private String telRes;
	@Column(length=14)
	private String telCel;
	@Column(length=30, nullable=false)
	private String email;
	@Column(length=7, nullable=false)
	private String tipo;

	@Embedded
	public Endereco endereco;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_atendente", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Atendente atendentes;
	
	@OneToMany(mappedBy="clientes", fetch=FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Pagamento> pagamentos;
	
	@OneToMany(mappedBy="clientes", fetch=FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Pedido> pedidos;
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Atendente getAtendentes() {
		return atendentes;
	}

	public void setAtendentes(Atendente atendentes) {
		this.atendentes = atendentes;
	}

	public Collection<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(Collection<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}

	public Collection<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Collection<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	/*public void setDataNasc(int dia, int mes, int ano) {
	Calendar c = Calendar.getInstance();
	c.set(Calendar.YEAR, ano);
	c.set(Calendar.MONTH, mes);
	c.set(Calendar.DAY_OF_MONTH, dia);
	this.dataNasc = c;
	}*/

	public String getTelRes() {
		return telRes;
	}

	public void setTelRes(String telRes) {
		this.telRes = telRes;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}