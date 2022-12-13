package com.tpFinal.tienda.repository;

import com.tpFinal.tienda.models.entities.ProductoFinal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestResource(path = "productosfinal")
public interface ProductoFRepository extends JpaRepository<ProductoFinal,Long> {


}
