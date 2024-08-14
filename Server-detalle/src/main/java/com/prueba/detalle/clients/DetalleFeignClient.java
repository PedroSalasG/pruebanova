package com.prueba.detalle.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.prueba.detalle.entity.Producto;

@FeignClient("servicio-productos")
public interface DetalleFeignClient {
	
	@GetMapping("/listar")
	public List<Producto> listar();
	
	@GetMapping("/listar/{id}")
	public Producto productoPorId(@PathVariable Long id);
	
	@PostMapping("/crearproducto")
	public Producto guardar(Producto producto);

}
