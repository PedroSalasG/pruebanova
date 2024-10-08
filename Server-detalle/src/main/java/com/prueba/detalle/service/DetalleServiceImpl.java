package com.prueba.detalle.service;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.detalle.clients.DetalleFeignClient;
import com.prueba.detalle.entity.Detalle;
import com.prueba.detalle.entity.Producto;
@Service
public class DetalleServiceImpl implements IDetalleService {

	
	@Autowired
	DetalleFeignClient feignClient;
	
	@Override
	public List<Detalle> listarDetalle() {
		return feignClient.listar().stream().map(detalle->new Detalle(detalle,1)).collect(Collectors.toList());
	}

	@Override
	public Detalle findById(Long id, Integer cantidad) {
		
		return new Detalle(feignClient.productoPorId(id),cantidad);
	}

	@Override
	public Producto guardar(Producto producto) {
		return feignClient.guardar(producto);
	}

	

	

}
