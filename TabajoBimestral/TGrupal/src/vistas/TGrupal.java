package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TGrupal extends JFrame {

    JFrame f = new JFrame();
    JMenuBar jmn = new JMenuBar();
    JMenu menu1;
    JMenuItem Alumnos, Lista, Salir;

    public TGrupal() {

        f.setTitle("Ventana P.");
        f.setSize(500, 400);
        f.setLocation(200, 300);
        agregar();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void agregar() {

        f.setJMenuBar(jmn);
        menu1 = new JMenu("Programas");
        jmn.add(menu1);
        
        Alumnos = new JMenuItem("Crear Alumnos");
        Alumnos.addActionListener(new Oyenteventanap());
        menu1.add(Alumnos);

        Lista = new JMenuItem("Aleartoria ");
        Lista.addActionListener(new Oyenteventanap());
        menu1.add(Lista);

        Salir = new JMenuItem("Salir");
        Salir.addActionListener(new Oyenteventanap());
        menu1.add(Salir);
    }

    private class Oyenteventanap implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            
            if (e.getSource() == Salir) {
                System.exit(0);

            }
            if (e.getSource() == Alumnos) {
                cventana p =new cventana();

            }
             if (e.getSource() == Lista) {
                TrabajoEnClase i = new TrabajoEnClase();

            }

        }

    }

   
}
