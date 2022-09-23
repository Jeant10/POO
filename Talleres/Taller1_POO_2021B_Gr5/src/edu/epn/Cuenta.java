package edu.epn;

public class Cuenta {

    private int numeroCuenta = 100000, cedulaCliente;
    private double saldoActual, interesAnual;

    public Cuenta(){
    }

    public Cuenta(int cedula, double saldo, double interes){
        cedulaCliente = cedula;
        saldoActual = saldo;
        interesAnual = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public void crearCuenta(){
        numeroCuenta += 1;
    }

    public void actualizarSaldo(){
        double interesDiario = interesAnual/365;
        saldoActual *= interesDiario;
        System.out.println("Saldo actualizado.");
    }

    public void ingresar(double saldoIngresado){
        saldoActual += saldoIngresado;
        System.out.println("Ha ingresado $" + saldoIngresado + " dolares a su cuenta.");
    }

    public void retirar(double saldoRetirado){
        if(saldoActual >= saldoRetirado){
            saldoActual -= saldoRetirado;
            System.out.println("Ha retirado $" + saldoRetirado + " dolares de su cuenta.");
        } else {
            System.out.println("No tiene suficiente saldo en su cuenta.");
        }
    }

    public void mostrarDatos(){
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo actual de su cuenta: $" + saldoActual);
        System.out.println("Valor de interes anual de su cuenta: " + interesAnual + "%");
    }
}
