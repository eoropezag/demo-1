package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ListaCompra;
import com.example.demo.repository.ListaCompraRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ListaCompraService {
	
	 @Autowired
	 private ListaCompraRepository listaComprasRepository;
	 
	 @Transactional
		public ListaCompra crearLista(ListaCompra listaCompra) {
		 
		 return listaComprasRepository.save(listaCompra);
			
		}

}
