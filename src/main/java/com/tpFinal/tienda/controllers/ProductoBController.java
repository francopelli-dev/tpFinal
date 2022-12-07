package com.tpFinal.tienda.controllers;

import com.tpFinal.tienda.dao.Dao;
import com.tpFinal.tienda.models.entities.EntidadPersistente;
import com.tpFinal.tienda.models.entities.ProductoBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoBController {
    @Qualifier("productoBaseImp")
    @Autowired
    Dao dao;

    @RequestMapping(value="/api/productosbase",method = RequestMethod.GET)
    public List<EntidadPersistente> getAllprodBase(){
        List<EntidadPersistente> lista = dao.getAll();
        return lista;
    }
    @RequestMapping(value="/api/productosbase",method = RequestMethod.POST)
    public void addProdBase(@RequestBody ProductoBase productoBase) {
        dao.add(productoBase);
    }
    @RequestMapping(value="/api/productosbase/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id){
        dao.delete(id);
    }
}
