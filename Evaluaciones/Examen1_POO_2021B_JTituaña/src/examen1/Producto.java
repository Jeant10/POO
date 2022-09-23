package examen1;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto {
    String producto;
    double precio;
    Scanner sc = new Scanner(System.in);

    public Producto() {
    }

    public Producto(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }
    public void agregarproducto(Producto productos[], ArrayList<Producto> carrito,int opcion){
        int prod;
        String opc;
        double IVA = 0.12;
        int cantidad;
        double aumento;
        double total = 0;
        do{
            prod = mostrarproductos(productos);
            System.out.println("Ingrese la cantidad requerida: ");
            cantidad = sc.nextInt();
            if(opcion == 4){
                aumento =  (productos[prod].precio*cantidad)*IVA;
                total += (productos[prod].precio*cantidad) + aumento;
            }
            else if(opcion == 6){
                aumento =  (productos[prod].precio*cantidad)*IVA;
                total += (productos[prod].precio*cantidad) + aumento;
            }
            else{
                total += productos[prod].precio*cantidad;
            }
            System.out.println("Desea comprar otro producto de este tipo");
            opc = sc.nextLine();
            carrito.add(new Producto(productos[prod].producto,total));
        }while(opc!="Si");
    }

    public void mostrarlista(ArrayList<Producto> productos){
        double suma = 0;
        System.out.println("------------------------Lista de Productos----------------------------------");
        for(int i = 0; i < productos.size(); i++)
        {
            System.out.println(productos.get(i));
            suma += productos.get(i).precio;
        }
        System.out.println("Total: " + suma);
        System.out.println("----------------------------------------------------------------------------");
    }

    public int mostrarproductos(Producto productos[]){
        int op;
        int i;
        do{
            System.out.println("------------------------Lista de Productos----------------------------------");
            for(i = 0; i < productos.length; i++)
            {
                System.out.println("" + i + ") " + productos[i]);
            }
            System.out.println("0) Salir");
            System.out.println("Escoja una opcion: ");
            op = sc.nextInt();
            System.out.println("----------------------------------------------------------------------------");

            if(op < 0 && op > i){
                System.out.println("No existe esa opcion ... Vuelva a intentar");
            }

        } while(op < 0 && op > i);

        return op;
    }

    @Override
    public String toString() {
        return  "" + producto +
                " " + precio;
    }
}

