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
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_producto")
    private Long idProducto;
    //private Long idCategoria; no se utiliza más por el @ManyToOne
    private String descripcion; 
    private String detalle; 
    private double precio;
    private int existencias;
    private String rutaImagen; 
    private boolean activo;  
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;
    

   
    
}

