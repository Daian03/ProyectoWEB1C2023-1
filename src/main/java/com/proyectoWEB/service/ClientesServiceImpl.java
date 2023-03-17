/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoWEB.service;

import com.proyectoWEB.domain.Clientes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.proyectoWEB.dao.ClientesDao;

@Service
public class ClientesServiceImpl implements ClientesService {
    
    @Autowired
    private ClientesDao clienteDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Clientes> getClientes() {
        return (List<Clientes>) clienteDao.findAll();
    }
    
    @Override
    @Transactional
    public void save(Clientes cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional
    public void delete(Clientes cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Clientes getCliente(Clientes cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    } 
}
