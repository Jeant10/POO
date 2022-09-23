package triangulos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float a,b,c;
        triangulo triangulo1;
        Scanner sc = new Scanner(System.in);
        System.out.println("DIgite el lado 1: ");
        a = sc.nextFloat();
        System.out.println("DIgite el lado 2: ");
        b = sc.nextFloat();
        System.out.println("Digite el lado 3: ");
        c = sc.nextFloat();
        if(((b-c)<a && a<(b+c)) || ((a-c)<b && b<(a+c)) || ((a-b)<c && c<(a+b)))
        {
            if(a==b && a==c)
            {
                System.out.println("\nEl triangulo es equilatero");
                triangulo1 = new triangulo(a);
            }
            else if(a==b||a==c||b==c)
            {
                System.out.println("\nEl triangulo es isosceles");
                triangulo1 = new triangulo(a,b);
            }
            else if(a!=b && a!=b && b!=c)
            {
                System.out.println("\nEl triangulo es escaleno");
                triangulo1 = new triangulo(a,b,c);
            }
            System.out.println("El perimetro del triangulo es: " + triangulo.perimetro());
            System.out.println("El area del triangulo es: " + triangulo.area());

        }
        else{
            System.out.println("No es un triangulo");
        }
    }
}
