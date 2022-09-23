package edu.epn;

public class Rectangulo {
    private Vertice v1, v2 , v3, v4;
    private double base;
    private double altura;


    public Rectangulo(Vertice v1, Vertice v2, Vertice v3, Vertice v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    public Rectangulo(double base, double altura)
    {
        this.v1 = new Vertice(0,0);
        this.v2 = new Vertice(base,0);
        this.v3 = new Vertice(0,altura);
        this.v4 = new Vertice(base,altura);
    }

    public Vertice getV1() {
        return v1;
    }

    public void setV1(Vertice v1) {
        this.v1 = v1;
    }

    public Vertice getV2() {
        return v2;
    }

    public void setV2(Vertice v2) {
        this.v2 = v2;
    }

    public Vertice getV3() {
        return v3;
    }

    public void setV3(Vertice v3) {
        this.v3 = v3;
    }

    public Vertice getV4() {
        return v4;
    }

    public void setV4(Vertice v4) {
        this.v4 = v4;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double superficie(Vertice P1, Vertice P2){
        return Math.abs((P2.getX() - P1.getX())*(Math.abs(P2.getY()-P1.getY())));
    }

    public void desplazar(double Ax, double Ay)
    {
        double new_vx1 = this.v1.getX();
        double new_vx2 = this.v2.getX();
        double new_vx3 = this.v3.getX();
        double new_vx4 = this.v4.getX();

        new_vx1 = new_vx1 + Ax;
        new_vx2 = new_vx2 + Ax;
        new_vx3 = new_vx3 + Ax;
        new_vx4 = new_vx4 + Ax;

        this.v1.setX(new_vx1);
        this.v2.setX(new_vx2);
        this.v3.setX(new_vx3);
        this.v4.setX(new_vx4);

        double new_vy1 = this.v1.getY();
        double new_vy2 = this.v2.getY();
        double new_vy3 = this.v3.getY();
        double new_vy4 = this.v4.getY();

        new_vy1 = new_vy1 + Ay;
        new_vy2 = new_vy2 + Ay;
        new_vy3 = new_vy3 + Ay;
        new_vy4 = new_vy4 + Ay;

        this.v1.setY(new_vy1);
        this.v2.setY(new_vy2);
        this.v3.setY(new_vy3);
        this.v4.setY(new_vy4);
    }

}
