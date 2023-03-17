/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyectoWEB.service;

import com.proyectoWEB.domain.Clientes;
import java.util.List;


public interface ClientesService {
   public List<Clientes> getClientes();
   
   public void save(Clientes cliente);
   public void delete(Clientes cliente);
   public Clientes getCliente(Clientes cliente);
}
