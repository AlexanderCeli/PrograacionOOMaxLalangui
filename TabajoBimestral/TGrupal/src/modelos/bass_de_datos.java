/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vistas.cventana;

/**
 *
 * @author Alexander
 */
public class bass_de_datos {

    cventana vp;
    Alumno Alumno;
    private static ArrayList<Alumno> listaE;

    public void guardarAlumnosBD(Alumno Alumno) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumnos", "root", "root");
            System.out.println("Concexion establecida");

            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into estudiantes values ('" + Alumno.getCedula() + "','" + Alumno.getNombre() + "','"
                    + Alumno.getApellido() + "','" + Alumno.getEdad() + "','" + Alumno.getSexo() + "','" + Alumno.getHorario() + "','" 
                    + Alumno.getCurso() + "')");
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Eroor de coneccion" + ex);
        }
    }

    public void eliminarAlumnosBD(Alumno Alumno) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumnos", "root", "root");
            System.out.println("Concexion establecida");

            Statement sentencia = conexion.createStatement();

            int delete = sentencia.executeUpdate("delete from estudiantes where cedula=" + Alumno.getCedula());
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Eroor de coneccion" + ex);
        }
    }

    public void buscar(Alumno Alumno) {

        boolean existe = false;
        String cedula;
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumnos", "root", "root");
            System.out.println("Concexion establecida");

            Statement sentencia = conexion.createStatement();

            ResultSet buscar = sentencia.executeQuery("SELECT * FROM estudiantes WHERE cedula = " + Alumno.getCedula());
            while (buscar.next()) {
                existe = true;

                String ced = buscar.getString("cedula");
                String nom = buscar.getString("nombre");
                String ape = buscar.getString("apellido");
                String edad = buscar.getString("edad");
                String sex = buscar.getString("sexo");
                String cur = buscar.getString("curso");
                String horario = buscar.getString("horario");

                Alumno.setCedula(ced);
                Alumno.setNombre(nom);
                Alumno.setApellido(ape);
                Alumno.setEdad(edad);
                Alumno.setSexo(sex);
                Alumno.setCurso(cur);
                Alumno.setHorario(horario);

                if (existe == true) {
                    JOptionPane.showMessageDialog(null, "El numero de cedula se encuentra: " + Alumno.getCedula() + " si está en la BD", "Mensaje", 
                            JOptionPane.INFORMATION_MESSAGE);

                }
            }

            if (existe == false) {

                JOptionPane.showMessageDialog(null, "El numero de cedula no se encuentra", "Error de captura", JOptionPane.ERROR_MESSAGE);

            }

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Eroor de coneccion" + ex);
        }

    }

    public static Alumno buscar(String cedula) {
        Alumno alumno = new Alumno();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumnos", "root", "root");
            System.out.println("Concexion establecida");
            Statement sentencia = conexion.createStatement();
            ResultSet buscar = sentencia.executeQuery("SELECT * FROM estudiantes WHERE cedula = " + cedula );
            while (buscar.next()) {
                String ced = buscar.getString("cedula");
                String nom = buscar.getString("nombre");
                String ape = buscar.getString("apellido");
                String edad = buscar.getString("edad");
                String sex = buscar.getString("sexo");
                String cur = buscar.getString("curso");
                String horario = buscar.getString("horario");

                alumno.setCedula(ced);
                alumno.setNombre(nom);
                alumno.setApellido(ape);
                alumno.setEdad(edad);
                alumno.setSexo(sex);
                alumno.setCurso(cur);
                alumno.setHorario(horario);

            }

            sentencia.close();
            conexion.close();

        sentencia.close();
            conexion.close();
        }catch (Exception er) {
            System.out.print("Error en la conexion " + er);
        }
        return alumno;
    }
 public void AAlumnosBD(Alumno Alumno) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumnos", "root", "root");
            System.out.println("Concexion establecida");

            Statement sentencia = conexion.createStatement();

            int update = sentencia.executeUpdate ("update estudiantes set nombre='" + Alumno.getNombre() + "'," +
                                           "apellido='" + Alumno.getApellido()+ "'," + " edad= '"+ Alumno.getEdad()+ "'," + " sexo= '" 
                    +Alumno.getSexo()+ "'," +" horario= '"+ Alumno.getHorario()
                  + "' where cedula= "+ Alumno.getCedula() );
            

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.println("Eroor de coneccion" + ex);
        }
    }
 
}
