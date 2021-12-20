package com.javatutoriales.patrones.abstractfactory.relacional;

import com.javatutoriales.patrones.abstractfactory.AbstractRepositoryFactory;
import com.javatutoriales.patrones.abstractfactory.relacional.repositories.CompraRelacionalRepository;
import com.javatutoriales.patrones.abstractfactory.relacional.repositories.ProductoRelacionalRepository;
import com.javatutoriales.patrones.abstractfactory.relacional.repositories.UsuarioRelacionalRepository;
import com.javatutoriales.patrones.abstractfactory.repositories.CompraRepository;
import com.javatutoriales.patrones.abstractfactory.repositories.ProductoRepository;
import com.javatutoriales.patrones.abstractfactory.repositories.UsuarioRepository;

public class RelacionalRepositoryFactory implements AbstractRepositoryFactory {
    @Override
    public CompraRepository getCompraRepository() {
        return new CompraRelacionalRepository();
    }

    @Override
    public ProductoRepository getProductoRepository() {
        return new ProductoRelacionalRepository();
    }

    @Override
    public UsuarioRepository getUsuarioRepository() {
        return new UsuarioRelacionalRepository();
    }
}
