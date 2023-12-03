package com.cibertec.cl3.service;

import com.cibertec.cl3.model.Producto;

import java.util.List;

public interface ProductoService {

    Producto guardarProducto(Producto producto);
    Producto actualizarProducto(Producto producto);
    void eliminarProducto(Long id);
    Producto obtenerProducto(Long id);
    List<Producto> listarProductos();
}
