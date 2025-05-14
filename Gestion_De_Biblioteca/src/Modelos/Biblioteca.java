package Modelos;

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
}
