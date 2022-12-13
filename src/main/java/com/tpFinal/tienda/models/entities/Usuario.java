package com.tpFinal.tienda.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario extends EntidadPersistente {
    @Column(name= "usuario")
    private String usuario;

    @Column(name = "pwr")
    @JsonIgnore
    private String pwr;

    @OneToMany()//mappedBy = "usuario"
    @JoinColumn(name="carrito_id", referencedColumnName = "id")
    //@JsonManagedReference

    private Collection<Carrito> compras;

    public Usuario() {

    }
    public Usuario(String usuario, String pwr) {
        this.usuario = usuario;
        this.pwr = pwr;
    }
    public void addCarrito(Carrito carrito) {
        compras.add(carrito);
    }
}
