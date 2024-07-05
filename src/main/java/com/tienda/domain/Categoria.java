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


@Data //// Esto crea todo los metodos como set and gets para toda la clase de categoria
@Entity 
@Table(name="categoria")


public class Categoria implements Serializable{
 
    private static final long serialVersionUID = 1l;
    
    @Id  /// Agregar este tag hace que el ID categoria sea la llave principal de la misma forma que es la llave principal en la tabla de squl que se creo en MySQL
    @GeneratedValue (strategy = GenerationType.IDENTITY) /// La estrategia para generar los valores de ID categoria van a ser identicos a los que se generan en la base de datos.
    
    @Column (name = "id_categoria")
    private Long idCategoria;
    
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
}
