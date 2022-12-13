package com.tpFinal.tienda.DTO;

import com.tpFinal.tienda.models.entities.Vendedor;
import org.springframework.data.rest.core.config.Projection;

@Projection(types={Vendedor.class})
public interface VendedorDTO {
}
