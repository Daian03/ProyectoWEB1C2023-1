package com.proyectoWEB.controller;

import com.proyectoWEB.domain.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.proyectoWEB.service.ClientesService;

@Controller
@RequestMapping("/cliente")

public class ProductosController {

    @Autowired
    private ClientesService clienteService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);
        return "/cliente/listado";
    }

    @GetMapping("/nuevo")
    public String nuevoCliente(Clientes cliente) {
        return "/cliente/modifica";
    }

    @PostMapping("/guardarCliente")
    public String guardarCliente(Clientes cliente) {
        clienteService.save(cliente);
        return "redirect:/cliente/listado";
    }

    @GetMapping("/elimina/{idCliente}")
    public String modificarCliente(Clientes cliente) {
        clienteService.delete(cliente);
        return "redirect:/cliente/listado";
    }

    @GetMapping("/modifica/{idCliente}")
    public String modificarCliente(Clientes cliente, Model model) {
        cliente = clienteService.getCliente(cliente);
        model.addAttribute("cliente", cliente);
        return "/cliente/modifica";
    }

}
