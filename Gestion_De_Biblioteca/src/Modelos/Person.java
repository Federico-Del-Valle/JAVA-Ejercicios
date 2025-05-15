package Modelos;
import java.util.ArrayList;
import java.util.List;
public class Person {
    private String nombre;
    private String apellido;
    private List<Libro> librosPedidos = new ArrayList<>();




    public Person(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public List<Libro> getLibrosPedidos() {
        return librosPedidos;
    }

    public void setLibrosPedidos(List<Libro> librosPedidos) {
        this.librosPedidos = librosPedidos;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(Libro libro){
        librosPedidos.add(libro);
    }

    public void mostrarLibros(){
        for(Libro libro: librosPedidos){
            System.out.printf("%-30s  %-20s  %-10d  %-20s\n", libro.getTitulo(), libro.getAutor(), libro.getCantPaginas());
        }
    }
}
