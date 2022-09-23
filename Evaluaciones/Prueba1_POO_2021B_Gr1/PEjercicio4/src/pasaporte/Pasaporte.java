package pasaporte;

import java.util.Scanner;

public class Pasaporte {

    long cedula;
    char letra;

    public Pasaporte(){
        this.cedula = 0;
        this.letra = ' ';
    }

    public Pasaporte(long cedula, char letra) {
        this.cedula = cedula;
        this.letra = letra;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public void leer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero de cedula: ");
        cedula = sc.nextLong();
    }

    public int calcularletra(){
        int resultado = (int) cedula%23;
        return resultado;
    }

    public void asignarletra(int num){
        char [] vec = {'A','B','C','D','E' ,'F','G' ,'H','I','J','K' ,'L','M' ,'N','O' ,'P' ,'Q','R','S' ,'T' ,'U' ,'V' ,'W'
        };
        if(num >=0 && num <=23){
            letra = vec[num];
        }
        else{
            System.out.println("Vuelva a intentarlo!");
            leer();
        }
    }

    public String toString() {
        return "" + cedula + "-" + letra + "";
    }
}
