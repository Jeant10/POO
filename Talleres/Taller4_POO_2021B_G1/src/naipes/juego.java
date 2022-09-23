package naipes;

import java.lang.reflect.Array;
import java.util.*;

public class juego {

    ArrayList<Carta> naipeBarajado = new ArrayList<Carta>();
    HashMap<String, ArrayList<Carta>> cartasJugadores = new HashMap<>();

    public HashMap<String, ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }

    public void setCartasJugadores(HashMap<String, ArrayList<Carta>> cartasJugadores) {
        this.cartasJugadores = cartasJugadores;
    }

    public void imprimirjuego() {

        String palo[] = {"TREBOL", "DIAMANTE", "CORAZON", "PICA"};
        String numero[] = {"AS","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ","J","Q","K"
        };
        for(int j = 0; j < numero.length; j++){
            for(int i = 0; i < palo.length; i++){
                naipeBarajado.add(new Carta(numero[j],palo[i]));
            }
        }

        Collections.shuffle(naipeBarajado);

        for(Carta est : naipeBarajado){
            System.out.println(est);
        }

    }

    public void entregarCartas(int cartasPorJugador){
        ArrayList<Carta> player01 = new ArrayList<>();
        ArrayList<Carta> player02 = new ArrayList<>();
        ArrayList<Carta> player03 = new ArrayList<>();
        ArrayList<Carta> diPai = new ArrayList<>();
        // Recorre la colección List de índices de tarjetas almacenados y obtén el índice de cada tarjeta
        for (int i = 0; i <naipeBarajado.size() ; i++) {

            Carta in = naipeBarajado.get(i);
            int cartasnew = cartasPorJugador;
            if(i < cartasnew)
            {
                player01.add(in);
            }

            naipeBarajado.remove(i);
            cartasJugadores.put(String.valueOf(1),player01);
            cartasJugadores.put(String.valueOf(2),player02);
            cartasJugadores.put(String.valueOf(3),player03);
        }

    }



    public void mostrarcartas(){
        for(Map.Entry<String,ArrayList<Carta>> a: cartasJugadores.entrySet()){
            System.out.println(a.getKey()  + " - " + a.getValue());
        }
    }


}
