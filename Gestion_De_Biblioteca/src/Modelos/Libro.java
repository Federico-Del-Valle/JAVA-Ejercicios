package Modelos;
import Interfaces.Catalogable;
import Modelos.ItemBiblioteca;
public class Libro extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String autor;
    private int cantPaginas;
    private boolean prestado = false;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public Libro(String titulo, String autor, int cantPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }
    @Override
    public void calcularMultas() {

    }

    @Override
    public void prestar(){
        this.prestado = true;
    }

    @Override
    public void obtenerInformacion(){
        System.out.printf("%-30s  %-20s  %-10d  %-20s\n", titulo, autor, cantPaginas, prestado? "Prestado" : "Disponible");
    }
}
