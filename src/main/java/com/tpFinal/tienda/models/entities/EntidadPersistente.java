package com.tpFinal.tienda.models.entities;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntidadPersistente {
    @Id
    @GeneratedValue
    @Getter
    private Integer id;
}
