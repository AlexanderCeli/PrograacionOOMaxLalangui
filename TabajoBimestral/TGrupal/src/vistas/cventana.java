/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import control.oyecteDesblo;
import control.oyenteActulizar;
import control.oyenteSalir;
import control.oyentebuscar;
import control.oyentecrearalumno;
import control.oyenteeliminaralumno;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import modelos.Alumno;
import modelos.bass_de_datos;

public class cventana {

    private JFrame frame = new JFrame("Alumno");
    private JLabel nombre;
    private JLabel apellido;
    private JLabel edad;
    private JTextField textonombre;
    private JTextField textoapellido;
    private JTextField textoedad;
    private JLabel sexo;
    private JCheckBox mujer;
    private JCheckBox hombre;
    private JLabel curso;
    private JTextField textocurso;
    private JLabel horario;
    private JTextField textohorario;
    private JLabel cedula;
    private JTextField textocedula;
    private JButton registrar;
    private JButton salir;
    private JComboBox cmbsexo;
    private Alumno alumno = new Alumno();
    private JButton eliminar;
    private JButton buscar;
    private JCheckBox desbloquear;
    private JButton desblo;
    JDesktopPane escritorio = new JDesktopPane();

    public JCheckBox getDesbloquear() {
        return desbloquear;
    }

    public void setDesbloquear(JCheckBox desbloquear) {
        this.desbloquear = desbloquear;
    }

    public JLabel getSexo() {
        return sexo;
    }

    public void setSexo(JLabel sexo) {
        this.sexo = sexo;
    }

    public JTextField getTextonombre() {
        return textonombre;
    }

    public void setTextonombre(JTextField textonombre) {
        this.textonombre = textonombre;
    }

    public JTextField getTextoapellido() {
        return textoapellido;
    }

    public void setTextoapellido(JTextField textoapellido) {
        this.textoapellido = textoapellido;
    }

    public JTextField getTextoedad() {
        return textoedad;
    }

    public void setTextoedad(JTextField textoedad) {
        this.textoedad = textoedad;
    }

    public JTextField getTextocurso() {
        return textocurso;
    }

    public void setTextocurso(JTextField textocurso) {
        this.textocurso = textocurso;
    }

    public JTextField getTextohorario() {
        return textohorario;
    }

    public void setTextohorario(JTextField textohorario) {
        this.textohorario = textohorario;
    }

    public JTextField getTextocedula() {
        return textocedula;
    }

    public void setTextocedula(JTextField textocedula) {
        this.textocedula = textocedula;
    }

    public JButton getRegistrar() {
        return registrar;
    }

    public void setRegistrar(JButton registrar) {
        this.registrar = registrar;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public cventana() {

        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame = new JFrame("Alumno");
        frame.setSize(400, 500);
        JPanel pane = new JPanel(new GridBagLayout());
        frame.setContentPane(pane);
        JTextField tex = new JTextField();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 2;
        c.weighty = 2;
        c.fill = GridBagConstraints.HORIZONTAL;

        nombre = new JLabel("Nombres:");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 0;

        pane.add(nombre, c);

        apellido = new JLabel("Apellido:");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 1;
        pane.add(apellido, c);

        edad = new JLabel("Edad:");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 3;

        pane.add(edad, c);

        textonombre = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 0;

        pane.add(textonombre, c);

        textoapellido = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 1;
        c.gridy = 1;

        pane.add(textoapellido, c);

        textoedad = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 3;

        pane.add(textoedad, c);

        sexo = new JLabel("Sexo:");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 4;

        pane.add(sexo, c);

        Vector v = new Vector(4);
        v.addElement("");
        v.addElement("Hombre");
        v.addElement("Mujer");
        cmbsexo = new JComboBox(v);

        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 4;

        pane.add(cmbsexo, c);

        curso = new JLabel("Curso");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 6;

        pane.add(curso, c);

        textocurso = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 6;

        pane.add(textocurso, c);

        horario = new JLabel("Horario");
        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 7;

        pane.add(horario, c);

        textohorario = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 7;

        pane.add(textohorario, c);

        cedula = new JLabel("Cedula");

        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 2;

        pane.add(cedula, c);

        textocedula = new JTextField(1);
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 2;

        pane.add(textocedula, c);

        registrar = new JButton("Registrar");

        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 8;
        pane.add(registrar, c);
        registrar.addActionListener(new oyentecrearalumno(this));

        salir = new JButton("Salir");

        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 9;

        pane.add(salir, c);

        salir.addActionListener(new oyenteSalir(this));

        eliminar = new JButton("Eliminar");

        c.gridx = 1;
        c.gridwidth = 1;
        c.gridy = 9;

        pane.add(eliminar, c);
        eliminar.addActionListener(new oyenteeliminaralumno(this));

        buscar = new JButton("Buscar");

        c.gridx = 3;
        c.gridwidth = 2;
        c.gridy = 2;
        pane.add(buscar, c);
        buscar.addActionListener(new oyentebuscar(this));

        pane.add(escritorio);

        desbloquear = new JCheckBox("desbloquear");
        c.gridx = 3;
        c.gridwidth = 2;
        c.gridy = 3;
        pane.add(desbloquear, c);
        desbloquear.addActionListener(new oyecteDesblo(this));

        desblo = new JButton("Actualizar");
        c.gridx = 2;
        c.gridwidth = 2;
        c.gridy = 8;
        pane.add(desblo, c);
        desblo.addActionListener(new oyenteActulizar(this));
        frame.setVisible(true);
        ocultar();
    }

    public void ocultar() {
        textonombre.setEditable(false);
        textoapellido.setEditable(false);
        textoedad.setEditable(false);
        textocurso.setEditable(false);
        textohorario.setEditable(false);
//        cmbsexo.setEnabled(false);
        registrar.setEnabled(false);

    }

    public void mostrarr() {
        textonombre.setEditable(true);
        textoapellido.setEditable(true);
        textoedad.setEditable(true);
        textocurso.setEditable(true);
        textohorario.setEditable(true);
        cmbsexo.setEditable(true);
        registrar.setEnabled(true);

    }

    public void most() {
        cmbsexo.setEditable(true);
    }

    public Alumno guardarAlumno() {
        alumno = new Alumno();
        alumno.setCedula(textocedula.getText());
        alumno.setNombre(textonombre.getText());
        alumno.setApellido(textoapellido.getText());
        alumno.setCurso(textocurso.getText());
        alumno.setSexo((String) cmbsexo.getSelectedItem());
        alumno.setEdad(textoedad.getText());
        alumno.setHorario(textohorario.getText());
        return alumno;
    }

    public void limpiarCampos() {

        textocedula.setText("");
        textonombre.setText("");
        textoapellido.setText("");
        textocurso.setText("");
        cmbsexo.setSelectedItem("");
        textoedad.setText("");
        textohorario.setText("");
    }

    public Alumno eliminarAlumno() {
        alumno.setCedula(textocedula.getText());
        return alumno;
    }

    public Alumno BuscarAlumno() {
        alumno.setCedula(textocedula.getText());
        return alumno;
    }

    public String BuscarAlumn() {

        return textocedula.getText();
    }

    public void cargar(Alumno alumno) {

        textoapellido.setText(alumno.getApellido());
        textocurso.setText(alumno.getCurso());
        textoedad.setText(alumno.getEdad());
        textohorario.setText(alumno.getHorario());
        textonombre.setText(alumno.getNombre());
        cmbsexo.setSelectedItem(alumno.getSexo());

    }

    public Alumno ActuarAlumno() {
        alumno = new Alumno();
        alumno.setCedula(textocedula.getText());
        alumno.setNombre(textonombre.getText());
        alumno.setApellido(textoapellido.getText());
        alumno.setCurso(textocurso.getText());
        alumno.setSexo((String) cmbsexo.getSelectedItem());
        alumno.setEdad(textoedad.getText());
        alumno.setHorario(textohorario.getText());
        return alumno;
    }

}
