package pasaporte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pasaporte pasaporte1 = new Pasaporte();
        pasaporte1.leer();
        int num1 = pasaporte1.calcularletra();
        pasaporte1.asignarletra(num1);
        System.out.println("Su pasaporte es: " + pasaporte1);
    }
}
