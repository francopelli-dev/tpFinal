package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table
public class CarritoProducto extends EntidadPersistente{
    @ManyToOne
    @JoinColumn(name="carrito_id",referencedColumnName = "id")
    private Carrito carrito;
    @ManyToOne
    @JoinColumn(name="prod_final_id",referencedColumnName = "id")
    private ProductoFinal prodFinal;
}
