/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;


import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Jose Raygada
 */


@Data //// Esto crea todo los metodos como set and gets para toda la clase de Producto
@Entity 
@Table(name="Producto")


public class Producto implements Serializable{
 
    private static final long serialVersionUID = 1l;
    
    @Id  /// Agregar este tag hace que el ID Producto sea la llave principal de la misma forma que es la llave principal en la tabla de squl que se creo en MySQL
    @GeneratedValue (strategy = GenerationType.IDENTITY) /// La estrategia para generar los valores de ID Producto van a ser identicos a los que se generan en la base de datos.
    
    @Column (name = "id_Producto")
    private Long idProducto;
    
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
}