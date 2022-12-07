package com.tpFinal.tienda.controllers;


import com.tpFinal.tienda.dao.Dao;
import com.tpFinal.tienda.models.entities.EntidadPersistente;
import com.tpFinal.tienda.models.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Qualifier("usuarioImp")
    @Autowired
    Dao dao;

    @RequestMapping(value = "/api/usuarios",method = RequestMethod.GET)
    public List<EntidadPersistente> getUsuarios() {
        return dao.getAll();
    }

    @RequestMapping(value = "/api/usuarios",method = RequestMethod.POST)
    public Usuario addUsuario(@RequestBody  Usuario usuario) {
        dao.add(usuario);
        return usuario;
    }
    @RequestMapping(value = "/api/usuarios/{id}",method = RequestMethod.DELETE)
    public void delUsuario(@PathVariable Integer id) {
        dao.delete(id);
    }

}
