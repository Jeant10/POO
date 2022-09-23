package edu.epn.Interfaces;

public class Mujer implements AccionesGeneralesSerHumano, AccionesGenerales{
    @Override
    public String tocarInstrumento() {
        return "estoy tocando un piano";
    }

    @Override
    public String trabajar() {
        return "estoy trabajando en la Poli";
    }

    @Override
    public String bailar() {
        return "estoy bailando salsa";
    }

    @Override
    public String comer() {
        return "estoy comiendo en una mesa...";
    }

    @Override
    public String dormir() {
        return "estoy durmiendo en cama....";
    }

    @Override
    public String jugar() {
        return "estoy jugando futbol..";
    }

    @Override
    public String estudiar() {
        return "estoy estudiando en un instituto...";
    }


}
