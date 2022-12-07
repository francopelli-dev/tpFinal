package com.tpFinal.tienda.dao;


import com.tpFinal.tienda.models.entities.EntidadPersistente;
import com.tpFinal.tienda.models.entities.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class UsuarioImp implements Dao {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<EntidadPersistente> getAll() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }


    @Override
    public void delete(Integer id) {
        Usuario usuario = entityManager.find(Usuario.class,id);
        entityManager.remove(usuario);
    }



    @Override
    public void add(EntidadPersistente entidadPersistente) {
        entityManager.merge(entidadPersistente);
    }
}
