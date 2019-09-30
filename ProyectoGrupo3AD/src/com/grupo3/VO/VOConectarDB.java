package com.grupo3.VO;

import com.grupo3.BLL.BaseDeDatos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VOConectarDB {
    private JPanel principalJPanel;
    private JPanel datosJPanel;
    private JLabel nombreCCLabel;
    private JLabel tipoBaseDeDatosLabel;
    private JPanel loginJPanel;
    private JPanel entrarJPanel;
    private JButton entrarButton;
    private JPanel contenidosJPanel;
    private JButton volverButton;
    private JFrame frame;

    public VOConectarDB() {
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VOSeleccionCC();
                frame.dispose();
            }
        });
    }

    public void mostrar (final JFrame frame) {
        // Mostramos los datos del CC y la DBB
        nombreCCLabel.setText(nombreCCLabel.getText() + BaseDeDatos.getDatos().getNombreCC());
        tipoBaseDeDatosLabel.setText(tipoBaseDeDatosLabel.getText() + BaseDeDatos.getDatos().getTipoBDD());

        this.frame = frame;
        frame.getRootPane().setDefaultButton(entrarButton);
        frame.setContentPane(principalJPanel);
        frame.pack();
    }
}
