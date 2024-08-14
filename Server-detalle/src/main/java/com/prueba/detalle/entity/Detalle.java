package com.prueba.detalle.entity;

public class Detalle {

	private Producto producto;
	private Integer cantidad;
	
	
	public Detalle() {
	}


	public Detalle(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public Double getTotal() {
		return cantidad.doubleValue()*producto.getPrecio();
		
	}
	
	
	

}
