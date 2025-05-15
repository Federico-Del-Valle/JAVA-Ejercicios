import enums.Estacion;
import enums.Mes;
import modelos.EstacionDelAño;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- GESTIÓN ESTACIONES ---");
            System.out.println("1) Mostrar estaciones y sus meses");
            System.out.println("2) Buscar estación por número de mes");
            System.out.println("0) Salir");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt(); sc.nextLine();
            switch (opcion){
                case 1:
                    EstacionDelAño.imprimirEstaciones();
                    break;
                case 2:
                    solicitarEstacion();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida, inténtalo de nuevo.");

            }
        }while(opcion != 0);
    }

    private static void solicitarEstacion(){
        System.out.println("Ingrese un numero del 1 al 12:");
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt();
        sc.nextLine();
        Mes m = Mes.fromNumero(mes);
        if (m == null){
            System.out.println("Mes desconocido");
        }else {
            Estacion e = EstacionDelAño.obtenerEstacion(m);
            System.out.printf("El mes %s (%d) corresponde a %s.%n",
                    m, m.getNum(), e);
        }
    }
}