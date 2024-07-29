 package com.tienda.services.impl;

import com.tienda.dao.ProductoDao;
import com.tienda.domain.Producto;
import com.tienda.services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl
        implements ProductoService {
//// Programación Producto

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();

        if (activos) {
            lista.removeIf(c -> !c.isActivo());
        }

        return lista;
    }

    @Override
    @Transactional(readOnly=true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Producto> consulta1(double precioInf, double precioSup) {
        return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Producto> consulta2(double precioInf, double precioSup) {
        return productoDao.consulta2(precioInf, precioSup);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Producto> consulta3(double precioInf, double precioSup) {
        return productoDao.consulta3(precioInf, precioSup);
    }

    @Override
    public List<Producto> consultaExistencias(double precioInf, double precioSup) {
        return productoDao.consultaExistencias(precioInf, precioSup);
    }
}
