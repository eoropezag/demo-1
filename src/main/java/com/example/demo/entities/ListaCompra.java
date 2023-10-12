package com.example.demo.entities;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ListaCompra")
public class ListaCompra {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idLista")
    private Long idLista;
	
	@ManyToOne
    //@JoinColumn(name="idCliente", nullable=false)
	 private Cliente cliente;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fechaRegistro")
    private Date fechaRegistro;
    
    @Column(name = "fechaUltimaActualizacion")
    private Date fechaUltimaActualizacion;

    @Column(name = "activo")
    private boolean activo;
    
    @OneToMany(mappedBy="listaCompra")
    private Set<ListaCompraDetalle> listasCompraDetalle;

	public Long getIdLista() {
		return idLista;
	}

	public void setIdLista(Long idLista) {
		this.idLista = idLista;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}

	public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
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
