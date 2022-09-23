package edu.epn;

public class Auto {
    //Atributos
    String color;
    String marca;
    int km;

    //Metodo constructor
    public Auto(){

    }

    public Auto(String color, String marca, int km){
        this.color = color;
        this.marca = marca;
        this.km = km;

    }

    public Auto(String color, String marca){
        this.color = color;
        this.marca = marca;
    }

    //Metodos
    //PARAMETROS
    //es una declaracion de variable o un objeto
    //ARGUMENTOS
    //es un valor que se encia
    public void arrancar(){

    }

    public void frenar(){

    }

    public void acelerar(int valor){
        System.out.println("EL auto esta acelerando "+valor);
    }

    public void mostrarDatos (){
        System.out.println("LOS DATOS DEL AUTO SON:");
        System.out.println("EL color del auto es: "+color);
        System.out.println("La marca del auto es: "+marca);
        System.out.println("El Km del auto es: "+km);
    }

}
