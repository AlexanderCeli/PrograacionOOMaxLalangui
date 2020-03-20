package vistas;

import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TrabajoEnClase {

    JFrame frame = new JFrame();
    String[] nombres = {"Numark", "Pioner", "Yamaha", "Beginger", "Hercules"};
    JPanel panel;
    JList lista;
    JList recibe;
    JButton boton;
    JTextField r = new JTextField();
    ArrayList gana;

    public TrabajoEnClase() {
        frame.setSize(500, 500);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        pantalla();

    }

    public void pantalla() {
        ubicar();
       

    }

    public void ubicar() {

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        lista = new JList(nombres);
        lista.setBounds(100, 100, 80, 110);

        panel.add(lista);

        recibe = new JList();
        recibe.setBounds(400, 100,80, 110);
        panel.add(recibe);

    
        boton = new JButton("JUGAR");
        boton.setBounds(220, 200, 100, 30);
        panel.add(boton);
        boton.addActionListener((ActionEvent ae) -> {
            seleccion();

        });

        r = new JTextField();
        r.setBounds(220, 150, 50, 30);
        panel.add(r);

    }

    public void seleccion() {
        gana = new ArrayList();
        int total = 0;
        try {
            total = Integer.parseInt(r.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(r, "Ingrese un numero");
        }
        DefaultListModel listModel = new DefaultListModel();
        int ganador = 0;
        Random sorteo = new Random();
        for (int i = 0; i < total; i++) {
            ganador = sorteo.nextInt(nombres.length);
            lista.setSelectedIndex(ganador);
         
            gana.add(nombres[ganador]);

            listModel.add(i, gana.get(i));
            recibe.setModel(listModel);

        }

    }

    
}
