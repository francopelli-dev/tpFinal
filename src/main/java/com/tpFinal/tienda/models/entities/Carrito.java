package com.tpFinal.tienda.models.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date; // chequear esto
import java.util.Collection;

@Getter
@Setter
@Entity
@Table(name = "carrito")
public class Carrito extends EntidadPersistente{
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    @JsonBackReference
    private Usuario usuario;
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "activo")
    private boolean activo = true;
    @Column(name= "total")
    private Double total = 0D;

    public Long getResourceId(){
        return getId();
    }
    public Long getUsuarioId(){
        return usuario.getId();
    }
    public void sumarTotal(Double i){
        this.total += i;
    }

    @ManyToMany
    private Collection<ProductoFinal> productos;

    public void addProd(ProductoFinal prod){
        productos.add(prod);
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
