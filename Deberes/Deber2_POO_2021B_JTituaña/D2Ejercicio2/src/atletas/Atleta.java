package atletas;

public class Atleta {
    private int num;
    private String nombre;
    private int time;

    public float getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Atleta(int num, String nombre, int time) {
        this.num = num;
        this.nombre = nombre;
        this.time = time;
    }

    public static void listado_atletas(Atleta listadeatletas[])
    {
        for (int i = 0; i < listadeatletas.length; i++)
        {
            System.out.println((i + 1) + ": " + listadeatletas[i].num + " " + listadeatletas[i].nombre + " " + listadeatletas[i].time);
        }
    }

}


