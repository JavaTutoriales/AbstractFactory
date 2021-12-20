package com.javatutoriales.patrones.abstractfactory.mongo.repositories;

import com.javatutoriales.patrones.abstractfactory.repositories.ProductoRepository;

public class ProductoMongoRepository implements ProductoRepository {
    @Override
    public String guardaProducto(String producto) {
        return String.format("Guardando %s en MongoDB", producto);
    }
}
