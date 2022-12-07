package com.tpFinal.tienda.dao;

import com.tpFinal.tienda.models.entities.EntidadPersistente;
import com.tpFinal.tienda.models.entities.Vendedor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class VendedorImp implements Dao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<EntidadPersistente> getAll() {
        String query = "FROM Vendedor";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void add(EntidadPersistente entidadPersistente) {
            entityManager.merge(entidadPersistente);
    }

    @Override
    public void delete(Integer id) {
        Vendedor vendedor = entityManager.find(Vendedor.class,id);
        entityManager.remove(vendedor);
    }

}
