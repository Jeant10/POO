package edu.epn;

public class Complejo {
    private double real;
    private double imag;

    public Complejo() {
    }

    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    //sumar
    //(a, b) + (c, d) = (a + c, b + d);
    public Complejo sumar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real + c.real;
        aux.imag = imag + c.imag;
        return aux;
    }

    //restar
    //(a, b) - (c, d) = (a - c, b - d);
    public Complejo restar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real - c.real;
        aux.imag = imag - c.imag;
        return aux;
    }

    //multiplicar
    //(a, b) * (c, d) = (a*c – b*d, a*d + b*c)
    public Complejo multiplicar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real * c.real - imag * c.imag;
        aux.imag = real * c.imag + imag * c.real;
        return aux;
    }


    //dividir
    //(a, b) / (c, d) = ((a*c + b*d) / (c^2 + d^2) , (b*c – a*d) / (c^2 + d^2))
    public Complejo dividir(Complejo c){
        Complejo aux = new Complejo();
        aux.real = (real * c.real + imag * c.imag)/(c.real * c.real + c.imag * c.imag);
        aux.imag = (imag * c.real - real * c.imag)/(c.real * c.real + c.imag * c.imag);
        return aux;
    }

    //método toString

    public String toString() {
        return "(" + real + ", " + imag + ")";
    }


}
