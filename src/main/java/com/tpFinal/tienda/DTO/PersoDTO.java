package com.tpFinal.tienda.DTO;

import com.tpFinal.tienda.models.entities.Personalizacion;
import org.springframework.data.rest.core.config.Projection;

@Projection(types={Personalizacion.class})
public interface PersoDTO {
}
