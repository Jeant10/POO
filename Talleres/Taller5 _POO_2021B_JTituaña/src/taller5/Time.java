package taller5;

public class Time {

    String hora;
    String minuto;

    public Time(String hora, String minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public static Time obtenertiempo(double time){
        String cad = time + "";
        String entero = cad.substring(0, cad.indexOf("."));
        String decimal = cad.substring(cad.indexOf(".") + 1);
        return new Time(entero,decimal);
    }

    @Override
    public String toString() {
        return "" + hora + " horas y " + minuto + " minutos";
    }


}
