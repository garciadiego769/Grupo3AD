package com.grupo3.VO;

import com.grupo3.BLL.BaseDeDatos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VOSeleccionCC {
    private JButton mysqlButton;
    private JButton sqliteButton;
    private JButton db4oButton;
    private JPanel superiorJPanel;
    private JPanel centroJPanel;
    private JPanel inferiorJPanel;
    private JPanel principalJPanel;
    private JPanel contenidoJPanel;

    public VOSeleccionCC() {
        final JFrame frame = new JFrame("Proyecto Grupo 3AD"); // Vamos a usar este Frame en todas las ventanas
        frame.setResizable(false); // Nos evitamos líos si no se puede reescalar
        frame.setContentPane(principalJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null); // Centra la ventana
        VOConectarDB voConectarDB = new VOConectarDB(); // Podemos iniciar la siguiente ventana ya

        frame.setVisible(true);

        db4oButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí se establece el tipo de BDD y el nombre del CC
                BaseDeDatos.introducirDatosCC("Elejalde","DB4O");
                voConectarDB.mostrar(frame);
            }
        });
        sqliteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí se establece el tipo de BDD y el nombre del CC
                BaseDeDatos.introducirDatosCC("Ibitzailde","SQLITE");
                voConectarDB.mostrar(frame);
            }
        });
        mysqlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí se establece el tipo de BDD y el nombre del CC
                BaseDeDatos.introducirDatosCC("Iparralde","MYSQL");
                voConectarDB.mostrar(frame);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        db4oButton = new JButton(new ImageIcon("resources/db4o.png"));
        mysqlButton = new JButton(new ImageIcon("resources/mysql.png"));
        sqliteButton = new JButton(new ImageIcon("resources/sqlite.png"));
    }



}