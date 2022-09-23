package cafetera;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cafetera datos = new Cafetera();
        Scanner in = new Scanner(System.in);

        System.out.println("Cafetera");
        datos.llenarCafetera();
        datos.servirTaza();
        datos.agregarCafe();
    }
}
