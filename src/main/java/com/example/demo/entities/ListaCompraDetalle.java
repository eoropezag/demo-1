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
	 private Long idLista;
	
    @Id
	@ManyToOne
    @JoinColumn(name="idProducto", nullable=false)
	 private Long idProducto;

    @Column(name = "cantidad")
    private int cantidad;


	public Long getIdLista() {
		return idLista;
	}

	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
   
}
