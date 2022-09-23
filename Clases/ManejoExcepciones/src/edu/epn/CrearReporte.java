package edu.epn;

import java.io.*;

public class CrearReporte {
    private String nombreReporte;
    private String tituloReporte;
    private String contenidoReporte;
    private String extensionReporte;

    public String getNombreReporte() {
        return nombreReporte;
    }

    public void setNombreReporte(String nombreReporte) {
        this.nombreReporte = nombreReporte;
    }

    public String getTituloReporte() {
        return tituloReporte;
    }

    public void setTituloReporte(String tituloReporte) {
        this.tituloReporte = tituloReporte;
    }

    public String getContenidoReporte() {
        return contenidoReporte;
    }

    public void setContenidoReporte(String contenidoReporte) {
        this.contenidoReporte = contenidoReporte;
    }

    public String getExtensionReporte() {
        return extensionReporte;
    }

    public void setExtensionReporte(String extensionReporte) {
        this.extensionReporte = extensionReporte;
    }

    //metodo para crear el reporte
    public void crearReporte(){
        if((getNombreReporte()!=null)&&(getTituloReporte()!=null)&&(getContenidoReporte()!=null)){
            //crear el archivo
            try {

                File archivo = new File(getNombreReporte() + "." + getExtensionReporte());
                FileOutputStream fos = null;
                fos = new FileOutputStream(archivo);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter bw = new BufferedWriter(osw);
                bw.write(getContenidoReporte());
                bw.close();

            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Faltan datos para poder crear el reporte...");
        }
    }
}
