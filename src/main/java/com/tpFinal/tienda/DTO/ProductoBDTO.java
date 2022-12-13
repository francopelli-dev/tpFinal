package com.tpFinal.tienda.DTO;

import com.tpFinal.tienda.models.entities.ProductoBase;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Types;

@Projection(types = {ProductoBase.class})
public interface ProductoBDTO {

}
