package ar.edu.fie.undef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    Map<Integer, Libro> catalogo;
    // Otra lista para realizar un seguimiento de libros prestados
    List<Libro> librosPrestados; // creo una lista simple para guardar los libros prestados

    public Biblioteca() {
        catalogo = new HashMap<>();
        // Inicializar otras estructuras de datos según sea necesario
        librosPrestados = new ArrayList<>(); // inicializo la lista de libros prestados
    }

    public void agregarLibro(Libro libro) {
        // Implementar la lógica para agregar un libro al catálogo
        // verificar que no este el id en el catalogo - contains
        if (!catalogo.containsKey(libro.idLibro)) { // si el id del libro no esta en el catalogo
            catalogo.put(libro.idLibro, libro); // agrego el libro al catalogo

        }else{
            System.out.println("El libro ya se encuentra en el catalogo");
        }
    }

    public void prestarLibro(int idLibro) {

        Libro libro = catalogo.get(idLibro);
        if (libro != null) { // si el libro existe en el catalogo
            if (libro.getCantidadDisponible() > 0) {
                libro.disminuirCantidad();
                librosPrestados.add(libro);
            } else {
                System.out.println("No hay ejemplares disponibles");
            }
        }
        System.out.println("El libro no existe en el catalogo");
    }

    public void devolverLibro(int idLibro) {
        // Implementar la lógica para devolver un libro
        if (librosPrestados.contains(catalogo.get(idLibro))) { // si el libro esta en la lista de libros prestados
            Libro libro = catalogo.get(idLibro);
            libro.aumentarCantidad();
            //catalogo.put(libro.idLibro, libro);
            librosPrestados.remove(libro);

        }
    }

    public void mostrarInformacionLibro(int idLibro) {
        // Implementar la lógica para mostrar información sobre un libro específico
        Libro libro = catalogo.get(idLibro);
        libro.mostrarLibro();

    }
}

