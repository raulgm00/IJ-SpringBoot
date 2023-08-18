package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class UsuarioController {
    @RequestMapping(value = "prueba")
    public List<String> prueba(){
        return List.of("Manzana","Kiwi","Banana");
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Dinamico");
        usuario.setApellido("Json");
        usuario.setEmail("dinamico@gmail.com");
        usuario.setPassword("******");
        usuario.setTelefono("5578492776");
        return usuario;
    }

    @RequestMapping(value = "editar")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Raul");
        usuario.setApellido("Garcia");
        usuario.setEmail("raulgm00@gmail.com");
        usuario.setPassword("******");
        usuario.setTelefono("5578492776");
        return usuario;
    }
    @RequestMapping(value = "eliminar")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Raul");
        usuario.setApellido("Garcia");
        usuario.setEmail("raulgm00@gmail.com");
        usuario.setPassword("******");
        usuario.setTelefono("5578492776");
        return usuario;
    }

    @RequestMapping(value = "buscar")
    public List<Usuario> buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Raul");
        usuario.setApellido("Garcia");
        usuario.setEmail("raulgm00@gmail.com");
        usuario.setPassword("******");
        usuario.setTelefono("5578492776");
        return List.of(usuario);
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> lu = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Usuario 1");
        usuario.setApellido("Json");
        usuario.setEmail("dinamico@gmail.com");
        usuario.setPassword("******");
        usuario.setTelefono("5578492776");


        Usuario usuario_2 = new Usuario();
        usuario_2.setId(2);
        usuario_2.setNombre("Usuario 2");
        usuario_2.setApellido("Json");
        usuario_2.setEmail("dinamico@gmail.com");
        usuario_2.setPassword("******");
        usuario_2.setTelefono("5578745576");

        Usuario usuario_3 = new Usuario();
        usuario_3.setId(3);
        usuario_3.setNombre("Usuario 3");
        usuario_3.setApellido("Json");
        usuario_3.setEmail("dinamico@gmail.com");
        usuario_3.setPassword("******");
        usuario_3.setTelefono("45258652");

        lu.add(usuario);
        lu.add(usuario_2);
        lu.add(usuario_3);

        return lu;
    }
}
