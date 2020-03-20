/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Alumno;
import modelos.bass_de_datos;
import vistas.cventana;

public class oyenteeliminaralumno implements ActionListener {

    cventana vp;
    bass_de_datos abd;
    Alumno a;

    public oyenteeliminaralumno(cventana vp) {
        this.vp = vp;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        abd = new bass_de_datos();
        
        abd.eliminarAlumnosBD(vp.eliminarAlumno());
        vp.limpiarCampos();

    }

}
