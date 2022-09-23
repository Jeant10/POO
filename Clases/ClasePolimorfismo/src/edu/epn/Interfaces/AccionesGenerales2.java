package edu.epn.Interfaces;

public abstract class AccionesGenerales2 {
    public abstract String comer();
    public abstract String dormir();
    public abstract String estudiar();

    public String trabajar(){
        return "Debo trabajar para poder vivir...";
    }

    public String bailar(String tipoMusica){
        return "Estoy bailando "+tipoMusica;
    }


}
