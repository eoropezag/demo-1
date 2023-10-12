package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ListaCompraDetalle")
@IdClass(value = ListaCompraDetallePK.class)
public class ListaCompraDetalle {
	
    @Id
    @ManyToOne
    @JoinColumn(name="idLista", nullable=false)
	private ListaCompra listaCompra;
	
    @Id
	@ManyToOne
    @JoinColumn(name="idProducto", nullable=false)
	 private Producto producto;

    @Column(name = "cantidad")
    private int cantidad;

    
	public ListaCompra getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(ListaCompra listaCompra) {
		this.listaCompra = listaCompra;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
   
}
