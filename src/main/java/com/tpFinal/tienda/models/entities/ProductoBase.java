package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name="prod_base")
public class ProductoBase extends EntidadPersistente {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "precio_base")
    private Double precioBase;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "tiempo_fabricacion")
    private String tiempoFabricacion;
    @Column(name = "img")
    private String url;

    public ProductoBase() {
    }
    public Long getResourceId(){
        return getId();
    }
    public ProductoBase(String nombre, Double precioBase, String descripcion, String tiempoFabricacion, String url) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.descripcion = descripcion;
        this.tiempoFabricacion = tiempoFabricacion;
        this.url = url;
    }
}
