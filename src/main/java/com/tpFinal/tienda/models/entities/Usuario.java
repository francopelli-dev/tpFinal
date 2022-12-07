package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario extends EntidadPersistente {
    @Column(name= "usuario")
    private String usuario;
    @Column(name = "pwr")
    private String pwr;

    public Usuario() {

    }
    public Usuario(String usuario, String pwr) {
        this.usuario = usuario;
        this.pwr = pwr;
    }
}
