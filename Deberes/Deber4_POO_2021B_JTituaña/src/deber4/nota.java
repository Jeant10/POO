package deber4;

import java.util.ArrayList;
import java.util.Scanner;

public class nota {

    ArrayList <Integer> calificaciones = new ArrayList<Integer>();
    Scanner s = new Scanner(System.in);
    int contador = 0;
    double promedio = 0.0;

    public void ingresarnotas()
    {
        System.out.println("Ingrese las notas: (escriba fin para salir)");
        String aux = s.nextLine();
        while(!"fin".equals(aux)){
            calificaciones.add(Integer.parseInt(aux));
            aux = s.nextLine();
        }
    }

    public double promedio(){

        for (int i = 0; i < calificaciones.size(); i++) {
            contador = contador + calificaciones.get(i);
        }
       return promedio = (double) contador / calificaciones.size();
    }

}
