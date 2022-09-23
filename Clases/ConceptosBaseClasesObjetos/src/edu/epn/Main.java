package edu.epn;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int n1= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        Operacion op1 = new Operacion();
        //op1.ingDatos();
        JOptionPane.showMessageDialog(null, op1.sumar(n1,n2));

        Scanner sc = new Scanner(System.in);
        Auto auto1 = new Auto();
        System.out.println("Digite los datos del auto:");
        System.out.println("Marca:");
        auto1.marca=sc.nextLine();
        System.out.println("Color:");
        auto1.color=sc.nextLine();
        System.out.println("km:");
        auto1.km=Integer.parseInt(sc.nextLine());
       auto1.mostrarDatos();
      //nombre de la clase   nombre del objeto  =  new el constructor;
     /*  Auto auto2 = new Auto("verde","audi",3000);
       Auto auto3 = new Auto("plata","audi");
       Auto auto4 = new Auto();


       /*auto1.color="negro";
       auto1.marca="mazda1";
       auto1.km=10000;*/
       /*auto1.acelerar(60);
       auto1.mostrarDatos();

       /*auto2.color="rojo";
       auto2.marca="ferrari";
       auto2.km=5000;*/
       /*auto2.mostrarDatos();



       Perro perro1 = new Perro();
       Perro perro2 = new Perro();

       perro1.nombre="Toby";
       perro1.edad=5;
       perro1.raza="Golden";
        System.out.println(perro1.nombre);


        System.out.println("Numero 1: ");
        int numero1= Integer.parseInt(sc.nextLine());
        System.out.println("Numero 2: ");
        int numero2= Integer.parseInt(sc.nextLine());

        Operacion op1 = new Operacion();
        //op1.ingDatos();
        int suma;
        suma=op1.sumar(numero1, numero2);
        System.out.println("La suma es: "+suma);

        System.out.println("La resta es: "+op1.restar(numero1,numero2));

        System.out.println("La multiplicacion es: "+op1.mult(numero1,numero2));
        System.out.println("La division es: "+op1.div(numero1,numero2));
*/

   

    }
}
