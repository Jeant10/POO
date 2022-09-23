package taller5;

import java.util.*;

public class prestamo {
    int identificador = 234;
    persona solicitante;
    double cantidad;
    fecha fdepago[] = new fecha[12];
    fecha fdeautorizacion;
    fecha fdeentrega;
    Scanner sc = new Scanner(System.in);

    public prestamo() {
    }

    public prestamo(int identificador) {
        this.identificador = identificador;
    }

    public prestamo(int identificador, persona solicitante, double cantidad, fecha[] fdepago, fecha fdeautorizacion, fecha fdeentrega) {
        this.identificador = identificador;
        this.solicitante = solicitante;
        this.cantidad = cantidad;
        this.fdepago = fdepago;
        this.fdeautorizacion = fdeautorizacion;
        this.fdeentrega = fdeentrega;
    }

    public void ingresarprestamo(ArrayList<prestamo> prestamos){
        System.out.println("Numero del prestamo: " + identificador);
        System.out.println("Ingrese los datos del solicitante");
        persona prs = ingresarpersona();
        double valor = valormayor();
        System.out.println("Ingrese la fecha de autorizacion del prestamo ");
        fecha f1 = ingresarfecha();
        System.out.println("Fecha de entrega del prestamo: ");
        fecha f2 = fechadeentrega(f1);
        System.out.println(f2);
        fecha pagos[] = fechadepagos(f2);
        System.out.println("Fechas de pago asignadas!");
        System.out.println("Para mas informacion, revise la opcion 3");
        prestamos.add(new prestamo(identificador,prs,valor,pagos,f1,f2));
        identificador = identificador + 1;
    }

    public persona ingresarpersona(){

        System.out.println("Cedula: ");
        int cedula = sc.nextInt();
        sc.nextLine();
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Telefono: ");
        int telefono = sc.nextInt();
        System.out.println("Celular: ");
        int celular = sc.nextInt();

        return new persona(cedula,nombre,apellido,telefono,celular);
    }

    public fecha ingresarfecha(){
        boolean valido = false;
        fecha fecha;
        do{
            System.out.println("Dia: ");
            int d = sc.nextInt();
            System.out.println("Mes: ");
            int m = sc.nextInt();
            System.out.println("Año: ");
            int a = sc.nextInt();

            fecha = new fecha(d,m,a);

            if(fecha.fechaCorrecta()){
                valido = true;
            }
            else
            {
                System.out.println("Fecha no valida ... Intentelo de nuevo");
            }

        } while(valido == false);

        return fecha;
    }

    public fecha fechadeentrega(fecha nuevafecha){
        fecha aux = new fecha(nuevafecha.dia, nuevafecha.mes, nuevafecha.año);
        aux.diaSiguiente();
        return aux;
    }

    public fecha[] fechadepagos(fecha fechapagos){

        fecha aux = new fecha(fechapagos.dia, fechapagos.mes, fechapagos.año);
        fecha pagos[] = new fecha[12];
        for(int j = 0; j < 12;j++)
        {
            for(int i = 0; i < 31; i++)
            {
                aux.diaPagos();
            }
            fecha pago = new fecha(aux.dia, aux.mes, aux.año);
            pagos[j] = pago;
        }

        return pagos;
    }

    public double valormayor(){
        boolean valido = false;
        double v;
        do{
            System.out.println("Valor: ");
            v = sc.nextDouble();
            if(v >= 1000){
                valido = true;
            }
            else{
                System.out.println("El valor del préstamo debe ser mayor a 1000 ... Intentelo de nuevo");
            }
        }while(valido == false);

        return v;
    }

    public void buscarPrestamo(ArrayList <prestamo> listaprestamos){
        int identificadorAux;
        int indice;
        System.out.println("---------------------------------------------------");
        System.out.println("Ingrese el identificador: ");
        identificadorAux = sc.nextInt();
        prestamo prestamoAux = new prestamo(identificadorAux);
        indice = listaprestamos.indexOf(prestamoAux);
        System.out.println("---------------------------------------------------");
        if(indice!=-1){
            System.out.println("Datos encontrados: ");
            prestamoAux = listaprestamos.get(indice);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(prestamoAux);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        }
        else{
            System.out.println("---------------------------------------------------");
            System.out.println("Prestamo no se encuentra en la lista");
            System.out.println("---------------------------------------------------");
        }
        sc.nextLine();
    }

    public void mostrarlista(ArrayList <prestamo> listaprestamos){
        System.out.println("---------------------------------------------------------------Lista de prestamos--------------------------------------------------------------");
        for(prestamo est : listaprestamos)
        {
            System.out.println(est);
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        prestamo prestamo2 = (prestamo) o;
        if(!Objects.equals(this.identificador, prestamo2.identificador)){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Prestamo " + identificador + ":" +
                " \nSolicitante: " + solicitante +
                " \nCantidad = " + cantidad +
                " \nFechas de pago = " + Arrays.toString(fdepago) +
                " \nFecha de autorizacion = " + fdeautorizacion +
                " \nFecha de entrega = " + fdeentrega + "\n";
    }

}
