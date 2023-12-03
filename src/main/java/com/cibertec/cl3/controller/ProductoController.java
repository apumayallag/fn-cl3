package com.cibertec.cl3.controller;

import com.cibertec.cl3.model.Producto;
import com.cibertec.cl3.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto) {
        return productoService.guardarProducto(producto);
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable("id") Long id, @RequestBody Producto producto) {
        producto.setId(id);
        return productoService.actualizarProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable("id") Long id) {
        productoService.eliminarProducto(id);
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable("id") Long id) {
        return productoService.obtenerProducto(id);
    }

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

}
