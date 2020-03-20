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
public class oyentebuscar implements ActionListener {
    cventana vp;
    bass_de_datos abd;
    Alumno a;
    public oyentebuscar (cventana vp){
		this.vp = vp;
	}
    @Override

    public void actionPerformed(ActionEvent ae) {
//vp.ocultar();

//        abd = new bass_de_datos();
//        abd.buscar(vp.BuscarAlumno());
//if(a.getCedula()==null){
//        vp.mostrarr();
//}else{
//    vp.ocultar();
//        vp.cargar(a);
//}
    a=abd.buscar(vp.BuscarAlumn());
    if(a.getCedula()==null){
        vp.limpiarCampos();
        vp.mostrarr();
            
        }else{
            vp.ocultar();
            JOptionPane.showMessageDialog(null, "El alumno "+a.getNombre()+" "+a.getApellido()+" ya se encuenta registrado");
            vp.cargar(a);
        }
  

    }
    
}
