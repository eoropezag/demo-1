package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ListaCompra;
import com.example.demo.repository.ListaComprasRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ListaComprasService {
	
	 @Autowired
	 private ListaComprasRepository listaComprasRepository;
	 
	 @Transactional
		public ListaCompra crearLista(ListaCompra listaCompra) {
		 
		 return listaComprasRepository.save(listaCompra);
			
		}

}
