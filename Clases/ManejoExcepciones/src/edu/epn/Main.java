package edu.epn;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        /*int numeros[] = new int[3];
        try{
            System.out.println("Antes de la excepcion");
            //generar la excepcion
            numeros[0] = 8;
            numeros[1]=2;
            numeros[3]=9;
            numeros[4]=5;
            numeros[5]=7;
        }catch (Exception e){
            //capturar la excepcion
            System.out.println("Indice fuera de los limites");
            System.out.println(e);
        }
        System.out.println("Despues de generada la excepcion");*/

        /*int numeros[]={1,2,3,4,5,6,7,8};
        int numeros2[]={8,9,10,0,5};
        for (int i =0; i<numeros.length;i++){
            try {
                double resultado = numeros[i]/numeros2[i];
                System.out.println(numeros[i]+"/"+numeros2[i]+"es: "+resultado);
            }catch (Exception e){
                System.out.println("Ocurrio un error de tipo: "+e);
            }
            /*catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No se encontro ese elemento...");
            }catch (ArithmeticException e){
                System.out.println("No existe division para cero...");
            }*/

        Scanner sc= new Scanner(System.in);
        CrearReporte nuevoReporte = new CrearReporte();
        System.out.println("Ingrese el nombre para su archivo: ");
        String nombreReporte= sc.nextLine();
        System.out.println("Ingrese el titulo de su archivo: ");
        String tituloReporte = sc.nextLine();
        nuevoReporte.setNombreReporte(nombreReporte);
        nuevoReporte.setTituloReporte(tituloReporte);
        nuevoReporte.setExtensionReporte("txt");
        System.out.println("Ingrese el contenido de su archivo: ");
        String contenidoReporte= nuevoReporte.getTituloReporte()+"\n\n"+sc.nextLine();
        nuevoReporte.setContenidoReporte(contenidoReporte);
        nuevoReporte.crearReporte();

        }
    }

