package edu.epn;

import java.util.Scanner;

public class Operacion {
    //atributos
    //int numero1;
    //int numero2;



    //metodos
   /* public void ingDatos (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1: ");
        numero1= Integer.parseInt(sc.nextLine());
        System.out.println("Numero 2: ");
        numero2= Integer.parseInt(sc.nextLine());

    }*/

    public int sumar (int num1 , int num2){
        //System.out.println("La suma es:"+(numero1+numero2));
        return num1+num2;
    }

    public int restar (int num1, int num2){
        //System.out.println("La resta es:"+(numero1-numero2));
        return num1-num2;
    }
    public int mult (int num1, int num2){
        //System.out.println("La multiplicacion es:"+(numero1*numero2));
        return num1*num2;
    }

    public double div (int num1, int num2){
       // System.out.println("La division es:"+(numero1/numero2));
        return num1/num2;
    }

}
