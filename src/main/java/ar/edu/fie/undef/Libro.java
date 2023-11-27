package ar.edu.fie.undef;

public class Libro {
    int idLibro;
    String titulo;
    String autor;
    int cantidadDisponible;

    // Constructor y otros métodos que puedas necesitar

    public Libro(int idLibro, String titulo, String autor, int cantidadDisponible) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }



    public void aumentarCantidad() {
        this.cantidadDisponible++;
    }

    public void disminuirCantidad() {
        if (this.cantidadDisponible > 0) {
            this.cantidadDisponible--;
        } else {
            System.out.println("Todos los ejemplares del libro " + this.titulo + " Se encuentran prestados");
        }
    }

    public void mostrarLibro(){
        System.out.println("Libro id: " + this.idLibro + ", Titulo: " + this.titulo + ", Autor: " + this.autor + ", Cantidad disponible: " + this.cantidadDisponible);

    }
}