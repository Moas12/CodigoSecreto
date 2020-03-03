/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaTablero;
import javax.swing.JFrame;

/**
 *
 * @author camil
 */
public class ControladorTablero {

    public VistaTablero vista;

    public ControladorTablero(VistaTablero vista) {
        this.vista = vista;

    }

    public void mostrar() {
        vista.setSize(1280, 720);
        vista.setLocationRelativeTo(null);
        vista.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        vista.setVisible(true);
        vista.setResizable(false);
    }

}
