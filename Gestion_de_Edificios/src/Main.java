import Modelos.Edificio;
import Modelos.EdificioDeOficinas;
import Modelos.Polideportivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Edificio> edificios = new ArrayList<Edificio>();
        Scanner input = new Scanner(System.in);
        edificios.add(new Polideportivo(20,30,15,"Huracan de SJ", "Abierto"));
        edificios.add(new Polideportivo(30, 30,15,"Unlam Poli", "Techada"));
        edificios.add(new EdificioDeOficinas(10,40,20,5, 15, 10));
        edificios.add(new EdificioDeOficinas(20,40,20,7, 20, 8));
        int i = 0;
        for(Edificio edificio : edificios){
            int contPolisT= 0;
            int contPolisA= 0;
            i++;
            System.out.println("El volumen del edificio "+ i + " es: " +edificio.calcularVolumen(edificio.getAncho(), edificio.getAlto(), edificio.getLargo()));
            System.out.println("La superficie del edificio "+ i + " es: " +edificio.calcularSuperficie(edificio.getAncho(), edificio.getLargo()));
            if(edificio instanceof Polideportivo poli){
                if (poli.getTipoDeInstalacion() == "Abierto")
                    contPolisA++;
                else if (poli.getTipoDeInstalacion() == "Techada") {
                    contPolisT++;
                }
            }
            if(edificio instanceof EdificioDeOficinas ofi){
               System.out.println("CantPersonas del edificio " + i + " es:" + ofi.cantPersonas());
            }
        }

    }
}