/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_clase;

import java.util.Date;




public class TrabajoFechas {
    public static void main(String[] args) {
        Date fecha= new Date(101,6,18);
//        System.out.println("year:"+(fecha.getYear()+1900));
//        System.out.println("months:"+ fecha.getMonth());
//        System.out.println("day:" + fecha.getDay());
          Date fechaActual= new Date();
          System.out.println(fecha.after(fechaActual));
          System.out.println(fecha.before(fechaActual));
          
    }
}
