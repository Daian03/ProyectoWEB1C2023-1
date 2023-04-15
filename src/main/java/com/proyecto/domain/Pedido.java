package com.proyecto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="pedidos")
public class Pedido implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido")
    private Long idPedido;
    private String nombre;
    private String descripcion;
    private String fecha;
    private boolean descuento;
    private int total;
    private int estado;

    public Pedido(String nombre, String descripcion, String fecha, boolean descuento, int total, int estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.descuento = descuento;
        this.total = total;
        this.estado = 0;
    }

    public Pedido() {
    }
    
}
