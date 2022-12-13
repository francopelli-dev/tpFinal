package com.tpFinal.tienda.controllers;

import com.tpFinal.tienda.models.entities.*;
import com.tpFinal.tienda.repository.PersonalizacionRepository;
import com.tpFinal.tienda.repository.ProductoBRepository;
import com.tpFinal.tienda.repository.ProductoFRepository;
import com.tpFinal.tienda.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class VendedorController {
    @Autowired
    VendedorRepository repo;
    @Autowired
    ProductoFRepository repoProd;
    @Autowired
    PersonalizacionRepository persoRepo;
    @Autowired
    ProductoBRepository prodBRepo;

    @PostMapping(value="/vendedores/{id}/productos")
    public @ResponseBody ResponseEntity<ProductoFinal> addProducto(@PathVariable Long id, @RequestBody ProdAux prod){
       if(repo.existsById(id)) {
           ProductoFinal prodFin = new ProductoFinal();
           Personalizacion perso = null;
           if (persoRepo.existsById(prod.getPersoId())) {
               perso = persoRepo.findById(prod.getPersoId()).get();
           }
           ProductoBase prodBase = null;
           if (prodBRepo.existsById(prod.getProdBaseId())) {
               prodBase = prodBRepo.findById(prod.getProdBaseId()).get();
           }
           prodFin.setPersonalizacion(perso);
           prodFin.setProductoBase(prodBase);
           prodFin.setVendedor(repo.findById(id).get());
           prodFin.setUrl(prod.getUrl());
           prodFin.setPrecioFinal(prodBase.getPrecioBase()+perso.getPrecio());
           prodFin.setTextoAgregado(prod.getTextoAgregado());

           prodFin.setActivo(true);
           repoProd.save(prodFin);
           return new ResponseEntity<>(prodFin,HttpStatus.OK);

       } else {
           return ResponseEntity.notFound().build();
       }
    }

    @GetMapping(value="/vendedores/{id}/productos")
    public Collection<ProductoFinal> getAllProductos(@PathVariable Long id) {
        return repo.findById(id).get().getProductos();
    }
    




}
