package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long>  {

}
