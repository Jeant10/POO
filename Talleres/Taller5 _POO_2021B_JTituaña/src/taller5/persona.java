package taller5;

import java.util.Scanner;

public class persona {
    int cedula;
    String nombre;
    String apellido;
    int telefono;
    int celular;
    Scanner sc = new Scanner(System.in);

    public persona(int cedula, String nombre, String apellido, int telefono, int celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.celular = celular;
    }

    @Override
    public String toString() {
        return  "Cedula = " + cedula +
                " Nombre = " + nombre +
                " Apellido = " + apellido +
                " Telefono = 0" + telefono +
                " Celular = " + celular;
    }
}
