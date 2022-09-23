package edu.epn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Constantes
        /*final int VALOR = 8;// final es la palabra clave para una constante
        final int VALOR_MAXIMO = 10;
        final int VALOR_MINIMO = 2;

        System.out.println("Mi constante es: "+VALOR);

      //  VALOR = 10;

        System.out.println("Mi nueva constante es: "+VALOR);

        //Operadores de incremento y decremento
        int x = 10;
        System.out.println("El valor de X es: " +x);
        x++;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println("-----"+x);
        ++x;
        System.out.println(x);
        x++;
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(++x);

        char A = 'c';
        char B;

        System.out.println(A++);
        B = --A;
        System.out.println(B);
        A++;
        System.out.println(A);

        System.out.println("EL valor de PI es:" +Math.PI);
        System.out.println("EL valor de PI es:" +Math.E);

        int valor=-13;
        double valor2 = 0.1234567;
        System.out.println("El valor absoluto de "+valor+ " es: "+Math
        .abs(valor));
        System.out.println("El valor absoluto de "+valor2+ " es: "+Math
                .abs(valor2));*/
        Scanner sc = new Scanner(System.in);// instanciando un objeto de la clase Scanner para
        //poder almacenar los datos que nos ingresen desde teclado

        double numero1;
        String nombre;
        char letra;
        System.out.println("Digite un numero: ");
        numero1=sc.nextDouble();
        System.out.println("El numero del usuario es: "+numero1);
       // System.out.println("Cual es su nombre: ");
        //nombre = sc.next();
        System.out.println("Digita un caracter: ");
        letra=sc.next().charAt(1);
        System.out.println("Tu nombre es: "+letra);
    }


    /**Descripcion: entra de datos desde el teclado por parte del usuario final
     * @author Ivonne
     * @param a Es el primer dato
     * @param b Es el segundo dato a sumar
     * @return la suma de los dos numeros que se han dado
     *
     */
    public static double resta(double a,double b){
        double respuesta =a+b;
        return respuesta;
    }

    /**Descripcion: entra de datos desde el teclado por parte del usuario final
     * @author Ivonne
     * @param num1 Es el primer dato
     * @param num2 Es el segundo dato a sumar
     * @return la suma de los dos numeros que se han dado
     *
     */
     public static double suma(double num1,double num2){
        double respuesta =num1+num2;
        return respuesta;
    }

}
