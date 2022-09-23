package deber4;

import java.util.*;

public class Estudiante {
    String nombre;
    String apellido;
    String direccion;
    int numerounico;
    double notas;
    Scanner sc = new Scanner(System.in);

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String direccion, int numerounico, double notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.numerounico = numerounico;
        this.notas = notas;
    }

    public Estudiante(int numerounico) {
        this.numerounico = numerounico;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Estudiante

    public void ingresarEstudiante(ArrayList <Estudiante> listaestudiantes){
        System.out.println("---------------------------------------------------");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Direccion: ");
        String direccion = sc.nextLine();
        System.out.println("Numero Unico:");
        int numerounico = sc.nextInt();
        nota calificaciones = new nota();
        calificaciones.ingresarnotas();
        notas = calificaciones.promedio();
        double promedio = notas;
        listaestudiantes.add(new Estudiante(nombre,apellido,direccion,numerounico,promedio));
        System.out.println("---------------------------------------------------");
        sc.nextLine();
    }

    public void buscarEstudiante(ArrayList <Estudiante> listaestudiantes){
        int numeroAux;
        int indice;
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese el numero unico: ");
        numeroAux = sc.nextInt();
        Estudiante estudianteAux = new Estudiante(numeroAux);
        indice = listaestudiantes.indexOf(estudianteAux);
        if(indice!=-1){
            estudianteAux = listaestudiantes.get(indice);
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println(estudianteAux);
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("---------------------------------------------------");
            System.out.println("Estudiante no se encuentra en la lista");
            System.out.println("---------------------------------------------------");
        }
        sc.nextLine();
    }

    public void eliminarEstudiante(ArrayList <Estudiante> listaestudiantes){
        int numeroAux;
        int indice;
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese el numero unico: ");
        numeroAux = sc.nextInt();
        Estudiante estudianteAux = new Estudiante(numeroAux);
        indice = listaestudiantes.indexOf(estudianteAux);
        System.out.println("---------------------------------------------------");
        if(indice!=-1){
            listaestudiantes.remove(indice);
            System.out.println("Estudiante eliminado con exito!");
        }
        else{
            System.out.println("Estudiante no se encuentra en la lista");
        }
        System.out.println("---------------------------------------------------");
        sc.nextLine();
    }

    public void modificarEstudiante(ArrayList <Estudiante> listaestudiantes){
        int numeroAux, nuevonumero;
        String nuevonombre, nuevoapellido, nuevadireccion;
        double nuevanota;
        int indice;
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese el numero unico: ");
        numeroAux = sc.nextInt();
        Estudiante estudianteAux = new Estudiante(numeroAux);
        indice = listaestudiantes.indexOf(estudianteAux);
        System.out.println("---------------------------------------------------");
        if(indice!=-1){
            sc.nextLine();
            System.out.println("Ingrese la nueva direccion: ");
            nuevadireccion = sc.nextLine();
            listaestudiantes.get(indice).setDireccion(nuevadireccion);
            System.out.println("Direccion registrada con exito!");
        }
        else{
            System.out.println("Estudiante no se encuentra en la lista");
        }
        System.out.println("---------------------------------------------------");
    }

    public void ordenarpornombre(ArrayList <Estudiante> listaestudiantes){
        Collections.sort(listaestudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
    }

    public void ordenarpornotas(ArrayList <Estudiante> listaestudiantes){
        Collections.sort(listaestudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante o1, Estudiante o2) {
                return Double.compare(o2.getNotas(),o1.getNotas());
            }
        });
    }

    public void mostrarlista(ArrayList <Estudiante> listaestudiantes){
        if(listaestudiantes.size() > 0){
            System.out.println("---------------------------------------Lista de estudiantes--------------------------------------------");
            for(Estudiante est : listaestudiantes){
                System.out.println(est);
            }
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("---------------------------------------------------");
            System.out.println("No existen estudiantes registrados");
            System.out.println("---------------------------------------------------");
        }
    }

    @Override
    public String toString() {
        return "   Estudiante: " +
                "  Nombre = " + nombre +
                ", Apellido = " + apellido  +
                ", Direccion = " + direccion  +
                ", Numero unico = " + numerounico +
                ", Promedio de Notas = " + notas;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        Estudiante estudiante2= (Estudiante) o;
        if(!Objects.equals(this.numerounico, estudiante2.numerounico)){
            return false;
        }
        return true;
    }

}
