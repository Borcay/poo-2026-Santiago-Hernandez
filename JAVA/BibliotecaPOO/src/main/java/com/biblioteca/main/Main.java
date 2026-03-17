package com.biblioteca.main;

import com.biblioteca.modelo.*;
import com.biblioteca.servicio.*;

public class Main {

    public static void main(String[] args) {

        LibroService libroService = new LibroService();
        UsuarioService usuarioService = new UsuarioService();

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez");
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupery");
        Libro libro3 = new Libro("Tung Tung Tung", "Sahur");
        Libro libro4 = new Libro("Mi conejo", "Santiago Hernandez");
        libroService.agregarLibro(libro1);
        libroService.agregarLibro(libro2);
        libroService.agregarLibro(libro3);
        libroService.agregarLibro(libro4);
        
        Usuario carlos = new Usuario("Carlos Perez", "123");
        Bibliotecario ana = new Bibliotecario("Ana Torres", "999", 2500000);

        libroService.mostrarCatalogo();
   
        //PRUEBAS
        System.out.println("\nLimite de 3 libros");
        usuarioService.prestarLibro(carlos, libro1); 
        usuarioService.prestarLibro(carlos, libro2);
        usuarioService.prestarLibro(carlos, libro3);
        usuarioService.prestarLibro(carlos, libro4); 

        System.out.println("\nPrueba devolucion y nuevo prestamo");
        usuarioService.devolverLibro(carlos, libro1); 
        usuarioService.prestarLibro(carlos, libro4);  

        System.out.println("\nInformacion final");
        carlos.mostrarInformacion();
        System.out.println();
        ana.mostrarInformacion();
    }
}
