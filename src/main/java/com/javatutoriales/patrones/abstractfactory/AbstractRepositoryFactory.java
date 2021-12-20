package com.javatutoriales.patrones.abstractfactory;

import com.javatutoriales.patrones.abstractfactory.repositories.CompraRepository;
import com.javatutoriales.patrones.abstractfactory.repositories.ProductoRepository;
import com.javatutoriales.patrones.abstractfactory.repositories.UsuarioRepository;

public interface AbstractRepositoryFactory {
    CompraRepository getCompraRepository();

    ProductoRepository getProductoRepository();

    UsuarioRepository getUsuarioRepository();
}
