package com.tpFinal.tienda.repository;

import com.tpFinal.tienda.models.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.hateoas.server.ExposesResourceFor;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "usuarios")
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
