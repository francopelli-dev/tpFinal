package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Collection;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="vendedor")
public class Vendedor extends EntidadPersistente{
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "balance")
    private Float balance;

    //private Set<String> medioDePago;
}
