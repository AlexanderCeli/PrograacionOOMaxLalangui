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

/**
 *
 * @author Alexander
 */
public class oyentecrearalumno implements ActionListener {

    cventana vp;
    bass_de_datos abd;
    Alumno a;

    public oyentecrearalumno(cventana vp) {
        this.vp = vp;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        abd = new bass_de_datos();
        abd.guardarAlumnosBD(vp.guardarAlumno());
        vp.limpiarCampos();
        vp.ocultar();
    }

}
