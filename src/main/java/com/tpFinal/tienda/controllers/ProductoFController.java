package com.tpFinal.tienda.controllers;

import com.tpFinal.tienda.models.entities.ProductoBase;
import com.tpFinal.tienda.models.entities.ProductoFinal;
import com.tpFinal.tienda.models.entities.Vendedor;
import com.tpFinal.tienda.repository.ProductoFRepository;
import com.tpFinal.tienda.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
public class ProductoFController {

    @Autowired
    ProductoFRepository repo;

    @Transactional
    @PostMapping(value="/productosfinal/crear")
    public @ResponseBody ResponseEntity<ProductoFinal> crearProd(@RequestBody ProductoFinal prod){
        //Long vendId = prod.getVendedor().getResourceId();
        //Vendedor vend = vendRepo.findById(vendId).get();


        //Vendedor vend = prod.getVendedor();

        //vend.addProducto(prod);
        repo.save(prod);
        return new ResponseEntity<>(prod, HttpStatus.OK);




    }
    @DeleteMapping(value="productosfinal/{id}")
    public @ResponseBody ResponseEntity<ProductoFinal> deleteById(@PathVariable Long id){
        if(repo.existsById(id)){
            ProductoFinal prod = repo.findById(id).get();
            repo.deleteById(id);
            return new ResponseEntity<>(prod,HttpStatus.OK);



        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
