package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ListaCompraDetalle")
@IdClass(value = ListaCompraDetallePK.class)
public class ListaCompraDetalle {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idListaCompra")
    private long idListaCompra;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codigoProducto")
    private long codigoProducto;
	
	@OneToMany
    @JoinColumn(name="idLista", nullable=false)
	 private long idLista;
	
	@ManyToOne
    @JoinColumn(name="idProducto", nullable=false)
	 private long idProducto;

    @Column(name = "cantidad")
    private int cantidad;

	public long getIdListaCompra() {
		return idListaCompra;
	}

	public void setIdListaCompra(long idListaCompra) {
		this.idListaCompra = idListaCompra;
	}

	public long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public long getIdLista() {
		return idLista;
	}

	public void setIdLista(long idLista) {
		this.idLista = idLista;
	}

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
   
}
