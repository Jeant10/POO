package edu.epn;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //salario entero
        double salario = 1000.98;
        var impuesto = salario * 0.03; //double
        var totalSalario = salario - impuesto; //double
        System.out.println("salario "+salario);
        System.out.println("impuesto "+ impuesto);
        System.out.println("Salario total "+totalSalario);

    }
}
