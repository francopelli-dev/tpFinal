package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoFinal extends EntidadPersistente{
    private String precioFinal;
    private Vendedor vendedor;
    private String url;
    private String textoAgregado;

}
