package Model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="tb_endereco")
public class Endereco {
	
	@Column(length=25, nullable=false)
	private String logradouro;  //Exemplo: Rua
	@Column(length=4)
	private int numero;
	@Column(length=80, nullable=false)
	private String bairro;
	@Column(length=80, nullable=false)
	private String cidade;
	@Column(length=50, nullable=false)
	private String estado;
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
}