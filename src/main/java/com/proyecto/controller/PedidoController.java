package com.proyecto.controller;

import com.proyecto.domain.Pedido;
import com.proyecto.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var pedidos = pedidoService.getPedidos();
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("totalPedidos", pedidos.size());

        return "/pedido/listado";
    }

    @GetMapping("/nuevo")
    public String nuevoPedido(Pedido pedido) {
        return "/pedido/modifica";
    }

    @GetMapping("/eliminar/{idPedido}")
    public String eliminaPedido(Pedido pedido) {
        pedidoService.deletePedido(pedido);
        return "redirect:/pedido/listado";
    }
}
