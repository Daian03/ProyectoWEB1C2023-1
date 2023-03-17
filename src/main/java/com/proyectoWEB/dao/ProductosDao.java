
package com.proyectoWEB.dao;

import com.proyectoWEB.domain.Clientes;
import org.springframework.data.repository.CrudRepository;


public interface ProductosDao extends CrudRepository<Clientes, Long>{
    
}
