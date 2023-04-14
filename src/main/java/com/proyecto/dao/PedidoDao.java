package com.proyecto.dao;

import com.proyecto.domain.Pedido;
import org.springframework.data.repository.CrudRepository;


public interface PedidoDao extends CrudRepository<Pedido, Long>{
    
}
