package com.prueba.producto.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.producto.entity.Producto;
import com.prueba.producto.service.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	IProductoService iprodService;
	
	@GetMapping("/listar")
	public List<Producto> mostrar(){
		return iprodService.listar();
	}
	
	@GetMapping("/listar/{id}")
	public Producto mostrarPorId(@PathVariable Long id){
		 return iprodService.productoPorId(id);
	}
	
	
	@PostMapping("/crearproducto")
	public Producto crearProducto(@RequestBody Producto producto){
		 return iprodService.guardar(producto);
	}
	
	
	
	
	
	
	
}
