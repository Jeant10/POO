package edu.epn.Polimorfismo;

public class AutoDeportivo extends Auto{
    private int cilindraje;

    public AutoDeportivo(String matricula, String marca, String modelo, int cilindraje) {
        super(matricula, marca, modelo);
        this.cilindraje=cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"\n Cilindro: "+cilindraje;
        }

    @Override
    public String toString() {
        return "AutoDeportivo{" +
                "cilindraje=" + cilindraje +
                '}';
    }
}

