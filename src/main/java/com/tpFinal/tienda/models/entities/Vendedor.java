package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Set;

@Getter
@Setter
public class Vendedor extends EntidadPersistente{
    private String usuario;
    private String balance;
    private Set<String> medioDePago;
}
