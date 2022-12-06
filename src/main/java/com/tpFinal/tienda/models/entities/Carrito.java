package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date; // chequear esto

@Getter
@Setter
@Entity
@Table(name = "carrito")
public class Carrito extends EntidadPersistente{
    @ManyToOne
    @JoinColumn(name="usuario_id",referencedColumnName = "id")
    private Usuario usuario;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "estado")
    private String estado;
    @Column(name= "total")
    private Float total;
}
