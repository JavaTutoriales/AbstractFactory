package com.javatutoriales.patrones.abstractfactory.relacional.repositories;

import com.javatutoriales.patrones.abstractfactory.repositories.ProductoRepository;

public class ProductoRelacionalRepository implements ProductoRepository {
    @Override
    public String guardaProducto(String producto) {
        return String.format("Guardando %s en una base de datos relacional", producto);
    }
}
