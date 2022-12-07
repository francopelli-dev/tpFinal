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
    @Column(name = "pwr")
    private String pwr;
    @Column(name = "balance")
    private Float balance;

    public Vendedor(String usuario, String pwr, Float balance) {
        this.usuario = usuario;
        this.pwr = pwr;
        this.balance = balance;
    }
    public Vendedor() {

    }

    //private Set<String> medioDePago;
}
