package com.javatutoriales.patrones.abstractfactory.relacional.repositories;

import com.javatutoriales.patrones.abstractfactory.repositories.CompraRepository;

public class CompraRelacionalRepository implements CompraRepository {

    @Override
    public String guardaCompra(String compra) {
        return String.format("Guardando %s en una base de datos relacional", compra);
    }
}
