package com.tpFinal.tienda.dao;

import com.tpFinal.tienda.models.entities.EntidadPersistente;
import com.tpFinal.tienda.models.entities.ProductoBase;
import com.tpFinal.tienda.models.entities.Usuario;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class ProductoBaseImp implements Dao {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<EntidadPersistente> getAll() {
        String query = "FROM ProductoBase";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void add(EntidadPersistente entidadPersistente) {
            entityManager.merge(entidadPersistente);
    }

    @Override
    public void delete(Integer id) {
        ProductoBase productoBase = entityManager.find(ProductoBase.class,id);
        entityManager.remove(productoBase);
    }
}
