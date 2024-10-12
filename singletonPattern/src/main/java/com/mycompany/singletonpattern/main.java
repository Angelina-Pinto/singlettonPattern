/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.singletonpattern;

import static java.util.Collections.singleton;

/**
 *
 * @author Dell
 */
public class main {

    public static void main(String[] args) {
       singletton singleton1 = singletton.getInstancia();
        singleton1.mostrarMensaje();

        // Intentar obtener otra instancia de la clase Singleton
        singletton singleton2 = singletton.getInstancia();
        singleton2.mostrarMensaje();

        // Verificar que ambas referencias apuntan al mismo objeto
        if (singleton1 == singleton2) {
            System.out.println("singleton1 y singleton2 son la misma instancia.");
        }
    }
}
