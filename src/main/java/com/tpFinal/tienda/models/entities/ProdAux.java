package com.tpFinal.tienda.models.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProdAux {
    private Long prodBaseId;
    private Long persoId;

    private String url;
    private String textoAgregado;
}
