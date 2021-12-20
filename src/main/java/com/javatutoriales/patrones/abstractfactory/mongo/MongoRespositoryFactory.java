package com.javatutoriales.patrones.abstractfactory.mongo;

import com.javatutoriales.patrones.abstractfactory.AbstractRepositoryFactory;
import com.javatutoriales.patrones.abstractfactory.mongo.repositories.CompraMongoRepository;
import com.javatutoriales.patrones.abstractfactory.mongo.repositories.ProductoMongoRepository;
import com.javatutoriales.patrones.abstractfactory.mongo.repositories.UsuarioMongoRepository;
import com.javatutoriales.patrones.abstractfactory.repositories.CompraRepository;
import com.javatutoriales.patrones.abstractfactory.repositories.ProductoRepository;
import com.javatutoriales.patrones.abstractfactory.repositories.UsuarioRepository;

public class MongoRespositoryFactory implements AbstractRepositoryFactory {
    @Override
    public CompraRepository getCompraRepository() {
        return new CompraMongoRepository();
    }

    @Override
    public ProductoRepository getProductoRepository() {
        return new ProductoMongoRepository();
    }

    @Override
    public UsuarioRepository getUsuarioRepository() {
        return new UsuarioMongoRepository();
    }
}
