package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoBase extends EntidadPersistente {
    private String nombre;
    private String precioBase;
    private String descripcion;
    private String tiempoFabricacion;

}
