package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="tb_servico")
public class Servico {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_servico")
	private int id;
	@Column(length=30)
	private String tipoImpressao;
	@Column(length=6)
	private String status;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_pedido", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Pedido pedidos;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_designer", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Designer designers;
	
	public Pedido getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedido pedidos) {
		this.pedidos = pedidos;
	}

	public Designer getDesigners() {
		return designers;
	}

	public void setDesigners(Designer designers) {
		this.designers = designers;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTipoImpressao() {
		return tipoImpressao;
	}
	
	public void setTipoImpressao(String tipoImpressao) {
		this.tipoImpressao = tipoImpressao;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}	
}
