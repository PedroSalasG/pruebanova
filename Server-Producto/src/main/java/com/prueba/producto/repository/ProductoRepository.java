package com.prueba.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.producto.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
