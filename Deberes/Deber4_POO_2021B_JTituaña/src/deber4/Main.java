package deber4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("---------Deber 4---------");
            System.out.println("1.-Ejercicio 1");
            System.out.println("2.-Ejercicio 2");
            System.out.println("3.-Ejercicio 3");
            System.out.println("4.-Ejercicio 4");
            System.out.println("0.-Salir");
            System.out.println("---------------------------------------------------");
            System.out.println("Eliga una opcion");
            System.out.println("---------------------------------------------------");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    /*El programa consiste en simular un sistema de ingreso de Estudiantes (nombre, apellido,
                    dirección, número único) y las notas. El ingreso será de n estudiantes, esto lo decide el
                    usuario. El programa debe permitir:
                    a. Mostrar un reporte de la lista en orden alfabético (apellido)
                    b. Mostrar un reporte de la lista en orden de notas (mayor a menor).
                    c. Ingresar un nuevo estudiante.
                    d. Mostrar un estudiante a partir de su número único.
                    e. Eliminar a un estudiante.
                    f. Modificar la dirección de un estudiante, dado su código*/

                    ArrayList<Estudiante> listaEstudiantes = new ArrayList <Estudiante>();
                    int opc;
                    Estudiante estudiantes = new Estudiante();
                    do{
                        System.out.println("---------Sistema de Gestion de estudiantes---------");
                        System.out.println("1.-Ingresar un nuevo estudiante");
                        System.out.println("2.-Buscar Estudiante");
                        System.out.println("3.-Eliminar Estudiante");
                        System.out.println("4.-Modificar Estudiante");
                        System.out.println("5.-Reporte de estudiantes en orden alfabetico");
                        System.out.println("6.-Reporte de estudiante por notas (mayor a menor)");
                        System.out.println("0.-Salir");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Eliga una opcion");
                        System.out.println("---------------------------------------------------");
                        opc = sc.nextInt();
                        switch(opc){
                            case 1:
                                estudiantes.ingresarEstudiante(listaEstudiantes);
                                break;
                            case 2:
                                estudiantes.buscarEstudiante(listaEstudiantes);
                                break;
                            case 3:
                                estudiantes.eliminarEstudiante(listaEstudiantes);
                                break;
                            case 4:
                                estudiantes.modificarEstudiante(listaEstudiantes);
                                break;
                            case 5:
                                estudiantes.ordenarpornombre(listaEstudiantes);
                                estudiantes.mostrarlista(listaEstudiantes);
                                break;
                            case 6:
                                estudiantes.ordenarpornotas(listaEstudiantes);
                                estudiantes.mostrarlista(listaEstudiantes);
                                break;
                        }
                    } while(opc!=0);
                    System.out.println("Saliendo del sistema......");
                    break;
                case 2:

                    /*El programa consiste en simular un sistema de ingreso de n personas: cédula, apellidos,
                    nombres, sexo, edad y peso. Permitirle al usuario realizar las siguientes actividades:
                    a. Buscar una persona según la cedula.
                    b. Eliminar una persona según la cedula
                    c. Ordenar personas por apellidos
                    d. Mostrar todas las personas.*/

                    ArrayList<Persona> listaPersonas = new ArrayList <Persona>();
                    int opc2;
                    Persona personas = new Persona();
                    do{
                        System.out.println("---------Sistema de Gestion de personas---------");
                        System.out.println("1.-Ingresar Persona");
                        System.out.println("2.-Buscar Persona");
                        System.out.println("3.-Eliminar Persona");
                        System.out.println("4.-Ordenar por apellido");
                        System.out.println("5.-Mostrar personas");
                        System.out.println("0.-Salir");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Eliga una opcion");
                        System.out.println("---------------------------------------------------");
                        opc2 = sc.nextInt();
                        switch(opc2){
                            case 1:
                                personas.ingresarPersona(listaPersonas);
                                break;
                            case 2:
                                personas.buscarPersona(listaPersonas);
                                break;
                            case 3:
                                personas.eliminarPersona(listaPersonas);
                                break;
                            case 4:
                                personas.ordenarporapellido(listaPersonas);
                                personas.mostrarlista(listaPersonas);
                                break;
                            case 5:
                                personas.mostrarlista(listaPersonas);
                                break;
                        }
                    } while(opc2!=0);
                    System.out.println("Saliendo del sistema......");
                    break;
                case 3:
                    /*Un restaurante necesita un sistema que permita conocer sus insumos necesarios para la elaboración de los platos que ofrece en carta, para ello:
                    a. El encargado del almacén posee un listado con código, nombre, cantidad en
                    existencia y stock mínimo.
                    b. El encargado de la cocina elabora solicitudes de insumos constantemente, en las
                    cuales especifica: código y cantidad requerida.
                     c. El encargado del almacén, al recibir la orden, envía la cantidad requerida y
                     periódicamente, emite un listado con los códigos de los insumos que llegaron al
                    stock mínimo.*/

                    ArrayList<insumo> listainsumos = new ArrayList<insumo>();
                    insumo insumos = new insumo();
                    listainsumos.add(new insumo(54856,"Maiz Dulce",160,100));
                    listainsumos.add(new insumo(54820,"Aceitunas",200,50));
                    listainsumos.add(new insumo(64025,"Tomate seco",320,150));
                    listainsumos.add(new insumo(62062,"Pepinillos en vinagre",84,100));
                    listainsumos.add(new insumo(17202,"Pimientos asados",100,100));
                    boolean ok = false;
                    int opc3;
                    do{
                        System.out.println("---------Sistema del Restaurante---------");
                        System.out.println("1.-Ingresar un nuevo insumo");
                        System.out.println("2.-Enviar solicitud");
                        System.out.println("3.-Listado de los insumos");
                        System.out.println("0.-Salir");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Eliga una opcion");
                        System.out.println("---------------------------------------------------");
                        opc3 = sc.nextInt();
                        switch (opc3){
                            case 1:
                                insumos.ingresarAlmacen(listainsumos);
                                break;
                            case 2:
                                insumos.buscarInsumo(listainsumos);
                                insumos.stockminimo(listainsumos);
                                break;
                            case 3:
                                insumos.mostrarlista(listainsumos);
                        }
                    } while(opc3!=0);
                    System.out.println("Saliendo del sistema...");
                    break;
                case 4:

                    /*El programa consiste en leer los nombres, edades y tallas de n personas. Con esa información calcular:
                    a. El promedio de las edades y de las tallas.
                    b. Determinar cuántas personas son menores de edad (menores de 18 años) y cuantas
                    son mayores de edad.
                    c. Mostrar los nombres de las personas que son más altos que el promedio.*/

                    ArrayList <nuevapersona> listadepersonas = new ArrayList<nuevapersona>();
                    nuevapersona nuevaspersonas = new nuevapersona();
                    int opc4;
                    do{
                        System.out.println("---------Sistema de Gestion de personas---------");
                        System.out.println("1.-Ingresar personas");
                        System.out.println("2.-Promedio de edades y tallas");
                        System.out.println("3.-Mayores y Menores de edad");
                        System.out.println("4.-Personas de alto promedio");
                        System.out.println("0.-Salir");
                        System.out.println("---------------------------------------------------");
                        System.out.println("Eliga una opcion");
                        System.out.println("---------------------------------------------------");
                        opc4 = sc.nextInt();
                        switch (opc4){
                            case 1:
                                nuevaspersonas.ingresarPersonas(listadepersonas);
                                break;
                            case 2:
                                System.out.println("Promedio de edades: ");
                                System.out.println(nuevaspersonas.promedioedades(listadepersonas));
                                System.out.println("Promedio de tallas: ");
                                System.out.println(nuevaspersonas.promediotallas(listadepersonas));
                                break;
                            case 3:
                                System.out.println("Mayores de edad: ");
                                nuevaspersonas.mayoresdeedad(listadepersonas);
                                System.out.println("Menores de edad: ");
                                nuevaspersonas.menoresdeedad(listadepersonas);
                                break;
                            case 4:
                                System.out.println("Lista de personas altas al promedio");
                                nuevaspersonas.promediosaltos(listadepersonas);
                                break;
                        }
                    } while(opc4!=0);
                    System.out.println("Saliendo del sistema...");
                    break;
            }
        }while(opcion!=0);
    }
}
