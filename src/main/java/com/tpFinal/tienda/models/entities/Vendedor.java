package com.tpFinal.tienda.models.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collection;

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
    private Double balance;
    @OneToMany(mappedBy = "vendedor")
    @JsonManagedReference
    private Collection<ProductoFinal> productos = new ArrayList<ProductoFinal>();;




    public Vendedor(String usuario, String pwr, Double balance) {
        this.usuario = usuario;
        this.pwr = pwr;
        this.balance = balance;
    }
    public Vendedor() {
        super();

    }

    public void addProducto(ProductoFinal prod) {
        productos.add(prod);
    }
    public Long getResourceId(){
        return getId();
    }

    //private Set<String> medioDePago;
}
