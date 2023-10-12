package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ClientesRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ClientesService {
	
	 @Autowired
	 private ClientesRepository clientesRepository;

}
