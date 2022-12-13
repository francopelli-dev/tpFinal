package com.tpFinal.tienda.repository;

import com.tpFinal.tienda.models.entities.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "carritos")
public interface CarritoRepo extends JpaRepository<Carrito,Long> {

}
