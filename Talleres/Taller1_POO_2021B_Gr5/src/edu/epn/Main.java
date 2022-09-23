package edu.epn;

public class Main {

    public static void main(String[] args) {

        /*Hay que descomentar los ejercicios que se quieran ejecutar*/

        //Ejercicio 1
//        Complejo c1 = new Complejo(1.0, 1.0);
//        Complejo c2 = new Complejo(2.0, 2.0);
//        Complejo c3;
//        System.out.println("Numeros Complejos");
//        System.out.println("Sumar");
//        c3 = c1.sumar(c2);
//        System.out.println(c1 + " + " + c2 + " = " + c3);
//        System.out.println("Restar");
//        c3 = c1.restar(c2);
//        System.out.println(c1 + " - " + c2 + " = " + c3);
//        System.out.println("Multiplicar");
//        c3 = c1.multiplicar(c2);
//        System.out.println(c1 + " * " + c2 + " = " + c3);
//        System.out.println("Dividir");
//        c3 = c1.dividir(c2);
//        System.out.println(c1 + " / " + c2 + " = " + c3);

        //Ejercicio 2
//        Punto punto1 = new Punto(4,5);
//        System.out.println("Coordenadas del punto: ");
//        System.out.println(punto1);

        //Ejercicio 3
//        Rectangulo rectangulo1 = new Rectangulo(3,4);
//        Vertice vertice1 = new Vertice(3,2);
//        Vertice vertice2 = new Vertice(3,6);
//        Vertice vertice3 = new Vertice(9,6);
//        Vertice vertice4 = new Vertice(9,2);
//        System.out.println("Rectangulo 1: Por base y altura");
//        System.out.println("Rectangulo 2: Por cuatro puntos");
//        Rectangulo rectangulo2 = new Rectangulo(vertice1, vertice2, vertice3,vertice4);
//        System.out.println("Coordenadas del Rectangulo 2: ");
//        System.out.println(vertice1 + "\n" + vertice2 + "\n" + vertice3 + "\n"+ vertice4);
//        rectangulo2.desplazar(3, 8);
//        System.out.println("Corrdenadas del Rectangulo 2 Desplazado: ");
//        System.out.println(vertice1 + "\n" + vertice2 + "\n" + vertice3 + "\n"+ vertice4);
//        System.out.println("Superficie del Rectangulo 1: " + rectangulo1.superficie(rectangulo1.getV2(),rectangulo1.getV3()));
//        System.out.println("Superficie del Rectangulo 2: " + rectangulo2.superficie(vertice1,vertice3));

        //Ejercicio 4
        Cuenta cuenta1 = new Cuenta(1726887332, 250, 17.5);
        cuenta1.crearCuenta();
        cuenta1.mostrarDatos();

        //Ejercicio 5
//        Coche coche1 = new Coche();
//        coche1.puertas();
//        coche1.ruedas();
//        coche1.ventana();
//        coche1.motor();

        //Ejercicio 6
//        Libro libro1 = new Libro();
//        libro1.leerDatos();
//        libro1.mostrarDatos();

    }
}
