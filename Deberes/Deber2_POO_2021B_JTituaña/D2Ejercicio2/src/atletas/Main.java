package atletas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String nombre;
        int time;
        int numerodeatletas;

        System.out.println("Digite el numero de atletas:");
        numerodeatletas = sc.nextInt();
        Atleta listaAtletas[] = new Atleta[numerodeatletas];
        for(int i = 0; i < listaAtletas.length; i++){
            System.out.println("Digite los datos del atleta: ");
            System.out.println("Numero: ");
            num = sc.nextInt();
            sc.nextLine();
            System.out.println("Nombre: ");
            nombre = sc.nextLine();
            System.out.println("Tiempo en minutos: ");
            time = sc.nextInt();
            listaAtletas[i] = new Atleta(num, nombre,time);
        }
        System.out.println("Lista de Atletas: ");
        Atleta.listado_atletas(listaAtletas);
    }
}
