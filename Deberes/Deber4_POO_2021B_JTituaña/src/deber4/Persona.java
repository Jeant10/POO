package deber4;

import java.util.*;

public class Persona {
    int cedula;
    String apellidos;
    String nombres;
    String sexo;
    int edad;
    float peso;
    Scanner sc = new Scanner(System.in);


    public Persona(int cedula, String apellidos, String nombres, String sexo, int edad, float peso) {
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona() {
    }

    public Persona(int cedula) {
        this.cedula = cedula;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void ingresarPersona(ArrayList<Persona> listapersonas){
        System.out.println("---------------------------------------------------");
        System.out.println("Cedula: ");
        int cedula = sc.nextInt();
        System.out.println("Apellidos: ");
        sc.nextLine();
        String apellidos = sc.nextLine();
        System.out.println("Nombres: ");
        String nombres = sc.nextLine();
        System.out.println("Sexo:");
        String sexo = sc.nextLine();
        System.out.println("Edad:");
        int edad = sc.nextInt();
        System.out.println("Peso:");
        float peso = sc.nextFloat();
        listapersonas.add(new Persona(cedula,apellidos,nombres,sexo,edad,peso));
        System.out.println("---------------------------------------------------");
        sc.nextLine();
    }

    public void buscarPersona(ArrayList <Persona> listapersonas){
        int numeroAux;
        int indice;
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese el cedula: ");
        numeroAux = sc.nextInt();
        Persona personaAux = new Persona(numeroAux);
        indice = listapersonas.indexOf(personaAux);
        if(indice!=-1){
            personaAux = listapersonas.get(indice);
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println(personaAux);
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("---------------------------------------------------");
            System.out.println("La persona no se encuentra en la lista");
            System.out.println("---------------------------------------------------");
        }
        sc.nextLine();
    }

    public void eliminarPersona(ArrayList <Persona> listapersonas){
        int numeroAux;
        int indice;
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese la cedula: ");
        numeroAux = sc.nextInt();
        Persona personaAux = new Persona(numeroAux);
        indice = listapersonas.indexOf(personaAux);
        System.out.println("---------------------------------------------------");
        if(indice!=-1){
            listapersonas.remove(indice);
            System.out.println("Persona eliminada con exito!");
        }
        else{
            System.out.println("La persona no se encuentra en la lista");
        }
        System.out.println("---------------------------------------------------");
        sc.nextLine();
    }

    public void ordenarporapellido(ArrayList <Persona> listapersonas){
        Collections.sort(listapersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getApellidos().compareTo(o2.getApellidos());
            }
        });
    }

    public void mostrarlista(ArrayList <Persona> listapersonas){
        if(listapersonas.size() > 0){
            System.out.println("---------------------------------------Lista de personas--------------------------------------------");
            for(Persona est : listapersonas){
                System.out.println(est);
            }
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("---------------------------------------------------");
            System.out.println("No existen personas registradas");
            System.out.println("---------------------------------------------------");
        }
    }

    @Override
    public String toString() {
        return "Persona: " +
                "  Cedula = " + cedula +
                ", Apellidos = " + apellidos +
                ", Nombres = " + nombres +
                ", Sexo = " + sexo +
                ", Edad = " + edad +
                ", Peso = " + peso;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        Persona persona2 = (Persona) o;
        if(!Objects.equals(this.cedula, persona2.cedula)){
            return false;
        }
        return true;
    }

}
