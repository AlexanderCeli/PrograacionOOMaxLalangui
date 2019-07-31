package excepciones;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class trabajo {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese la direccion del archivo");
        String direccion = entrada.nextLine();
        System.out.println("ingrese el texto a escribir");
        String texto = entrada.nextLine();
        trabajo objeto= new trabajo();
        objeto.Escribir(direccion, texto);
        
    }
    public void Escribir(String direccion, String texto)  {

        try {
            FileWriter fichero = new FileWriter(direccion);
            PrintWriter escribir = new PrintWriter(fichero);
            escribir.println(texto);
            fichero.close();
        } catch (Exception e) {
            System.out.println("ocurrio el error" + e.getMessage());
        }
       
    }
    
}
