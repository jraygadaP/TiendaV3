
package com.tienda.services;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    public List<Categoria> getCategorias (boolean activos);
    
    public Categoria getCategoria (Categoria categoria);
    
    public void delete (Categoria categoria);
    
    public void save(Categoria categoria);
    
}
