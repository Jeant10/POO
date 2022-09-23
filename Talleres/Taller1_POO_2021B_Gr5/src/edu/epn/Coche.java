package edu.epn;


public class Coche {

    String motor = "Motor electrico.";
    int ruedas = 4;
    int puertas = 2;

    public void puertas(){
        Puerta puerta1 = new Puerta();
        puerta1.abrirPuerta();
    }

    public void ruedas(){
        Rueda rueda1 = new Rueda();
        rueda1.inflarRueda();
    }

    public void motor(){
        Motor motor1 = new Motor();
        motor1.encenderMotor();
    }

    public void ventana(){
        Ventana ventana1 = new Ventana();
        ventana1.abrirVentana();
    }
}
