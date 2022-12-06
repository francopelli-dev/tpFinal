package com.tpFinal.tienda.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario extends EntidadPersistente {
    @Column(name= "usuario")
    private String usuario;
    @Column(name = "pwr")
    private String pwr;




}
