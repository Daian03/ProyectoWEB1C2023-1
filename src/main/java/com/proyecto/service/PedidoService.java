/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.service;

import com.proyecto.domain.Pedido;
import java.util.List;

/**
 *
 * @author candr
 */
public interface PedidoService {
   public List<Pedido> getPedidos();
   
   public void savePedido(Pedido pedido);
   public void deletePedido(Pedido pedido);
   public Pedido getPedido(Pedido pedido);
}
