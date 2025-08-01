package com.personal.hexagonal.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Producto {
    
    private Long id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private Integer stock;
    private String categoria;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    private boolean activo;
    
    // Constructor vacío
    public Producto() {
        this.fechaCreacion = LocalDateTime.now();
        this.fechaActualizacion = LocalDateTime.now();
        this.activo = true;
    }
    
    // Constructor con parámetros
    public Producto(String nombre, String descripcion, BigDecimal precio, Integer stock, String categoria) {
        this();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }
    
    // Métodos de negocio
    public void reducirStock(Integer cantidad) {
        if (cantidad > this.stock) {
            throw new IllegalArgumentException("No hay suficiente stock disponible");
        }
        this.stock -= cantidad;
        this.fechaActualizacion = LocalDateTime.now();
    }
    
    public void aumentarStock(Integer cantidad) {
        this.stock += cantidad;
        this.fechaActualizacion = LocalDateTime.now();
    }
    
    public boolean tieneStock() {
        return this.stock > 0;
    }
    
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", categoria='" + categoria + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                ", activo=" + activo +
                '}';
    }
}
