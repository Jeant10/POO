package edu.epn.javatests.util;

public class StringUtil {
    //vamos a creae un funcion para repetir strings
   public static String repeat (String str, int times){
       //return null;
       if(times <0){
           throw new IllegalArgumentException("El numero de veces no puede ser negativo");
       }
       String result="";
       for (int i =0; i<times; i++){
           result+=str;
       }
       return result;
   }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() <= 0;
    }
}
