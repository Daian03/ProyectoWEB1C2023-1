
package com.proyectoWEB.dao;

import com.proyectoWEB.domain.Clientes;
import org.springframework.data.repository.CrudRepository;


public interface UsuariosDao extends CrudRepository<Clientes, Long>{
    
}
