package edu.epn;
import java.util.Scanner;

public class Libro {

    private String titulo, autor, IBSN, editorial, ciudad, pais, fecha;
    private int paginas, edicion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIBSN() {
        return IBSN;
    }

    public void setIBSN(String IBSN) {
        this.IBSN = IBSN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    //Codigo no tiene ningun tipo de verificacion de input asi que el input tiene que ser correcto o saldran errores
    public void leerDatos(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro:");
        titulo = sc.nextLine();
        System.out.println("Ingrese el numero de edicion del libro:");
        edicion = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el nombre del autor del libro:");
        autor = sc.nextLine();
        System.out.println("Ingrese el numero de ISBN del libro:");
        IBSN = sc.nextLine();
        System.out.println("Ingrese el nombre de la editorial del libro:");
        editorial = sc.nextLine();
        System.out.println("Ingrese la ciudad de la editorial del libro:");
        ciudad = sc.nextLine();
        System.out.println("Ingrese el pais de la editorial del libro:");
        pais = sc.nextLine();
        System.out.println("Ingrese la fecha de edicion del libro:");
        fecha = sc.nextLine();
        System.out.println("Ingrese cuantas paginas tiene el libro:");
        paginas = Integer.parseInt(sc.nextLine());
    }

    public void mostrarDatos(){

        System.out.println("Titulo: " + titulo);
        System.out.println(edicion + "a. edicion");
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + IBSN);
        System.out.println(editorial + ", " + ciudad + " (" + pais + ")");
        System.out.println(fecha);
        System.out.println(paginas + " paginas.");
    }
}
