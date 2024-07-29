
package com.tienda.services;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    public List<Producto> getProductos (boolean activos);
    
    public Producto getProducto (Producto producto);
    
    public void delete (Producto producto);
    
    public void save(Producto producto);
    
    // Se utiliza la consulta 1, consulta ampliada
    
    public List<Producto> consulta1 (double precioInf, double precioSup);
    
    // Se utiliza la consulta 2, consulta JPQL
    
    public List<Producto> consulta2 (double precioInf, double precioSup);
    
    // Se utiliza la consulta 3, consulta SQL
    
    public List<Producto> consulta3 (double precioInf, double precioSup);
    
    
    public List<Producto> consultaExistencias (double precioInf, double precioSup);
}
