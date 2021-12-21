package com.javatutoriales.patrones.abstractfactory;

import com.javatutoriales.patrones.abstractfactory.repositories.CompraRepository;
import com.javatutoriales.patrones.abstractfactory.repositories.ProductoRepository;
import com.javatutoriales.patrones.abstractfactory.repositories.UsuarioRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AbstractRepositoryFactoryTest {

    AbstractRepositoryFactory repositoryFactory;

    @Test
    public void testRelacionalRepository_cuandoTipoEsRelacional() {
        repositoryFactory = RepositoryFactoryMaker.getRepositoryFactory(TipoRepositorio.RELACIONAL);

        CompraRepository compraRepository = repositoryFactory.getCompraRepository();
        ProductoRepository productoRepository = repositoryFactory.getProductoRepository();
        UsuarioRepository usuarioRepository = repositoryFactory.getUsuarioRepository();

        assertThat(compraRepository.guardaCompra("compra sencilla")).isEqualTo("Guardando compra sencilla en una base de datos relacional");
        assertThat(productoRepository.guardaProducto("producto elegante")).isEqualTo("Guardando producto elegante en una base de datos relacional");
        assertThat(usuarioRepository.guardaUsuario("usuario importante")).isEqualTo("Guardando usuario importante en una base de datos relacional");
    }

    @Test
    public void testMongoRepository_cuandoTipoEsMongo() {
        repositoryFactory = RepositoryFactoryMaker.getRepositoryFactory(TipoRepositorio.MONGO_DB);

        CompraRepository compraRepository = repositoryFactory.getCompraRepository();
        ProductoRepository productoRepository = repositoryFactory.getProductoRepository();
        UsuarioRepository usuarioRepository = repositoryFactory.getUsuarioRepository();

        assertThat(compraRepository.guardaCompra("compra sencilla")).isEqualTo("Guardando compra sencilla en MongoDB");
        assertThat(productoRepository.guardaProducto("producto elegante")).isEqualTo("Guardando producto elegante en MongoDB");
        assertThat(usuarioRepository.guardaUsuario("usuario importante")).isEqualTo("Guardando usuario importante en MongoDB");
    }
}
