package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FacturaItem extends EntidadPersistente {
    private Factura factura;
    private ProductoFinal productoFinal;
}
