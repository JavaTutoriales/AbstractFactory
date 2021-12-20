package com.javatutoriales.patrones.abstractfactory.relacional.repositories;

import com.javatutoriales.patrones.abstractfactory.repositories.UsuarioRepository;

public class UsuarioRelacionalRepository implements UsuarioRepository {
    @Override
    public String guardaUsuario(String usuario) {
        return String.format("Guardando %s en una base de datos relacional", usuario);
    }
}
