/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaencasa;
public class Triangulo2_0 extends DosDimenciones2_0 {
      private String estilo;

   //contructor
    Triangulo2_0 (String s, double b, double h){
        setBase(b);
        setAltura (h);
        estilo = s;
    }

    double area (){
        return getBase() * getALtura() /2 ;
        
    }
    void mostarEstilo(){
        System.out.println("Triangulo es:" + estilo);
    }
}
class Ladoss3{
    public static void main(String[] args) {
        Triangulo2_0 t1 = new Triangulo2_0 ("Estilo 1 ", 4.0 , 4.0);
        Triangulo2_0 t2 = new Triangulo2_0 ("Estilo 2 ", 8.0 , 12.0);
        
        System.out.println("Informacion para T1:");
        t1.mostarEstilo();
        t1.mostrarDimensiones();
        System.out.println("Su area es:" + t1.area());
        
        System.out.println();
        
        System.out.println("Informacion para T2:");
        t2.mostarEstilo();
        t2.mostrarDimensiones();
        System.out.println("Su area es: " + t2.area());
    }
}
