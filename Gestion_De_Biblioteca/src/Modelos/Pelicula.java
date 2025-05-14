package Modelos;
import Interfaces.Catalogable;
import Modelos.ItemBiblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pelicula extends ItemBiblioteca implements Catalogable {

    private int nroPeli;
    private String titulo;
    private int copias;
    private LocalDate fechaAlquiler;

    @Override
    public void devolver() {
        this.copias++;
        System.out.println("Pelicula devuelta.");
    }
    @Override
    public void prestar(){
        if(this.copias==0){
            System.out.println("No quedan copias para prestar");
        }else {
            System.out.println("Pelicula prestada.");
            this.copias--;
        }
    }
    @Override
    public void calcularMultas() {
        LocalDate hoy       = LocalDate.now();
        LocalDate dueDate   = this.fechaAlquiler.plusDays(7);

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
    public void obtenerInformacion() {

    }

}
