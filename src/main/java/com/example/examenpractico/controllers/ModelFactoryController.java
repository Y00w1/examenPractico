package com.example.examenpractico.controllers;

import com.example.examenpractico.services.ModelFactoryControllerService;
import com.example.examenpractico.services.Impl.Drugstore;

public class ModelFactoryController implements ModelFactoryControllerService {
    Drugstore drugstore;
    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }
    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }
    public ModelFactoryController() {
        drugstore = new Drugstore();
    }
}
