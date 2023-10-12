package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.ListaCompraDetalle;
import com.example.demo.entities.ListaCompraDetallePK;

public interface ListaComprasDetalleRepository  extends JpaRepository<ListaCompraDetalle, ListaCompraDetallePK>{

}
