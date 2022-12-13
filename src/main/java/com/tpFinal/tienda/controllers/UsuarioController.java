package com.tpFinal.tienda.controllers;


import com.tpFinal.tienda.models.entities.Carrito;
import com.tpFinal.tienda.models.entities.Usuario;
import com.tpFinal.tienda.repository.CarritoRepo;
import com.tpFinal.tienda.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioRepository repo;
    @Autowired
    CarritoRepo carrRepo;

   /* @GetMapping(value="/usuarios/{id}")
    public @ResponseBody ResponseEntity<Usuario> getUsuario(@PathVariable Long id) {
        if(repo.existsById(id)){
            Usuario usuario = repo.findById(id).get();

            return new ResponseEntity<>(usuario,HttpStatus.OK);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }*/
    @Transactional
    @DeleteMapping(value="/usuarios/{id}/delete")
    public Usuario deleteUsuario(@PathVariable(value = "id") Long id){
        if(repo.existsById(id)) {

        Usuario usuario = repo.findById(id).get();
        repo.deleteById(id);
        return usuario;
        } else {
            return new Usuario();
        }

    }



    @Transactional
    @DeleteMapping(value="/usuarios/{id}/compras/{idCarr}")
    public @ResponseBody ResponseEntity<Carrito> deleteCarrito(@PathVariable(value = "id") Long id,@PathVariable(value="idCarr") Long idCarr){
        if(repo.existsById(id)) {
            if(carrRepo.existsById(idCarr)) {
                Carrito carr = carrRepo.findById(idCarr).get();
                carrRepo.deleteById(idCarr);
                return new ResponseEntity<>(carr, HttpStatus.OK);
            }else {return ResponseEntity.notFound().build();

            }

        }
        else {

        return ResponseEntity.notFound().build();
        }

    }






}
