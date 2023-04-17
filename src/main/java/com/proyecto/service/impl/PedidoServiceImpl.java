package com.proyecto.service.impl;

import com.proyecto.dao.PedidoDao;
import com.proyecto.domain.Pedido;
import com.proyecto.service.PedidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoDao pedidoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pedido> getPedidos() {
        return (List<Pedido>) pedidoDao.findAll();
    }

    @Override
    @Transactional
    public void savePedido(Pedido pedido) {
        pedidoDao.save(pedido);
    }

    @Override
    @Transactional
    public void deletePedido(Pedido pedido) {
        pedidoDao.delete(pedido);
    }

    @Transactional(readOnly = true)
    @Override
    public Pedido getPedido(Pedido pedido) {
        return pedido;
    }
}

