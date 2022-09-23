package examen1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Animal {
    int id;
    String animal;
    double peso;
    Scanner sc = new Scanner(System.in);
    public Animal() {
    }

    public Animal(int id, String animal, double peso) {
        this.id = id;
        this.animal = animal;
        this.peso = peso;
    }

    public Animal(int id) {
        this.id = id;
    }

    public void ingresaranimal(ArrayList<Animal> listadeanimales){
        int op;
        String animal;
        double peso;
        System.out.println("-----------------------------------Bienvenidos al ARCA DE NOÉ---------------------------------------");
        System.out.println("------------------------------------ Ingresar animales al arca ---------------------------------------------\n");
        System.out.println("1 Ballena 200.000,0\n" +
                "2 Elefante 7.500,0\n" +
                "3 Jirafa 1.400,0\n" +
                "4 Hipopótamo 1.300,0\n" +
                "5 Camello 600,0\n" +
                "6 Vaca 550,0\n" +
                "7 Cebra 380,0\n" +
                "8 Tigre 290,0\n" +
                "9 León 250,0\n" +
                "10 Cerdo 130,0\n" +
                "11 Oveja 80,0\n" +
                "12 Chimpancé 60,0\n" +
                "13 Lobo 55,0\n" +
                "14 Perro 40,0\n" +
                "15 Gato 8,0\n" +
                "16 Zorro 7,0\n" +
                "17 Conejo 4,0\n" +
                "18 Rata 2,0\n" +
                "19 Ratón 0,4\n" +
                "20 Hámster 0,2");
        op = sc.nextInt();
        switch (op){
            case 1:
                animal = "Ballena";
                peso = 200000;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 2:
                animal = "Elefante";
                peso = 7500;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 3:
                animal = "Jirafa";
                peso = 1400;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 4:
                animal = "Hipopótamo";
                peso = 1.300;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 5:
                animal = "Camello";
                peso =  600;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 6:
                animal = "Vaca";
                peso =  550;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 7:
                animal = "Cebra";
                peso =  380;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 8:
                animal = "Tigre";
                peso =  290;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 9:
                animal = "León";
                peso =  250;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 10:
                animal = "Cerdo";
                peso =  130;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 11:
                animal = "Oveja";
                peso =  80;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 12:
                animal = "Chimpancé";
                peso =  60;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 13:
                animal = "Lobo";
                peso =  55;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 14:
                animal = "Perro";
                peso =  40;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 15:
                animal = "Gato";
                peso =  8;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 16:
                animal = "Zorro";
                peso =  7;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 17:
                animal = "Conejo";
                peso = 4;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 18:
                animal = "Rata";
                peso =  2;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 19:
                animal = "Ratón";
                peso =  0.4;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
            case 20:
                animal = "Hámster";
                peso =  0.2;
                listadeanimales.add(new Animal(op,animal,peso));
                break;
        }

    }
    public void mostrarlista(ArrayList <Animal> listadeanimales){
        double suma = 0;
        System.out.println("------------------------Lista de animales----------------------------------");
        System.out.println("ID\t" + "Animal\t" + "Peso");
        for(int i = 0; i < listadeanimales.size(); i++)
        {
            System.out.println(listadeanimales.get(i));
            suma += listadeanimales.get(i).peso;
        }
        System.out.println("En el arca existe " + listadeanimales.size() + " animales, está siendo utilizado es: " + suma + "y el peso que aún falta llenar es de: ");
        System.out.println("----------------------------------------------------------------------------");
    }

    public void mostrarreporte(ArrayList <Animal> listadeanimales){
        System.out.println("------------------------Lista de animales----------------------------------");
        System.out.println("ID\t" + "Animal\t" + "Peso");
        for(int i = 0; i < listadeanimales.size(); i++)
        {
            System.out.println(listadeanimales.get(i));
        }
        System.out.println("----------------------------------------------------------------------------");
    }

    public void buscarAnimal(ArrayList <Animal> listadeanimales){
        int idAux;
        int indice;
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese el ID del animal: ");
        idAux = sc.nextInt();
        Animal animalAux = new Animal(idAux);
        indice = listadeanimales.indexOf(animalAux);
        System.out.println("---------------------------------------------------");
        if(indice!=-1){
            System.out.println("El animal existe");
            animalAux = listadeanimales.get(indice);
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.println("ID\t" + "Animal\t" + "Peso");
            System.out.println(animalAux);
            System.out.println("--------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("---------------------------------------------------");
            System.out.println("El animal aún no ha sido subido al arca");
            System.out.println("---------------------------------------------------");
        }
        sc.nextLine();
    }

    public void eliminarAnimal(ArrayList <Animal> listadeanimales){
        int idAux;
        int indice;
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese el ID del animal: ");
        idAux = sc.nextInt();
        Animal animalAux = new Animal(idAux);
        indice = listadeanimales.indexOf(animalAux);
        System.out.println("---------------------------------------------------");
        if(indice!=-1){
            listadeanimales.remove(indice);
            System.out.println("Animal eliminado!");
        }
        else{
            System.out.println("El animal aún no ha sido subido al arca");
        }
        System.out.println("---------------------------------------------------");
        sc.nextLine();
    }


    @Override
    public String toString() {
        return  "" + id +
                " " + animal +
                " " + peso;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        Animal animal2 = (Animal) o;
        if(!Objects.equals(this.id, animal2.id)){
            return false;
        }
        return true;
    }

}
