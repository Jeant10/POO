package edu.epn;

import edu.epn.ClasesAnidadas.ClaseExterna;
import edu.epn.Interfaces.AccionesGenerales2;
import edu.epn.Interfaces.Hombre;
import edu.epn.Polimorfismo.Auto;
import edu.epn.Polimorfismo.AutoDeportivo;
import edu.epn.Polimorfismo.AutoFurgoneta;
import edu.epn.Polimorfismo.AutoTurismo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Auto misAutos[] = new Auto[5];
        misAutos[0]= new Auto("erty","mazda","alegro elite");
        misAutos[1]= new AutoDeportivo("dfghj","BMW","sdfghj",400);
        misAutos[2]= new AutoFurgoneta("sdfghj","aveo","family",5);
        misAutos[3]=new AutoTurismo("sdfghj","toyota","dfghj",16);

        //Auto auto1= new AutoTurismo("poiuytr","toyota","dfghj",23);

       // AutoDeportivo auto2= (AutoDeportivo) new Auto("erty","mazda","alegro elite");

        for (Auto autos: misAutos){
            System.out.println(autos.mostrarDatos());
            System.out.println("-------------");
        }*/

        /*ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new AutoTurismo("sdfghj","toyota","dfghj",16));
        autos.add(new AutoDeportivo("dfghj","BMW","sdfghj",400));
        autos.add(new AutoFurgoneta("sdfghj","aveo","family",5));

        for (Auto autos2: autos){
            System.out.println(autos2);
        }*/

        /*AccionesGenerales2 acciones= new AccionesGenerales2() {
            @Override
            public String comer() {
                return null;
            }

            @Override
            public String dormir() {
                return null;
            }

            @Override
            public String estudiar() {
                return null;
            }
        };

        Hombre hombre= new Hombre();
        System.out.println(hombre.comer());
        System.out.println(hombre.bailar("salsa "));

         */

        ClaseExterna.ClaseAnidadaInterna nuevoObjeto= new ClaseExterna.ClaseAnidadaInterna();
        nuevoObjeto.mostrar();

    }
}














