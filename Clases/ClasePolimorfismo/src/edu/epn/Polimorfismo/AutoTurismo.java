package edu.epn.Polimorfismo;

public class AutoTurismo extends Auto{
    private int numeroPasajeros;
    public AutoTurismo(String matricula, String marca, String modelo, int numeroPasajeros) {
        super(matricula, marca, modelo);
        this.numeroPasajeros=numeroPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"\n Numero de pasajeros: "+numeroPasajeros;
    }

    @Override
    public String toString() {
        return "AutoTurismo{" +
                "numeroPasajeros=" + numeroPasajeros +
                '}';
    }
}
