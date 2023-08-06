/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.adolfosc.compiladorexpresiones;

import com.adolfosc.analizadores.LexicoExpresion;
import com.adolfosc.analizadores.ParserExpresion;

import java.io.FileInputStream;

/**
 *
 * @author hectoradolfo
 */
public class CompiladorExpresiones {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        interpretar("entrada.txt");
    }

    /**
     * Método que interpreta el contenido del archivo que se encuentra en el path
     * que recibe como parámentro
     * @param path ruta del archivo a interpretar
     */
    private static void interpretar(String path) {
        ParserExpresion pars;
        try {
            pars=new ParserExpresion(new LexicoExpresion(new FileInputStream(path)));
            pars.parse();
        } catch (Exception ex) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println("Causa: "+ex.getCause());
        }
    }
}
