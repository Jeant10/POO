package file;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // 1.- Escribir un archivo sin modificarlo en una ruta especifica

        try{

            System.out.println("\n-------Escribir archivo-------");
            File ar2 = new File("C:/Users/jeant/IdeaProjects/Deber5_POO_2020B_JTituaña/src/file/clase.txt");
            FileWriter fichero = new FileWriter(ar2,true);
            PrintWriter pw = new PrintWriter(fichero);
            pw.println("Lineas añadidas");

            for(int i = 0; i < 3; i++){
                pw.println("Linea: " + i);
            }

            if(ar2.exists()){
                System.out.println("Archivo creado");
            }
            else{
                System.out.println("No existe el archivo");
            }
            fichero.close();
        }
        catch(Exception ec){
            ec.printStackTrace();
        }


        // 2.-Leer un archivo

        try{

            System.out.println("---------Leer archivo---------");
            File ar = new File("C:/Users/jeant/IdeaProjects/Deber5_POO_2020B_JTituaña/src/file/clase.txt");
            FileReader fr  = new FileReader(ar);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
            fr.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

        // 3.- Ejemplo adicional

        //Copiar un archivo

        String ficheroOriginal = "C:/Users/jeant/IdeaProjects/Deber5_POO_2020B_JTituaña/src/file/ficheroOrigen.txt";
        String ficheroCopia = "C:/Users/jeant/IdeaProjects/Deber5_POO_2020B_JTituaña/src/file/ficheroDestino.txt";

        try
        {
            // Se abre el fichero original para lectura
            FileInputStream fileInput = new FileInputStream(ficheroOriginal);
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

            // Se abre el fichero donde se hará la copia
            FileOutputStream fileOutput = new FileOutputStream (ficheroCopia);
            BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);

            // Bucle para leer de un fichero y escribir en el otro.
            byte [] array = new byte[1000];
            int leidos = bufferedInput.read(array);
            while (leidos > 0)
            {
                bufferedOutput.write(array,0,leidos);
                leidos=bufferedInput.read(array);
            }

            // Cierre de los ficheros

            bufferedInput.close();
            bufferedOutput.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // Leer el archivo copiado

        try{

            System.out.println("-----Leer archivo copiado-----");
            File ar = new File("C:\\Users\\jeant\\IdeaProjects\\Deber5_POO_2020B_JTituaña\\src\\file\\ficheroDestino.txt");
            FileReader fr  = new FileReader(ar);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while((linea=br.readLine())!=null){
                System.out.println(linea);
            }
            fr.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
