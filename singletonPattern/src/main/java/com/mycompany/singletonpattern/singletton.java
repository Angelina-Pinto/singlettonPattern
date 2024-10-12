package com.mycompany.singletonpattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class singletton {
    private static singletton instanciaUnica;
    private singletton() {
        // Constructor privado para prevenir la instanciación externa
    }
    
     public static singletton getInstancia() {
        if (instanciaUnica == null) {
            // Si no se ha creado la instancia, se crea en este momento (Lazy Initialization)
            instanciaUnica = new singletton();
        }
        // Si ya está creada, se devuelve la instancia existente
        return instanciaUnica;  
    }
        public void mostrarMensaje() {
        System.out.println("¡Soy la única instancia del Singleton!");
    }
}
