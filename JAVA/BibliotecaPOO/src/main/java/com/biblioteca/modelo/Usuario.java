package com.biblioteca.modelo;

public class Usuario extends Persona {

    private int librosPrestados;
    public static final int MAX_LIBROS = 3; 

    public Usuario(String nombre, String identificacion) {
        super(nombre, identificacion);
        this.librosPrestados = 0;
    }

    public int getLibrosPrestados() { 
        return librosPrestados; 
    }

    public void incrementarPrestamos() { 
        librosPrestados++; 
    }
    
    public void decrementarPrestamos() {
        if (librosPrestados > 0) librosPrestados--;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Libros prestados: " + librosPrestados + "/" + MAX_LIBROS);
    }
}