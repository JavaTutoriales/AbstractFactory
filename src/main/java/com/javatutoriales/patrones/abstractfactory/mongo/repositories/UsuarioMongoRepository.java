package com.javatutoriales.patrones.abstractfactory.mongo.repositories;

import com.javatutoriales.patrones.abstractfactory.repositories.UsuarioRepository;

public class UsuarioMongoRepository implements UsuarioRepository {
    @Override
    public String guardaUsuario(String usuario) {
        return String.format("Guardando %s en MongoDB", usuario);
    }
}
