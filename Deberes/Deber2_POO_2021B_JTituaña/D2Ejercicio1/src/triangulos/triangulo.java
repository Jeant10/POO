package triangulos;

public class triangulo {
    private static float lado1;
    private static float lado2;
    private static float lado3;

    public triangulo(float lado1) {
        this.lado1 = this.lado2 = this.lado3 = lado1;
    }

    public triangulo(float lado1, float lado3) {
        this.lado1 = this.lado2 = lado1;
        this.lado3 = lado3;
    }

    public triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public static float perimetro(){
        float perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    public static double area(){
        float s = perimetro()/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

}
