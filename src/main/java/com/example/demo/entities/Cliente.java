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
@Table(name = "Clientes")
public class Cliente {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	 	@Column(name = "idCliente")
	    private Long idCliente;

	    @Column(name = "nombre")
	    private String nombre;
	    
	    @Column(name = "activo")
	    private boolean activo;
	    
	    @OneToMany(mappedBy="listaCompra")
	    private Set<ListaCompra> listasCompra;

		public Long getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(Long idCliente) {
			this.idCliente = idCliente;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public boolean getActivo() {
			return activo;
		}

		public void setActivo(boolean activo) {
			this.activo = activo;
		}

		public Set<ListaCompra> getListasCompra() {
			return listasCompra;
		}

		public void setListasCompra(Set<ListaCompra> listasCompra) {
			this.listasCompra = listasCompra;
		}

}
