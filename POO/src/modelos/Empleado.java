package modelos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private int edad;
    private int salario;
    private String depto;

    public Empleado(String nombre, int edad, int salario, String depto) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.depto = depto;
    }
    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos de empleados

    public static void mostrarEmpleados(Empleado[] empleados) {
        System.out.println("Los empleados son:");
        System.out.printf("%-5s %-20s %-5s %-10s %-15s%n",
                "Índice", "Nombre", "Edad", "Salario", "Departamento"
        );

        for (int i = 0; i < empleados.length; i++) {
            Empleado e = empleados[i];
            if (e == null) continue;

            System.out.printf("%-5d %-20s %-5d %-10d %-15s%n",
                    i,                  // %d
                    e.getNombre(),      // %s
                    e.getEdad(),        // %d
                    e.getSalario(),     // %d <— antes tenías %.2f aquí
                    e.getDepto()        // %s
            );
        }
    }



    public static Empleado[] filtrarEmpleados(Empleado[] empleados, String filtro) {
        List<Empleado> listaFiltrada = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        if (filtro.equalsIgnoreCase("nombre")) {
            System.out.print("Ingrese el nombre que desea filtrar: ");
            String nombre = sc.nextLine();
            for (Empleado e : empleados) {
                if (e != null && e.getNombre().equalsIgnoreCase(nombre)) {
                    listaFiltrada.add(e);
                }
            }

        } else if (filtro.equalsIgnoreCase("departamento")) {
            System.out.print("Ingrese el departamento que desea filtrar: ");
            String depto = sc.nextLine();
            for (Empleado e : empleados) {
                if (e != null && e.getDepto().equalsIgnoreCase(depto)) {
                    listaFiltrada.add(e);
                }
            }

        } else if (filtro.equalsIgnoreCase("edad")) {
            System.out.print("Edad mínima: ");
            int min = sc.nextInt();
            System.out.print("Edad máxima: ");
            int max = sc.nextInt();
            for (Empleado e : empleados) {
                if (e != null && e.getEdad() >= min && e.getEdad() <= max) {
                    listaFiltrada.add(e);
                }
            }

        } else if (filtro.equalsIgnoreCase("salario")) {
            System.out.print("Salario mínimo: ");
            double minS = sc.nextDouble();
            System.out.print("Salario máximo: ");
            double maxS = sc.nextDouble();
            for (Empleado e : empleados) {
                if (e != null && e.getSalario() >= minS && e.getSalario() <= maxS) {
                    listaFiltrada.add(e);
                }
            }

        } else {
            System.out.println("Criterio desconocido: " + filtro);
        }

        // Convertir la lista de vuelta a arreglo y devolverla
        return listaFiltrada.toArray(new Empleado[0]);
    }

    public static Empleado buscarPorNombre(Empleado[] eArr, String nombre) {
        for (Empleado e : eArr) {
            if (e != null && e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
    public void incrementarSalario(int porcentaje) {
        double actual = getSalario();
        double nuevo = actual + (actual * porcentaje / 100);
        setSalario((int) nuevo);
    }

    /*
    @param empleados array original
    @param filtro determina como se ordenara el array
    @return retorna el array ordenado por el filtro determinado

     */
    public static Empleado[] ordenar(Empleado[] empleados, String criterio) {
        // Clonamos el arreglo
        Empleado[] ordenado = empleados.clone();

        // Bubble sort / selección
        for (int i = 0; i < ordenado.length - 1; i++) {
            boolean swapped = false;
            for (int j = i + 1; j < ordenado.length; j++) {
                Empleado a = ordenado[i], b = ordenado[j];
                if (a == null || b == null) continue;

                int cmp;
                switch (criterio.toLowerCase()) {
                    case "nombre":
                        cmp = a.getNombre().compareToIgnoreCase(b.getNombre());
                        break;
                    case "edad":
                        cmp = Integer.compare(a.getEdad(), b.getEdad());
                        break;
                    case "salario":
                        cmp = Integer.compare(a.getSalario(), b.getSalario());
                        break;
                    case "departamento":
                        cmp = a.getDepto().compareToIgnoreCase(b.getDepto());
                        break;
                    default:
                        throw new IllegalArgumentException("Criterio desconocido: " + criterio);
                }

                if (cmp > 0) {
                    // intercambiar
                    ordenado[i] = b;
                    ordenado[j] = a;
                    swapped = true;
                }
            }
            if (!swapped) break;  // ya está ordenado
        }

        return ordenado;
    }



}
