package com.tpFinal.tienda.controllers;

import com.tpFinal.tienda.models.entities.Carrito;
import com.tpFinal.tienda.models.entities.ProductoFinal;
import com.tpFinal.tienda.models.entities.Usuario;
import com.tpFinal.tienda.repository.CarritoRepo;
import com.tpFinal.tienda.repository.ProductoFRepository;
import com.tpFinal.tienda.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
public class CarritoController {
    @Autowired
    CarritoRepo repo;
    @Autowired
    UsuarioRepository userRepo;
    @Autowired
    ProductoFRepository prodRepo;
    @Transactional
    @PostMapping(value = "/carrito/crear/{id}")
    public @ResponseBody ResponseEntity<Carrito> crearCarrito(@RequestBody Carrito carrito, @PathVariable int id){
        Long user_id = new Long(id);
        Usuario user = userRepo.findById(user_id).get();
        carrito.setUsuario(user);
        user.addCarrito(carrito);
        repo.save(carrito);
        return new ResponseEntity(carrito, HttpStatus.OK);
    }

    @Transactional
    @PostMapping(value="/carrito/{id}/productos")
    public @ResponseBody ResponseEntity<ProductoFinal> addProdFinal(@PathVariable Long id,@RequestBody Long prod_id){
        if(repo.existsById(id)) {
            if(prodRepo.existsById(prod_id)){
                ProductoFinal prod = prodRepo.findById(prod_id).get();
                Carrito carr = repo.findById(id).get();
                carr.addProd(prod);
                carr.sumarTotal(prod.getPrecioFinal());
                repo.save(carr);
                return new ResponseEntity<>(prod,HttpStatus.OK);
            }else {
                return ResponseEntity.notFound().build();
            }
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(value="/carrito/{id}")
    public @ResponseBody ResponseEntity<Carrito> alternateEstado(@PathVariable Long id){
        if(repo.existsById(id)){
            Carrito carr = repo.findById(id).get();

            if(carr.isActivo()) {
                carr.setActivo(false);

            } else {
                carr.setActivo(true);
            }
            repo.save(carr);
            return new ResponseEntity<>(carr,HttpStatus.OK);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
