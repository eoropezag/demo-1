package com.example.demo.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Productos")
public class Producto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idProducto")
    private Long idProducto;

    @Column(name = "clave")
    private String clave;
    
    @Column(name = "descripcion")
    private String descripcion;    
    
    @Column(name = "activo")
    private boolean activo;
    
    @OneToMany(mappedBy="listaCompra")
    private Set<ListaCompraDetalle> listasCompraDetalle;

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Set<ListaCompraDetalle> getListasCompraDetalle() {
		return listasCompraDetalle;
	}

	public void setListasCompraDetalle(Set<ListaCompraDetalle> listasCompraDetalle) {
		this.listasCompraDetalle = listasCompraDetalle;
	}

}
