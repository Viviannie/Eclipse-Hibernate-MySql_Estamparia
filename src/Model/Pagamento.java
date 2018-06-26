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
@Table(name="tb_pagamento")
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pagamento")
	private int id;
	@Column(length=20)
	private String forma;
	@Column(precision=8, scale=2, nullable=false)
	private double valorSerPago;
	@Column(length=8)
	private String status;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="id_cliente", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Cliente clientes;
	
	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getForma() {
		return forma;
	}
	
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	public double getValorSerPago() {
		return valorSerPago;
	}
	
	public void setValorSerPago(double valorSerPago) {
		this.valorSerPago = valorSerPago;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}