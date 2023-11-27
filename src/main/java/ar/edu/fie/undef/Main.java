package ar.edu.fie.undef;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // creo los objetos
        Biblioteca biblioteca = new Biblioteca();
        Libro libro1 = new Libro(1, "El señor de los anillos", "Tolkien", 3);
        Libro libro2 = new Libro(2, "El hobbit", "Tolkien", 2);

        //agrego los libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        //presto un libro
        biblioteca.prestarLibro(1);

        //prueba para ver libros prestados
        for (Libro libro : biblioteca.librosPrestados) {
            libro.mostrarLibro();
        }

        //devuelvo un libro
        biblioteca.devolverLibro(1);

        //prueba para obtener informacion de un libro
        biblioteca.mostrarInformacionLibro(1);
        biblioteca.mostrarInformacionLibro(2);

        //probar las excepciones
        Libro libro3 = new Libro(1, "El señor de los anillos", "Tolkien", 3);
        biblioteca.agregarLibro(libro3);

        //quiero prestar un libro que no existe
        biblioteca.prestarLibro(5);

    }
}
