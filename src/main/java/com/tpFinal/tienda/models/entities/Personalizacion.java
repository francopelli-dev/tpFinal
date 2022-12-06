package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Personalizacion extends EntidadPersistente {
    private String nombre;
    private String precio;
}
