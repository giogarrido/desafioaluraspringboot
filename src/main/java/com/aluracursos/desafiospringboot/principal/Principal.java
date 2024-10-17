package com.aluracursos.desafiospringboot.principal;

import com.aluracursos.desafiospringboot.service.ConsumoAPI;
import com.aluracursos.desafiospringboot.service.ConvierteDatos;

import java.sql.SQLOutput;

public class Principal {
    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoAPI conusmoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();
    
    public void muestraElMenu(){
        var json = conusmoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);
    }
}
