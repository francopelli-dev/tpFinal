package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "prod_final")
public class ProductoFinal extends EntidadPersistente{
    @Column(name = "precio_final")
    private String precioFinal;
    @ManyToOne
    @JoinColumn(name = "vendedor_id", referencedColumnName = "id")

    private Vendedor vendedor;
    @Column(name = "url")
    private String url;
    @Column(name = "texto_agregado")
    private String textoAgregado;
    @ManyToOne
    @JoinColumn(name = "personalizacion",referencedColumnName = "id")
    private Personalizacion personalizacion;
    @ManyToOne
    @JoinColumn(name = "prod_base",referencedColumnName = "id")
    private ProductoBase productoBase;

}
