package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name= "factura")
public class Factura extends EntidadPersistente{
    @ManyToOne
    @JoinColumn(name="cliente_id",referencedColumnName = "id")
    private Usuario usuario;
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "total")
    private Float total;
    @ManyToOne
    @JoinColumn(name="vendedor_id",referencedColumnName = "id")
    private Vendedor vendedor;


}
