package com.tpFinal.tienda.dao;

import com.tpFinal.tienda.models.entities.EntidadPersistente;

import java.util.List;

public interface Dao {
    List<EntidadPersistente> getAll();


    void add(EntidadPersistente entidadPersistente);
    void delete(Integer id);

}
