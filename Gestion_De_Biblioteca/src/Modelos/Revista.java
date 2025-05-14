package Modelos;
import Interfaces.Catalogable;
import Modelos.ItemBiblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Revista extends ItemBiblioteca implements Catalogable {
    private int nroRevista;
    private int cantEjemplares;
    private String nombre;
    private LocalDate fechaPrestamo;

    public Revista(int nroRevista, int cantEjemplares, String nombre,  LocalDate fechaPrestamo) {
        this.nroRevista = nroRevista;
        this.cantEjemplares = cantEjemplares;
        this.nombre = nombre;
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getNroRevista() {
        return nroRevista;
    }

    public void setNroRevista(int nroRevista) {
        this.nroRevista = nroRevista;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void devolver() {
        this.cantEjemplares++;
        System.out.println("\n Se devolvio el libro correctamente!");
    }
    @Override
    public void prestar(){
        if(getCantEjemplares()>0){
            System.out.println("\n Se presto el libro correctamente!");
            this.cantEjemplares--;
        }else {
            System.out.println("No tienes ejemplares para prestar");
        }
    }
    @Override
    public void calcularMultas() {
        LocalDate hoy       = LocalDate.now();
        LocalDate dueDate   = this.fechaPrestamo.plusDays(7);

        if (hoy.isAfter(dueDate)) {
            long diasRetraso = ChronoUnit.DAYS.between(dueDate, hoy);
            long multa       = 200L * diasRetraso;
            System.out.printf("Usted debe: $%d (%d día(s) de demora)%n",
                    multa, diasRetraso);
        } else {
            System.out.println("No hay multa. Aún dentro del plazo.");
        }
    }
    @Override
    public void obtenerInformacion(){
        System.out.println("Informacion de la revista: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cantidad de ejemplares: " + getCantEjemplares());
        System.out.println("Nro Revista: " + getNroRevista());
    }
}
