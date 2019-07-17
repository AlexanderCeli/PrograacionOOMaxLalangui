package transformar;

import javax.swing.JOptionPane;

public class Transformar {
    public static void main(String[] args) {
        double numero1,resultado,resultado1;
        char op;
        op=(JOptionPane.showInputDialog("Elija la opcion a tranformar: \n 1) Horas a Minutos y Segundos \n 2) Minutos a Segundos y Horas \n 3) Segundos a Minutos y Horas " )).charAt(0);
        switch(op){
            case '1' :
                convertir objeto=new convertir();
                numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las Horas que desea transformar"));
                objeto.setNumero1(numero1);
                objeto.calcular();
                resultado=objeto.getResultado();
                objeto.calcular4();                
                resultado1=objeto.getResultado1();
                JOptionPane.showMessageDialog(null,numero1 + " Horas tiene \n" + resultado + " Minutos  \n " + resultado1 + "Segundos");
            break;
            case '2' :
                convertir objeto1=new convertir();
                numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los Minutos que desea transformar"));
                objeto1.setNumero1(numero1);
                objeto1.calcular();
                resultado=objeto1.getResultado();
                objeto1.calcular5();                
                resultado1=objeto1.getResultado1();
                JOptionPane.showMessageDialog(null,numero1 + " Minutos tiene \n" + resultado +" Segundos \n " +  resultado1 + "Horas");
            break;
            case '3' :
               convertir objeto2=new convertir();
               numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los Segundos que desea transformar"));
               objeto2.setNumero1(numero1);
               objeto2.calcular3();
               resultado=objeto2.getResultado();
               objeto2.calcular2();
               resultado1=objeto2.getResultado1();
               JOptionPane.showMessageDialog(null, numero1 + " Segundos tiene \n " + resultado +" Minutos \n  " +  resultado1 + " Horas ");              
            break;
            default:
                 JOptionPane.showMessageDialog(null, "Caracter no valido ");  
            break;
                
    }
   }
}
