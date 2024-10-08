package com.prueba.detalle.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.detalle.entity.Detalle;
import com.prueba.detalle.entity.Producto;
import com.prueba.detalle.service.IDetalleService;

@RestController
public class DetalleController {
	
	@Autowired
	IDetalleService detalleService;
	
	@GetMapping("/listardetalle")
	public List<Detalle> mostrar(){
		return detalleService.listarDetalle();
	}

	@GetMapping("/detalle/{id}/cantidad/{cantidad}")
	public Detalle mostrardetalle(@PathVariable Long id,@PathVariable Integer cantidad ){
		return detalleService.findById(id, cantidad);
	}

	
	@PostMapping("/detalle/crearproducto")
	public Producto crearProducto(@RequestBody Producto producto){
		 return detalleService.guardar(producto);
	}
	
	
	

}
