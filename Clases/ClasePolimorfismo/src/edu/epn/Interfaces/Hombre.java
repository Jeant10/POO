package edu.epn.Interfaces;

public class Hombre extends AccionesGenerales2{
    @Override
    public String comer() {
        return "Soy un hombre y estoy comiendo....";
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String estudiar() {
        return null;
    }

    @Override
    public String bailar(String tipoMusica) {
        return super.bailar(tipoMusica)+"guiando a la mujer...";
    }
}
