package cafetera;

import java.util.Scanner;

public class Cafetera {

    Scanner in = new Scanner(System.in);

    int _capacidadMaxima, _capacidadActual;

    public Cafetera() {
        this._capacidadMaxima = 1000;
        this._capacidadActual = 0;
    }

    public Cafetera(int _capacidadMaxima) {

        this._capacidadMaxima = _capacidadMaxima;
        this._capacidadActual = _capacidadMaxima;

    }

    public Cafetera(int _capacidadMaxima, int _capacidadActual) {

        if (_capacidadActual > _capacidadMaxima) {

            this._capacidadMaxima = _capacidadMaxima;
            this._capacidadActual = _capacidadMaxima;

        } else {
            this._capacidadMaxima = _capacidadMaxima;
            this._capacidadActual = _capacidadActual;
        }
    }

    public void llenarCafetera() {

        this._capacidadActual = _capacidadMaxima;
        System.out.println("La capacidad maxima es de: " + _capacidadMaxima + " cc");
        System.out.println("-----------------");
        System.out.println("Llenando cafetera");
        System.out.println("-----------------");
        System.out.println("La cantidad de cafe actual es de: " + _capacidadActual);

    }

    public void servirTaza() {
        System.out.println("Ingrese la cantidad de cafe que desea?");
        int _capacidadTaza = in.nextInt();

        _capacidadActual -= _capacidadTaza;
        if (_capacidadActual <= 0) {
            _capacidadActual = 0;
            System.out.println("-----------------");
            System.out.println("¡Cafetera vacia!");
            System.out.println("-----------------");
            System.out.println("La cantidad de cafe actual es de: " + _capacidadActual);

        } else {
            System.out.println("---------------------");
            System.out.println("Llenando taza...");
            System.out.println("Taza llena!");
            System.out.println("La cantidad de cafe actual es de: " + _capacidadActual);
        }
    }

    public void vaciarCafetera() {
        _capacidadActual = 0;
        System.out.println("--------------------");
        System.out.println("Vaciando cafetera...");
        System.out.println("--------------------");

    }

    public void agregarCafe() {
        vaciarCafetera();
        System.out.println("Agregue cafe por favor");
        int llenado = in.nextInt();
        _capacidadActual += llenado;

        if (_capacidadActual > _capacidadMaxima) {

            System.out.println("Excede la capacidad maxima");

        } else {
            System.out.println("-----------------");
            System.out.println("Llenando cafetera");
            System.out.println("-----------------");
            System.out.println("La cantidad de cafe actual es de: " + _capacidadActual);
        }

    }

}
