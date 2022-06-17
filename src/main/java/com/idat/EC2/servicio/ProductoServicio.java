package com.idat.EC2.servicio;

import java.util.List;

import com.idat.EC2.DTO.ProductoDTORequest;
import com.idat.EC2.DTO.ProductoDTOResponse;



public interface ProductoServicio {

	public void guardarProducto(ProductoDTORequest producto);
	public void editarProducto(ProductoDTORequest producto);
	
	public void eliminarProducto(Integer id);
	
	public List<ProductoDTOResponse> listarProductos();
	public ProductoDTOResponse obtenerProductoId(Integer id);
}
