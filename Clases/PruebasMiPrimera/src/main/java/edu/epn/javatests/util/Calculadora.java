package edu.epn.javatests.util;

public class Calculadora {
    public double suma(double a, double b){
        return a+b;
    }

    public double resta(double a, double b){
        return a-b;
    }

    public double multiplicar(double a, double b){
        return a*b;
    }

    public double dividir(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Divisor debe ser distinto de cero");
        }
        return a / b;
    }
}
