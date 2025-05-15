package Modelos;
import Modelos.Libro;
import Modelos.Person;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros =  new ArrayList<>();

    public void  addLibro(Libro libro){
        libros.add(libro);
    }
    public void mostrarCatalogo(){
        System.out.println("Libros de la Biblioteca:");
        for(Libro libro: libros){
            libro.obtenerInformacion();
        }
    }
    public boolean devolverLibro(Libro libro, Person p){
        if (libros.contains(libro) && libro.isPrestado() && p.getLibrosPedidos().contains(libro)){
            libro.devolver();
            p.getLibrosPedidos().remove(libro);
            return true;
        }
        return false;
    }
    public Libro getLibro(int index) {
        return libros.get(index);
    }

    public boolean prestarLibro(Libro libro, Person p){
        if (libros.contains(libro) && !libro.isPrestado()){
            libro.prestar();
            p.agregarLibro(libro);
            return true;
        }
        return false;
    }
}
