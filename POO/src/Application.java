import modelos.Empleado;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import static modelos.Empleado.*;

public class Application {
    public static void main(String[] args) {

        List <Empleado> empleados = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        Empleado empleado1 = new Empleado("Fede", 23, 10000, "Ingenieria");
        empleados.add(empleado1);
        Empleado empleado2 = new Empleado("Pedro", 19,20000, "Ingenieria");
        empleados.add(empleado2);
        Empleado empleado3 = new Empleado("Juan", 25, 30000, "Finanzas");
        empleados.add(empleado3);
        Empleado empleado4 = new Empleado("Maria", 20, 40000, "Finanzas");
        empleados.add(empleado4);

        Empleado[] arregloEmpleados = empleados.toArray(new Empleado[0]);

        int opcion = -1;

        while (opcion != 0) {
            System.out.println("  MENU  ");
            System.out.println("1. Mostrar empleados");
            System.out.println("2. Filtrar empleados");
            System.out.println("3. Buscar empleado por nombre");
            System.out.println("4. Ordenar empleados por criterio");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    mostrarEmpleados(arregloEmpleados);
                    break;
                case 2:
                    System.out.println("Filtro: ");
                    String filtro = sc.nextLine();
                    Empleado[] filtrados = filtrarEmpleados(arregloEmpleados, filtro);
                    mostrarEmpleados(filtrados);
                    break;
                case 3:
                    System.out.println("Que nombre desea buscar:");
                    Empleado empleado = null;
                    String nombre = sc.nextLine();
                    empleado = buscarPorNombre(arregloEmpleados, nombre);
                    if(empleado != null){
                        System.out.println("Datos del empleado: " + empleado.getNombre() + " " + empleado.getEdad() + " " + empleado.getSalario());
                    }
                    break;
                case 4:

                    System.out.println("Como desea ordenar:");
                    String criterio = sc.nextLine();
                    Empleado[] arregloOrdenado =ordenar(arregloEmpleados, criterio);
                    mostrarEmpleados(arregloOrdenado);
                    break;
                default:
                    System.out.println("Opcion desconocida.");
            }
        }
    }

}
