
package com.proyectoWEB.dao;

import com.proyectoWEB.domain.Clientes;
import org.springframework.data.repository.CrudRepository;


public interface ClientesDao extends CrudRepository<Clientes, Long>{
    
}
