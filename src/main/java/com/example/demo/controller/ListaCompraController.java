package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ListaCompra;
import com.example.demo.service.ListaComprasService;

@RestController
public class ListaCompraController {

	@Autowired
    private ListaComprasService listaComprasService;
	
	 @PostMapping("/listaCompra")
	    public ResponseEntity < ListaCompra > createProduct(@RequestBody ListaCompra listaCompra) {
	        return ResponseEntity.ok().body(this.listaComprasService.crearLista(listaCompra));
	    }
}
