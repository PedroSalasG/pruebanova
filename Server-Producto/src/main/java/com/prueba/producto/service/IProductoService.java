package com.prueba.producto.service;

import java.util.List;

import com.prueba.producto.entity.Producto;

public interface IProductoService {
	
	
	public List<Producto> listar();
	
	public Producto productoPorId(Long id);
	
	public Producto guardar(Producto producto);
	

}
