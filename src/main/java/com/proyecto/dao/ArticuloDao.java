package com.proyecto.dao;

import com.proyecto.domain.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloDao extends JpaRepository<Articulo, Long>{
    
}
