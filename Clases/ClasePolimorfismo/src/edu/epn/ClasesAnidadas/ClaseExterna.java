package edu.epn.ClasesAnidadas;

public class ClaseExterna {
    static int externoX=8;
    int externoY=5;
    private static int externoPrivado=13;

    public static class ClaseAnidadaInterna{
        public void mostrar(){
            System.out.println("El atributo estatico externo X es: "+externoX);

            System.out.println("El atributo estatico privado externo es: "+externoPrivado);

            //no podemos acceder al atributo externoY
            //System.out.println("El atributo externo Y es: "+externoY);

        }
    }
    public static class NuevaClaseAnidada{

    }

}
