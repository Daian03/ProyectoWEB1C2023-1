package com.proyecto.domain;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "articulos")

public class Articulo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_articulo")
    private Long idArticulo;
    private String nombre;
    private String descripcion;
    private double precio;
    private String imagen;
    private boolean activo;

    public Articulo() {
    }

    public Articulo(String nombre, String descripcion, double precio, String imagen, boolean activo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.activo = activo;
    }
}
