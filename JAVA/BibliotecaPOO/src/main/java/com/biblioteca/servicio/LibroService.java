package com.biblioteca.servicio;

import com.biblioteca.interfaz.Prestable;
import com.biblioteca.modelo.Libro;
import java.util.ArrayList;


public class LibroService {

    private ArrayList<Prestable> catalogo;

    public LibroService() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("No hay libros en el catalogo");
            return;
        }
        System.out.println("Catalogo de la Biblioteca");
        for (Prestable p : catalogo) {
            if (p instanceof Libro libro) {
                libro.mostrarLibro();
                System.out.println("-----------------------------");
            }
        }
    }

    public Prestable buscarDisponible(String titulo) {
        for (Prestable p : catalogo) {
            if (p instanceof Libro libro && libro.getTitulo().equalsIgnoreCase(titulo) && libro.isDisponible()) {
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Prestable> getCatalogo() { 
        return catalogo; 
    }
}
