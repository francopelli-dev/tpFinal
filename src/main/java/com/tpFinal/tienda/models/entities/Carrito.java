package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date; // chequear esto

@Getter
@Setter
public class Carrito extends EntidadPersistente{
    private Usuario usuario;
    private Date fechaInicio;
    private String estado;
}
