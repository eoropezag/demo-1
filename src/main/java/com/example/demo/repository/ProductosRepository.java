package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Long>{

}
