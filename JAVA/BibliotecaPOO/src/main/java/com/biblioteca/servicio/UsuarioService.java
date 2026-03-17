package com.biblioteca.servicio;

import com.biblioteca.interfaz.Prestable;
import com.biblioteca.modelo.Usuario;


public class UsuarioService {


    public boolean prestarLibro(Usuario usuario, Prestable libro) {
        if (usuario.getLibrosPrestados() >= Usuario.MAX_LIBROS) {
            System.out.println("[ERROR] " + usuario.getNombre() + " ya tiene el maximo de " + Usuario.MAX_LIBROS + " libros prestados. Debe devolver uno antes de pedir otro.");
            return false;
        }

        if (!libro.isDisponible()) {
            System.out.println("[ERROR] El libro no esta disponible actualmente");
            return false;
        }

        libro.prestar();
        usuario.incrementarPrestamos();
        System.out.println("[OK] Prestamo exitoso. " + usuario.getNombre() + " ahora tiene " + usuario.getLibrosPrestados() + "/" + Usuario.MAX_LIBROS + " libros");
        return true;
    }

    public boolean devolverLibro(Usuario usuario, Prestable libro) {
        if (libro.isDisponible()) {
            System.out.println("[AVISO] Este libro ya estaba disponible (sin prestamo activo)");
            return false;
        }
        libro.devolver();
        usuario.decrementarPrestamos();
        System.out.println("[OK] Devolucion exitosa. " + usuario.getNombre() + " ahora tiene " + usuario.getLibrosPrestados() + "/" + Usuario.MAX_LIBROS + " libros.");
        return true;
    }
}
