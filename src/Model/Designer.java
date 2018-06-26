package Model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="tb_designer")
public class Designer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_designer")
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
	@Column(length=8, nullable=false)
	private String tipo;

	@OneToMany(mappedBy="designers", fetch=FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Servico> servicos;
	
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

	public Collection<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(Collection<Servico> servicos) {
		this.servicos = servicos;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String getDataNasc() {
		return dataNasc;
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
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}