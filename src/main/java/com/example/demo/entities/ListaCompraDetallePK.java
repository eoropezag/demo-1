package com.example.demo.entities;

public class ListaCompraDetallePK {
	
	  private long idListaCompra;
	  private long codigoProducto;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigoProducto ^ (codigoProducto >>> 32));
		result = prime * result + (int) (idListaCompra ^ (idListaCompra >>> 32));
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
		if (codigoProducto != other.codigoProducto)
			return false;
		if (idListaCompra != other.idListaCompra)
			return false;
		return true;
	}
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
	  
	  

}
