package com.tienda.dao;

import com.tienda.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoDao extends JpaRepository<Producto, Long> {

    //Se define una consulta ampliada considerando los atributos
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Se define una consulta pero en sintaxis JPQL
    @Query(value="SELECT a FROM Producto a " 
            + "WHERE a.precio BETWEEN :precioInf and :precioSup "
            + "ORdER BY a.descripcion ASC")
    
    
    public List<Producto> consulta2 (double precioInf, double precioSup);
    
    //Se define una consulta pero en sintaxis sql
    @Query(nativeQuery = true, value="SELECT * FROM producto a " 
            + "WHERE a.precio BETWEEN :precioInf and :precioSup "
            + "ORdER BY a.descripcion ASC")
    
    
    public List<Producto> consulta3 (double precioInf, double precioSup);
    
    
    @Query(nativeQuery = true, value="SELECT * FROM producto a " 
            + "WHERE a.existencias BETWEEN :existenciaInf and :existenciaSup "
            + "ORDER BY a.descripcion ASC")
    
    
    public List<Producto> consultaExistencias (double existenciaInf, double existenciaSup);
    
}
