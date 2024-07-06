package com.distribuidas.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "pedidos")
public class Pedidos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedidos")
	private int idPedidos;
	@Column(name = "FechaPedido")
	private Date FechaPedido;
	@Column(name = "Total")
	private Double Total;
	
	
	
	@JoinColumn(name = "provedores")
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private Provedores provedores;
	
	@JoinColumn(name = "clientes")
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private Cliente cliente;
	
	@JoinColumn(name = "sucursales")
	@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	private Sucursales sucursales;
	
	public Pedidos() {}

	public Pedidos(int idPedidos, Date fechaPedido, Double total, Provedores provedores, Cliente cliente,
			Sucursales sucursales) {
		this.idPedidos = idPedidos;
		FechaPedido = fechaPedido;
		Total = total;
		this.provedores = provedores;
		this.cliente = cliente;
		this.sucursales = sucursales;
	}

	public int getIdPedidos() {
		return idPedidos;
	}

	public void setIdPedidos(int idPedidos) {
		this.idPedidos = idPedidos;
	}

	public Date getFechaPedido() {
		return FechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		FechaPedido = fechaPedido;
	}

	public Double getTotal() {
		return Total;
	}

	public void setTotal(Double total) {
		Total = total;
	}

	public Provedores getProvedores() {
		return provedores;
	}

	public void setProvedores(Provedores provedores) {
		this.provedores = provedores;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Sucursales getSucursales() {
		return sucursales;
	}

	public void setSucursales(Sucursales sucursales) {
		this.sucursales = sucursales;
	}

	@Override
	public String toString() {
		return "Pedidos [idPedidos=" + idPedidos + ", FechaPedido=" + FechaPedido + ", Total=" + Total + ", provedores="
				+ provedores + ", cliente=" + cliente + ", sucursales=" + sucursales + "]";
	}

	
	
	
	
	
}
