package examen1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ejercicio 1
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        int peso;
        int opc;
        Animal arca = new Animal();
        ArrayList<Animal> listadeanimales = new ArrayList<Animal>();
        do{
            System.out.println("-----------------------------------Bienvenidos al ARCA DE NOÉ---------------------------------------");
            System.out.println("------------------------------------------MENÚ PRINCIPAL---------------------------------------------\n");
            System.out.println("Ingrese el peso máximo que el ARCA SOPORTA (las unidades son en Kg), si desea salir ingrese 0:");
            peso = sc.nextInt();
            sc.nextLine();
            if(peso == 0){
                ok = true;
            }
            else{
                do{
                    System.out.println("-----------------------------------Bienvenidos al ARCA DE NOÉ---------------------------------------");
                    System.out.println("--------------------------------------MENÚ SECUNDARIO---------------------------------------------");
                    System.out.println("Seleccione la opción que desea ejecutar:");
                    System.out.println("1) Ingresar animales al arca");
                    System.out.println("2) Visualizar los animales que se encuentran en el arca");
                    System.out.println("3) Buscar un animal en el arca.");
                    System.out.println("4) Eliminar un animal que se encuentra en el arca");
                    System.out.println("5) Generar reporte");
                    System.out.println("6) Regresar al menú principal");
                    opc = sc.nextInt();
                    switch (opc){
                        case 1:
                            arca.ingresaranimal(listadeanimales);
                            break;
                        case 2:
                            arca.mostrarreporte(listadeanimales);
                            break;
                        case 3:
                            arca.buscarAnimal(listadeanimales);
                            break;
                        case 4:
                            arca.eliminarAnimal(listadeanimales);
                            break;
                        case 5:
                            arca.mostrarlista(listadeanimales);
                            break;
                    }
                    ok = true;
                } while(opc != 6);
            }

        }while(ok == false);

        //Ejercicio 2
        int opcion;
        Producto mercado = new Producto();
        ArrayList<Producto> carrito = new ArrayList<Producto>();

        Producto lacteos[] = new Producto[6];
        lacteos[0] = new Producto("Leche",0.75);
        lacteos[1] = new Producto("Crema de Leche", 1.25);
        lacteos[2] = new Producto("Yogur", 2);
        lacteos[3] = new Producto("Quesos",2.35);
        lacteos[4] = new Producto("Requeson",2.75);
        lacteos[5] = new Producto("Ricotta",3.15);

        Producto carnes[] = new Producto[4];
        carnes[0] = new Producto("Pollo",3);
        carnes[1] = new Producto("Res",2.75);
        carnes[2] = new Producto("Cerdo",3.75);
        carnes[3] = new Producto("Pescado",4.25);

        Producto verduras[] = new Producto[6];
        verduras[0] = new Producto("Zanahoria",0.35);
        verduras[1] = new Producto("Rabano",0.45);
        verduras[2] = new Producto("Cebolla",0.3);
        verduras[3] = new Producto("Ajo",0.15);
        verduras[4] = new Producto("Esparrago",0.95);
        verduras[5] = new Producto("Lechuga",0.75);


        Producto embutidos[] = new Producto[5];
        embutidos[0] = new Producto("Chorizos",1.05);
        embutidos[1] = new Producto("Salchichas",1.25);
        embutidos[2] = new Producto("Salames",2.05);
        embutidos[3] = new Producto("Mortadelas",1.45);
        embutidos[4] = new Producto("Jamon cocido",2.25);

        Producto frutas[] = new Producto[6];
        frutas[0] = new Producto("Manzana",0.35);
        frutas[1] = new Producto("Frutillas",1.5);
        frutas[2] = new Producto("Sandias",2);
        frutas[3] = new Producto("Uva",1.75);
        frutas[4] = new Producto("Mandarinas",0.25);
        frutas[5] = new Producto("Uvillas",2.35);


        Producto bebidas[] = new Producto[5];
        bebidas[0] = new Producto("Gaseosas",1);
        bebidas[1] = new Producto("Jugos Naturales",2);
        bebidas[2] = new Producto("Licores",6.25);
        bebidas[3] = new Producto("Aguas Naturales",1);
        bebidas[4] = new Producto("Aguas con gas",1.5);

        do{
            System.out.println("MENÚ TIPO PRODUCTOS\n" +
                    "1. LACTEOS\n" +
                    "2. CARNES\n" +
                    "3. VERDURAS\n" +
                    "4. EMBUTIDOS\n" +
                    "5. FRUTAS\n" +
                    "6. BEBIDAS\n" +
                    "7. Terminar compra ");

            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    mercado.agregarproducto(lacteos,carrito,opcion);
                    break;
                case 2:
                    mercado.agregarproducto(carnes,carrito,opcion);
                    break;
                case 3:
                    mercado.agregarproducto(verduras,carrito,opcion);
                    break;
                case 4:
                    mercado.agregarproducto(embutidos,carrito,opcion);
                    break;
                case 5:
                    mercado.agregarproducto(frutas,carrito,opcion);
                    break;
                case 6:
                    mercado.agregarproducto(bebidas,carrito,opcion);
                    break;
            }
        } while(opcion!=7);
        mercado.mostrarlista(carrito);
    }
}
