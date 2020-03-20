/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelos.Alumno;
import modelos.bass_de_datos;
import vistas.cventana;

/**
 *
 * @author Alexander
 */
public class oyecteDesblo implements ActionListener {
   cventana vp;
    bass_de_datos abd;
    Alumno a;
    
    public oyecteDesblo (cventana vp){
		this.vp = vp;
	}
    @Override

    public void actionPerformed(ActionEvent ae) {
   if(vp.getDesbloquear().isSelected()){
            vp.mostrarr();
        }else{
            vp.ocultar();
        }
 
    } 
}
