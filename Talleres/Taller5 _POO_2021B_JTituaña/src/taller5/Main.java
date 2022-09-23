package taller5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<prestamo> prestamos = new ArrayList<prestamo>();
        prestamo cooperativa = new prestamo();
        final double velocidad_carretera = 48;
        final double velocidad_bicicleta = 40;
        final double velocidad_automovil = 90;
        final double velocidad_barco = 83.6;
        final double velocidad_avion  = 800;
        final double distancia_por_tierra = 418;
        final double distancia_por_aire = 217;
        double time;
        Time tiempo;
        int opcion;
        do{
            System.out.println("------Menu------");
            System.out.println("1.- Ejercicio 1");
            System.out.println("2.- Ejercicio 2");
            System.out.println("0.- Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    //Ejercicio 1
                    int op;
                    do{
                        System.out.println("-------COOPERATIVA POLITECNICA--------");
                        System.out.println("1.- Ingresar una solicitud de prestamo");
                        System.out.println("2.- Ver un determinado prestamo");
                        System.out.println("3.- Reporte de los prestamo realizados");
                        System.out.println("0.- Salir");
                        op = sc.nextInt();
                        switch (op){
                            case 1:
                                cooperativa.ingresarprestamo(prestamos);
                                break;
                            case 2:
                                cooperativa.buscarPrestamo(prestamos);
                                break;
                            case 3:
                                cooperativa.mostrarlista(prestamos);
                                break;
                        }
                    } while(op!=0);
                    break;
                case 2:
                    //Ejercicio 2
                    int opc;
                    do{
                        System.out.println("-----Viaje de Quito a Guayaquil-----");
                        System.out.println("Ingrese el medio de transporte");
                        System.out.println("1.- Carretera");
                        System.out.println("2.- Bicicleta");
                        System.out.println("3.- Automovil");
                        System.out.println("4.- Barco");
                        System.out.println("5.- Avion");
                        System.out.println("0.- Salir");
                        opc = sc.nextInt();
                        switch (opc){
                            case 1:
                                time = distancia_por_tierra/velocidad_carretera;
                                tiempo = Time.obtenertiempo(time);
                                System.out.println("EL tiempo en carretera es: " + tiempo);
                                break;
                            case 2:
                                time = distancia_por_tierra/velocidad_bicicleta;
                                tiempo = Time.obtenertiempo(time);
                                System.out.println("El tiempo en bicicleta es: " + tiempo);
                                break;
                            case 3:
                                time = distancia_por_tierra/velocidad_automovil;
                                tiempo = Time.obtenertiempo(time);
                                System.out.println("El tiempo en automovil es: " + tiempo);
                                break;
                            case 4:
                                System.out.println("No existe ruta maritima");
                                break;
                            case 5:
                                time = distancia_por_aire/velocidad_avion;
                                tiempo = Time.obtenertiempo(time);
                                System.out.println("El tiempo en avion es: " + tiempo);
                                break;
                        }
                    } while(opc!=0);

                    break;
            }
        }while(opcion!=0);

    }
}
