package com.tpFinal.tienda.repository;


import com.tpFinal.tienda.models.entities.ProductoBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="productosbase")
public interface ProductoBRepository extends JpaRepository<ProductoBase,Long> {
    ProductoBase findByNombre(@Param("nombre") String nombre);


}
