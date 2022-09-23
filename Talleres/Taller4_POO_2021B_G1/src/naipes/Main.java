package naipes;

public class Main {


    public static void main(String[] args) {
        juego naipes = new juego();
        naipes.imprimirjuego();
        naipes.entregarCartas(5);
        System.out.println("Mostrar");
        naipes.mostrarcartas();
    }
}
