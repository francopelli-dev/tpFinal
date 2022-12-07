package com.tpFinal.tienda.controllers;

import com.tpFinal.tienda.dao.Dao;
import com.tpFinal.tienda.models.entities.EntidadPersistente;
import com.tpFinal.tienda.models.entities.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendedorController {
    @Qualifier("vendedorImp")
    @Autowired
    Dao dao;

    @RequestMapping(value = "/api/vendedores",method = RequestMethod.GET)
    public List<EntidadPersistente> getVendedores() {
        return dao.getAll();
    }

    @RequestMapping(value= "/api/vendedores",method = RequestMethod.POST)
    public void addVendedor(@RequestBody Vendedor vendedor){
        dao.add(vendedor);
    }
    @RequestMapping(value= "/api/vendedores/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        dao.delete(id);
    }
}
