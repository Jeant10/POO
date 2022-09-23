package edu.epn.Interfaces;

public class Perro implements AccionesGenerales{
    @Override
    public String comer() {
        return "Estoy comiendo en el suelo en mi platito";
    }

    @Override
    public String dormir() {
        return "Estoy durmiendo en el suelo...";
    }

    @Override
    public String jugar() {
        return "estoy jugando con un hueso";
    }

    @Override
    public String estudiar() {
        return "Voy a la escuela canina";
    }
}
