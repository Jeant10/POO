package edu.epn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class OperacionesNumeros {
    Scanner sc = new Scanner(System.in);
    public double ingresarNumero(){

        double numero;
        System.out.println("Ingrese el numero: ");
        numero= sc.nextDouble();
        return numero;

    }

    public void buscarNumero(ArrayList<Double> listaNumeros){

        double numero;
        int indice;
        System.out.println("Ingrese el valor a buscar: ");
        numero=sc.nextDouble();
        indice =listaNumeros.indexOf(numero);
        if (indice != -1){
            System.out.println("El numero se encuentra en la posicion: "+indice);
        }else{
            System.out.println("El numero no se encuentra en la lista");
        }
    }

    public void modificarNumero(ArrayList<Double> listaNumeros){

        double numero, nuevoNumero;
        int indice;
        System.out.println("Ingrese el numero a modificar: ");
        numero=sc.nextDouble();
        indice= listaNumeros.indexOf(numero);
        if (indice != -1){
            System.out.println("Ingrese el nuevo numero: ");
            nuevoNumero=sc.nextDouble();
            listaNumeros.set(indice,nuevoNumero);
        }else{
            System.out.println("El numero no se encuentra en la lista");
        }
    }

    public void eliminarNumero(ArrayList<Double> listaNumeros){

        double numero;
        int indice;
        System.out.println("Ingrese el numero a eliminar: ");
        numero=sc.nextDouble();
        indice=listaNumeros.indexOf(numero);
        if (indice != -1){
             listaNumeros.remove(indice);
        }else{
            System.out.println("El numero no se encuentra en la lista");
        }
    }

    public void insertarNumero(ArrayList<Double> listaNumeros){

        double numero;
        int indice;
        System.out.println("Ingrese el numero: ");
        numero=sc.nextDouble();
        System.out.println("En que posicion desea insertarlo: ");
        indice=sc.nextInt();
        listaNumeros.add(indice, numero);
    }

    public void mostrarListaNumeros(ArrayList<Double> listaNumeros){

        if(!listaNumeros.isEmpty()){
            System.out.println("Mi lista de numeros es: ");
            for(int i=0; i<listaNumeros.size();i++){
                System.out.println(listaNumeros.get(i));
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }

    public void ordenarAscendente(ArrayList<Double> listaNumeros){
        Collections.sort(listaNumeros);
    }

    public  void ordenarDescendente(ArrayList<Double> listaNumeros){
        Comparator<Double> comparador = Collections.reverseOrder();
        Collections.sort(listaNumeros, comparador);

    }


}
