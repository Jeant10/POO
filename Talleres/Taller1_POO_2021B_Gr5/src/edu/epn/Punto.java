package edu.epn;

public class Punto {
    private double x;
    private double y;

    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
