
package com.tienda.services.impl;

import com.tienda.dao.ProductoDao;
import com.tienda.domain.Producto;
import com.tienda.services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
public class ProductoServiceImpl
            implements ProductoService{
//// Programación Producto
    
    @Autowired
    private ProductoDao productoDao;
    
    @Override
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        
        if (activos) {
        lista.removeIf(c -> !c.isActivo());
        }
        
        return lista; 
    }

    @Override
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    public void save(Producto producto) {
        productoDao.save(producto);
    }
    
}
