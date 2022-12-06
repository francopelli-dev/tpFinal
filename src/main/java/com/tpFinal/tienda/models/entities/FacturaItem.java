package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name ="factura_item")
public class FacturaItem extends EntidadPersistente {
    @ManyToOne
    @JoinColumn(name="factura_id",referencedColumnName = "id")
    private Factura factura;

    @OneToOne
    private ProductoFinal productoFinal;
    @Column (name = "cantidad")
    private int cantidad;
    @Column (name="subtotal")
    private Float subTotal;

}
