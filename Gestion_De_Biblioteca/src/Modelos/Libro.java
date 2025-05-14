package Modelos;
import Interfaces.Catalogable;
import Modelos.ItemBiblioteca;
public class Libro extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String autor;
    private int cantPaginas;

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

    @Override
    public void devolver() {

    }
    @Override
    public void calcularMultas() {

    }

    @Override
    public void prestar(){

    }

    @Override
    public void obtenerInformacion(){
        System.out.println("Informacion del libro: ");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("CantPaginas: " + cantPaginas);
    }
}
