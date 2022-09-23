package edu.epn.Polimorfismo;

public class AutoFurgoneta extends Auto{
    private int carga;
    public AutoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+"\n Carga: "+carga;
    }

    @Override
    public String toString() {
        return "AutoFurgoneta{" +
                "carga=" + carga +
                '}';
    }
}
