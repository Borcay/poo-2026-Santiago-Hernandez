package com.biblioteca.modelo;

import com.biblioteca.interfaz.Prestable;

public class Libro implements Prestable {

    private final String titulo;
    private final String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() { 
        return titulo; 
    }
    
    public String getAutor() { 
        return autor; 
    }

    @Override
    public boolean isDisponible() { 
        return disponible; 
    }

    @Override
    public void prestar() { 
        disponible = false; 
    }

    @Override
    public void devolver() { 
        disponible = true; 
    }

    public void mostrarLibro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
    }
}
