package com.tpFinal.tienda.repository;

import com.tpFinal.tienda.models.entities.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "vendedores")
public interface VendedorRepository extends JpaRepository<Vendedor,Long> {

}
