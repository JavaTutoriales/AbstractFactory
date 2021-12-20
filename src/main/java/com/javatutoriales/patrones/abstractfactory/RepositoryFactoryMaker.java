package com.javatutoriales.patrones.abstractfactory;

import com.javatutoriales.patrones.abstractfactory.mongo.MongoRespositoryFactory;
import com.javatutoriales.patrones.abstractfactory.relacional.RelacionalRepositoryFactory;

public class RepositoryFactoryMaker {
    public static AbstractRepositoryFactory getRepositoryFactory(TipoRepositorio tipo) {
        if (TipoRepositorio.MONGO_DB.equals(tipo)) {
            return new MongoRespositoryFactory();
        }

        return new RelacionalRepositoryFactory();
    }
}
