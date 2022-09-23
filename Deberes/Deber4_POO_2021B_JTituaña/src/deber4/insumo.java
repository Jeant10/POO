package deber4;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class insumo {
    int codigo;
    String nombre;
    int cantidadenexistencia;
    int stock;
    Scanner sc = new Scanner(System.in);


    public insumo() {
    }

    public insumo(int codigo, String nombre, int cantidadenexistencia, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadenexistencia = cantidadenexistencia;
        this.stock = stock;
    }

    public insumo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidadenexistencia() {
        return cantidadenexistencia;
    }

    public void setCantidadenexistencia(int cantidadenexistencia) {
        this.cantidadenexistencia = cantidadenexistencia;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void ingresarAlmacen(ArrayList<insumo> listainsumos){
        System.out.println("---------------------------------------------------");
        System.out.println("Codigo: ");
        int codigo = sc.nextInt();
        System.out.println("Nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Cantidad de existencias: ");
        int cantidadminima = sc.nextInt();
        System.out.println("Stock Minimo:");
        int stock = sc.nextInt();
        listainsumos.add(new insumo(codigo,nombre,cantidadminima,stock));
        System.out.println("---------------------------------------------------");
        sc.nextLine();
    }


    public void buscarInsumo(ArrayList <insumo> listainsumos){
        int codigoAux;
        int cantidadAux;
        int nuevacantidad;
        int indice;
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese el codigo: ");
        codigoAux = sc.nextInt();
        insumo insumoAux = new insumo(codigoAux);
        indice = listainsumos.indexOf(insumoAux);
        System.out.println("---------------------------------------------------");
        if(indice!=-1){
            System.out.println("Ingrese la cantidad requerida: ");
            cantidadAux = sc.nextInt();
            nuevacantidad = listainsumos.get(indice).getCantidadenexistencia() - cantidadAux;
            listainsumos.get(indice).setCantidadenexistencia(nuevacantidad);
            System.out.println("Solicitud enviada con exito!");
        }
        else{
            System.out.println("---------------------------------------------------");
            System.out.println("Insumo no se encuentra en la lista");
            System.out.println("---------------------------------------------------");
        }
        sc.nextLine();
    }


    public void stockminimo(ArrayList <insumo> listainsumos){
        ArrayList <insumo> listainsumosAux = new ArrayList<insumo>();
        boolean ok = false;
        int suma = 0;
        if(listainsumos.size() > 0){
            for (int i = 0; i < listainsumos.size(); i++){
                if(listainsumos.get(i).getCantidadenexistencia() <=  listainsumos.get(i).getStock()){
                    listainsumosAux.add(listainsumos.get(i));
                    ok = true;
                }
            }
            if(ok){
                System.out.println("Enviando solicitud ....");
                System.out.println("----------------------------Insumos que llegaron al stock minimo------------------------------");
                mostrarlista(listainsumosAux);
            }
            else{
                System.out.println("No existe insumos en stock!");
            }
        }
        else{
            System.out.println("---------------------------------------------------");
            System.out.println("No existen insumos registrados");
            System.out.println("---------------------------------------------------");
        }
    }

    public void mostrarlista(ArrayList <insumo> listainsumos){
        System.out.println("---------------------------------------Lista de insumos--------------------------------------------");
        for(insumo est : listainsumos)
        {
            System.out.println(est);
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "   Insumo: " +
                "  Codigo = " + codigo +
                ", Nombre='" + nombre +
                ", Cantidad de existencias = " + cantidadenexistencia +
                ", Stock Minimo: " + stock;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        insumo insumo2 = (insumo) o;
        if(!Objects.equals(this.codigo, insumo2.codigo)){
            return false;
        }
        return true;
    }

}
