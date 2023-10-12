package com.example.demo.entities;

public class ListaCompraDetallePK {
	
	  private Long idLista;
	  private Long idProducto;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idProducto ^ (idProducto >>> 32));
		result = prime * result + (int) (idLista ^ (idLista >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaCompraDetallePK other = (ListaCompraDetallePK) obj;
		if (idProducto != other.idProducto)
			return false;
		if (idLista != other.idLista)
			return false;
		return true;
	}
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
	  
	  

}
