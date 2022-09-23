package naipes;

public class Carta {

    String numero;
    String palo;

    Carta(String numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta {" +
                "numero='" + numero + '\'' +
                ", palo='" + palo + '\'' +
                '}';
    }
}
