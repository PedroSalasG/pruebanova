package com.prueba.producto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.producto.entity.Producto;
import com.prueba.producto.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	
	@Autowired
	ProductoRepository prodRepo;
	
	@Override
	public List<Producto> listar() {
		return (List<Producto>) prodRepo.findAll();
	}

	@Override
	public Producto productoPorId(Long id) {
		return prodRepo.findById(id).orElse(null);
	}

	@Override
	public Producto guardar(Producto producto) {
		return prodRepo.save(producto);
	}



}
