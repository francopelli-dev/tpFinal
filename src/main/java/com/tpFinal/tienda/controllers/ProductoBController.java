package com.tpFinal.tienda.controllers;

import com.tpFinal.tienda.models.entities.EntidadPersistente;
import com.tpFinal.tienda.models.entities.ProductoBase;
import com.tpFinal.tienda.repository.ProductoBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
public class ProductoBController {

    @Autowired
    ProductoBRepository repo;

    @DeleteMapping(value="productosbase/{id}")
    public @ResponseBody ResponseEntity<ProductoBase> deleteById(@PathVariable Long id){
        if(repo.existsById(id)){
            ProductoBase prod = repo.findById(id).get();
            repo.deleteById(id);
            return new ResponseEntity<>(prod,HttpStatus.OK);



        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
