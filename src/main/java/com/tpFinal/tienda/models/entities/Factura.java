package com.tpFinal.tienda.models.entities;

import lombok.Getter;

import java.sql.Date;
@Getter
public class Factura extends EntidadPersistente{

    private Usuario usuario;

    private Date fecha;
    private Float Total;
}
