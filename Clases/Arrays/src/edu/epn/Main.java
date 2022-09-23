package edu.epn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*int [] numeros = new int[4];
        numeros[0]=5;
        numeros[1]=8;
        numeros[2]=4;
        numeros[3]=7;

        int [] numeros2 = {5,1,2,6,8};

        for (int i = 0; i < 4; i++) {
            System.out.print(numeros[i]);

        }

        System.out.println(numeros2[0]);
        System.out.println(numeros2[1]);
        System.out.println(numeros2[2]);
        System.out.println(numeros2[3]);
        System.out.println(numeros2[4]);
*/
        Scanner datosUsuario = new Scanner(System.in);
        int numeroElementos;
        System.out.println("Numero de elementos del arreglo: ");
        numeroElementos=Integer.parseInt(datosUsuario.nextLine());
        char[] letras = new char[numeroElementos];
        System.out.println("digite los elementos del arreglo: ");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println("Digite el caracter "+(i+1)+" :");
            letras[i]=datosUsuario.nextLine().charAt(0);
        }

        System.out.println("Los caracteres de su arreglo son: ");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print(letras[i]);
        }

        String [] estudiantes = {"Edison", "Xavier", "Nicole","Saul","Maria","Ivonne"};
        for (int i = 0; i <estudiantes.length ; i++) {
            System.out.println(estudiantes[i]);
        }

        for(String listaEstudiantes:estudiantes){
            System.out.println(listaEstudiantes);
        }

        int [][] arreglo2D = new int[2][3];//caben 6 elementos
        int [][][] arreglo3D = new int[3][3][2];//caben 18 lementos
        int [][][][] arreglo4D = new int[1][2][3][4];

        char [][] dias={{'L','M','M'},{'L','M','M'}};
        char [][][] letras2 = {{{'a','b','c'},{'a','b','c'},{'a','b','c'}},{{'a','b','c'},{'a','b','c'},{'a','b','c'}}};









    }
}
