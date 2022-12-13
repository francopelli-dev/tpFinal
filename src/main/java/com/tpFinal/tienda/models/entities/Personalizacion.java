package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "personalizacion")
public class Personalizacion extends EntidadPersistente {
    @Column(name="tipo")
    private String tipo;
    @Column(name ="precio")
    private Double precio;

    public Long getResourceId(){
        return getId();
    }
}
