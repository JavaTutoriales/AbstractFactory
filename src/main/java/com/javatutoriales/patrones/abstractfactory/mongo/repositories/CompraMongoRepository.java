package com.javatutoriales.patrones.abstractfactory.mongo.repositories;

import com.javatutoriales.patrones.abstractfactory.repositories.CompraRepository;

public class CompraMongoRepository implements CompraRepository {
    @Override
    public String guardaCompra(String compra) {
        return String.format("Guardando %s en MongoDB", compra);
    }
}
