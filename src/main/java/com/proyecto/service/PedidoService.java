package com.proyecto.service;

import com.proyecto.domain.Pedido;
import java.util.List;

public interface PedidoService {
   public List<Pedido> getPedidos();
   
   public void savePedido(Pedido pedido);
   public void deletePedido(Pedido pedido);
   public Pedido getPedido(Pedido pedido);
}
