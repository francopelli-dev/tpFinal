package com.tpFinal.tienda.DTO;

import com.tpFinal.tienda.models.entities.Usuario;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Usuario.class})
public interface UsuarioDTO {
    //String getNombre();
   // String getPwr();

}
