package deber4;

import java.util.ArrayList;
import java.util.Scanner;

public class nuevapersona {
    String nuevosnombres;
    int edad;
    int talla;
    Scanner sc = new Scanner(System.in);
    public nuevapersona() {
    }

    public nuevapersona(String nuevosnombres, int edad, int talla) {
        this.nuevosnombres = nuevosnombres;
        this.edad = edad;
        this.talla = talla;
    }

    public void ingresarPersonas(ArrayList <nuevapersona> listadepersonas){
        System.out.println("---------------------------------------------------");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        System.out.println("Talla: ");
        int talla = sc.nextInt();
        listadepersonas.add(new nuevapersona(nombre,edad,talla));
        System.out.println("---------------------------------------------------");
        sc.nextLine();
    }

    public double promedioedades(ArrayList <nuevapersona> listadepersonas){
        int contador = 0;
        for (int i = 0; i < listadepersonas.size(); i++) {
            contador = contador + listadepersonas.get(i).edad;
        }
        return (double) contador/listadepersonas.size();
    }

    public double promediotallas(ArrayList <nuevapersona> listadepersonas){
        int contador = 0;
        for (int i = 0; i < listadepersonas.size(); i++) {
            contador = contador + listadepersonas.get(i).talla;
        }
        return (double) contador / listadepersonas.size();
    }

    public void mayoresdeedad(ArrayList <nuevapersona> listapersonas){
        int suma = 0;
        for (int i = 0; i < listapersonas.size(); i++){
            if(listapersonas.get(i).edad > 18){
                suma++;
            }
        }
        System.out.println(suma);
    }

    public void menoresdeedad(ArrayList <nuevapersona> listapersonas){
        int suma = 0;
        for (int i = 0; i < listapersonas.size(); i++){
            if(listapersonas.get(i).edad <= 18){
                suma++;
            }
        }
        System.out.println(suma);
    }

    public void promediosaltos(ArrayList <nuevapersona> listapersonas){
        ArrayList <nuevapersona> listapersonaAux = new ArrayList<nuevapersona>();
        int suma = 0;
        if(listapersonas.size() > 0){
            for (int i = 0; i < listapersonas.size(); i++){
                if(listapersonas.get(i).talla >= promediotallas(listapersonas)){
                    listapersonaAux.add(listapersonas.get(i));
                }
            }
            mostrarlista(listapersonaAux);
        }
        else{
            System.out.println("---------------------------------------------------");
            System.out.println("No existen personas registradas");
            System.out.println("---------------------------------------------------");
        }
    }

    public void mostrarlista(ArrayList <nuevapersona> listapersonas){
        System.out.println("---------------------------------------Lista de personas--------------------------------------------");
        for(nuevapersona est : listapersonas)
        {
            System.out.println(est);
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return " Persona: " +
                "  Nombre='" + nuevosnombres +
                ", Edad=" + edad +
                ", Talla=" + talla;
    }
}
