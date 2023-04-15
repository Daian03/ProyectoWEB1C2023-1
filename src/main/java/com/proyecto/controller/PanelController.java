package com.proyecto.controller;

import com.proyecto.domain.Pedido;
import com.proyecto.service.PedidoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/panel")

public class PanelController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/panel")
    public String inicio(Model model) {
        var pedidos = pedidoService.getPedidos();
        model.addAttribute("pedidos", pedidos);
        return "/panel/panel";
    }

    @PostMapping("/guardarEstado")
    public String guardarPedido(Pedido pedido, Model model) {
        pedido = pedidoService.getPedido(pedido);
        model.addAttribute("pedido", pedido);
        pedidoService.savePedido(pedido);
        return "redirect:/panel/panel";
    }

    @PostMapping("/eliminar")
    public String eliminar(Pedido pedido, Model model) {
        pedido = pedidoService.getPedido(pedido);
        model.addAttribute("pedido", pedido);
        pedidoService.deletePedido(pedido);
        return "redirect:/panel/panel";
    }
}
