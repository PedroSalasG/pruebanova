package com.prueba.detalle.service;

import java.util.List;

import com.prueba.detalle.entity.Detalle;
import com.prueba.detalle.entity.Producto;

public interface IDetalleService {
	
	public List<Detalle> listarDetalle();
	
	public Detalle findById(Long id,Integer cantidad);
	
	public Producto guardar(Producto producto);
	
	//jcortes@novasolutionsystems.com

}
