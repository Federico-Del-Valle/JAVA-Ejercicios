import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import Modelos.ItemBiblioteca;
import Modelos.Revista;
import Modelos.*;
public class Main {
    public static void main(String[] args) {


        System.out.println("\n ---Inicio programa---");
            Biblioteca biblioteca = new Biblioteca();
            biblioteca.addLibro(new Libro("El gato negro","Edgar Allan Poe", 250));
            biblioteca.addLibro(new Libro("Caidos del mapa II", "Maria Ines Falconi", 800));
            biblioteca.mostrarCatalogo();
    }
}
