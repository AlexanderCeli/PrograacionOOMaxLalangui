package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Archivos {

    public static void main(String[] args) throws IOException {
//      Para saber si el archivo exite o no 
         File archivo = new File("C:\\Users\\Max\\Desktop\\ejemplo.txt");
//        System.out.println(archivo.exists());
////      Para saber si es una carpeta o no
//        System.out.println(archivo.isDirectory());
////        para saber la fecha de modificacion del archivo
//        System.out.println(archivo.lastModified());
//        //para obtener el nombre del archivo
//        System.out.println(archivo.getName());
//        //para borrar el archico
//        //System.out.println(archivo.delete());
//        //para saber los archivos de una carpeta
//        File carpeta = new File("C:\\Users\\Max\\Desktop");
//        String[] archivos = carpeta.list();
//        for (int i = 0; i < archivos.length; i++) {
//            System.out.println(archivos[i]);
        //pasar el archivo a un objeto legible
       
        FileWriter fichero = null; //escibir variables
        PrintWriter escribir = null;//es  la q nos permitira dar text al bloc
        try {
            fichero = new FileWriter("C:\\Users\\Max\\Desktop\\ejemplo.txt");
            escribir = new PrintWriter(fichero);
            escribir.println("Hola soy ");
        } catch (Exception e) {
            System.out.println("ocurrio el error" + e.getMessage());
        }
        fichero.close();
    try{
        FileReader lector = new FileReader(archivo);//pasar el archivo a un objeto
      BufferedReader re= new BufferedReader(lector);//para recorrer el archivo
      String linea="";
      while((linea=re.readLine())!=null){ //leer por linea el archivo
          System.out.println(toUpperCase(linea));
          System.out.println(toLowerCase(linea));
      }
      re.close();//para cerrar el archivo
       }catch(Exception e){
           System.out.println("ocurrio el error" + e);
       }
    
    }
    
}
