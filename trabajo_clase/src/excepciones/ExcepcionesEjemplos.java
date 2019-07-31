package excepciones;

import java.util.Scanner;

public class ExcepcionesEjemplos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int numero = 0;
        try {//lo q voy a proteger
            numero = entrada.nextInt();
        } catch (Exception e) {//prresenta la excepcion
            System.out.println("Se ha generado la excepcion" + e);
//        }finally{// ejecutar acciones (como si no huviese havido error) se ejecuta siempre q se produsca una excepcion 
//            System.out.println("ingrese un numero correcto");
//            numero=entrada1.nextInt();
        }
        System.out.println("El numero ingresado es" + numero);
//        try {
//            int resultado = numero / 0;
//        System.out.println("el resultado es" + resultado);
//
//        }catch(Exception e){
//            System.out.println("no se puede divir para cero");
//        }
        

    }
}
