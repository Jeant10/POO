package edu.epn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // write your code here
        //crear un lista de numeros
        // agregar
        //buscar
        //modificar
        //eliminar
        /*ArrayList<Double> listaNumeros = new ArrayList<Double>();
        Scanner sc = new Scanner(System.in);
        int op;
        OperacionesNumeros operacionesNumeros= new OperacionesNumeros();
        do{
            System.out.println("LISTAS DE NUMEROS");
            System.out.println("Seleccione la opcion que desea realizar");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar");
            System.out.println("5. Insertar numero en un lugar especifico");
            System.out.println("6. Mostrar");
            System.out.println("7. Ordenar ascendente");
            System.out.println("8. Ordenar descendente");
            System.out.println("0. Salir");
            op=sc.nextInt();
            switch (op){
                case 1:
                    double numero;
                    numero=operacionesNumeros.ingresarNumero();
                    listaNumeros.add(numero);
                    break;
                case 2:
                    operacionesNumeros.buscarNumero(listaNumeros);
                    break;
                case 3:
                    operacionesNumeros.modificarNumero(listaNumeros);
                    break;
                case 4:
                    operacionesNumeros.eliminarNumero(listaNumeros);
                    break;
                case 5:
                    operacionesNumeros.insertarNumero(listaNumeros);
                    break;
                case 6:
                    operacionesNumeros.mostrarListaNumeros(listaNumeros);
                    break;
                case 7:
                    operacionesNumeros.ordenarAscendente(listaNumeros);
                    operacionesNumeros.mostrarListaNumeros(listaNumeros);
                    break;
                case 8:
                    operacionesNumeros.ordenarDescendente(listaNumeros);
                    operacionesNumeros.mostrarListaNumeros(listaNumeros);
                    break;
                default:
                    System.out.println("Ingrese una opcion correcta :(");

            }

        }while (op!=0);

*/
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        Scanner sc = new Scanner(System.in);
        listaEstudiantes.add(new Estudiante(12345));
        listaEstudiantes.add(new Estudiante(123456));
        listaEstudiantes.add(new Estudiante(1234567));

        int op;
        OperacionesNumeros operacionesNumeros = new OperacionesNumeros();
        do {
            System.out.println("LISTAS DE ESTUDIANTES");
            System.out.println("Seleccione la opcion que desea realizar");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Mostrar Estudiante");
            System.out.println("0. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = sc.next();
                    System.out.println("Apellido: ");
                    String apellido = sc.next();
                    System.out.println("numero unico: ");
                    int numeroUnico = sc.nextInt();
                    listaEstudiantes.add(new Estudiante(nombre, apellido, numeroUnico));
                    System.out.println("El estudiantes fue ingresado de forma correcta :)");
                    break;
                case 2:
                    int numeroUnicoAux;
                    int indice;
                    System.out.println("Ingrese el numero unico del estudiante a buscar: ");
                    numeroUnicoAux = sc.nextInt();
                    Estudiante estudianteAux = new Estudiante(numeroUnicoAux);
                    indice = listaEstudiantes.indexOf(estudianteAux);
                    if (indice != -1) {
                        estudianteAux = listaEstudiantes.get(indice);
                        System.out.println(estudianteAux);
                    } else {
                        System.out.println("El estudiante no se encuentra en la lista :(");
                    }
                    break;
                case 3:
                    if (listaEstudiantes.size() > 0) {
                        for (Estudiante est : listaEstudiantes) {
                            System.out.println(est);
                        }
                    } else {
                        System.out.println("No existe estudiante registrados");
                    }
                    break;
            }

        } while (op != 0);

    }
}
