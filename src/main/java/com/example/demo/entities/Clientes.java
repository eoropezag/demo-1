package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Clientes {
	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	 	@Column(name = "idCliente")
	    private long idCliente;

	    @Column(name = "nombre")
	    private String nombre;
	    
	    @Column(name = "activo")
	    private boolean activo;

		public long getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(long idCliente) {
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
	    
	    

}
