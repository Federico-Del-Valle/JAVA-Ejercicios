import java.util.Scanner;
import Modelos.*;
public class Main {
    public static void main(String[] args) {


        System.out.println("\n ---Inicio programa---");
            Person Fede = new Person("Federico", "Del Valle");
            Person Kevin = new Person("Kevin", "Perez");
            Biblioteca biblioteca = new Biblioteca();
            biblioteca.addLibro(new Libro("El gato negro","Edgar Allan Poe", 250));
            biblioteca.addLibro(new Libro("Caidos del mapa II", "Maria Ines Falconi", 800));
            biblioteca.addLibro(new Libro("El eternauta", "Federico Del Valle", 800));
            biblioteca.addLibro(new Libro("La granja", "George Orwell", 800));
            biblioteca.addLibro(new Libro("El anticristo", "Friederich Nietzche", 800));
            biblioteca.mostrarCatalogo();

        System.out.println("\n ---Menu---\n");
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1-Mostrar catalogo");
            System.out.println("2-Pedir libro");
            System.out.println("3-Devolver libro");
            System.out.println("4-Salir");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    biblioteca.mostrarCatalogo();
                case 2:
                    biblioteca.prestarLibro(biblioteca.getLibro(1), Fede);
                    break;
                case 3:
                    biblioteca.mostrarCatalogo();
                    biblioteca.devolverLibro(Fede.getLibrosPedidos().get(1),Fede);
                    break;
            }
        } while (opcion != 4);
    }
}
