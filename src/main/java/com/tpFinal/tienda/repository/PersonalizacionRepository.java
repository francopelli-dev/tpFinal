package com.tpFinal.tienda.repository;

import com.tpFinal.tienda.models.entities.Personalizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "personalizaciones")
public interface PersonalizacionRepository extends JpaRepository<Personalizacion,Long> {
}
