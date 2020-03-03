/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Vista;
import Vista.VistaTablero;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;

/**
 *
 * @author camil
 */
public class Controlador {

    public Vista vista;
    ImageIcon imagen3;
    Icon icono2;

    public Controlador(Vista vista) {
        this.vista = vista;

        vista.label1.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    //Añadir dirección de librería de música
                    //InputStream in = new FileInputStream("C:\\Users\\estudiantes\\Downloads\\CodigoSecreto\\src\\musica\\disparo.wav");       
                    //AudioStream as = new AudioStream(in);  
                    //AudioPlayer.player.start(as);

                    VistaTablero vistaTablero = new VistaTablero();
                    ControladorTablero controladorTablero = new ControladorTablero(vistaTablero);

                    controladorTablero.mostrar();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                imagen3 = new ImageIcon(getClass().getResource("/imagenes/jugar1.png"));
                icono2 = new ImageIcon(imagen3.getImage().getScaledInstance(vista.label1.getWidth(), vista.label1.getHeight(), Image.SCALE_DEFAULT));
                vista.label1.setIcon(icono2);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                imagen3 = new ImageIcon(getClass().getResource("/imagenes/jugar.png"));
                icono2 = new ImageIcon(imagen3.getImage().getScaledInstance(vista.label1.getWidth(), vista.label1.getHeight(), Image.SCALE_DEFAULT));
                vista.label1.setIcon(icono2);
            }

        });

        vista.label2.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                /*try {
                    //Para que suene la musica cambiar esta direccion xd
                    InputStream in = new FileInputStream("C:\\Users\\estudiantes\\Downloads\\CodigoSecreto\\src\\musica\\disparo.wav");
                    AudioStream as = new AudioStream(in);
                    AudioPlayer.player.start(as);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }*/
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                imagen3 = new ImageIcon(getClass().getResource("/imagenes/opciones1.png"));
                icono2 = new ImageIcon(imagen3.getImage().getScaledInstance(vista.label2.getWidth(), vista.label2.getHeight(), Image.SCALE_DEFAULT));
                vista.label2.setIcon(icono2);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                imagen3 = new ImageIcon(getClass().getResource("/imagenes/opciones.png"));
                icono2 = new ImageIcon(imagen3.getImage().getScaledInstance(vista.label2.getWidth(), vista.label2.getHeight(), Image.SCALE_DEFAULT));
                vista.label2.setIcon(icono2);
            }

        });

        vista.label3.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                /*try {
                    //Para que suene la musica cambiar esta direccion xd
                    InputStream in = new FileInputStream("C:\\Users\\estudiantes\\Downloads\\CodigoSecreto\\src\\musica\\disparo.wav");
                    AudioStream as = new AudioStream(in);
                    AudioPlayer.player.start(as);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }*/
                JOptionPane.showMessageDialog(null, "Se cerrara el juego");
                System.exit(0);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                imagen3 = new ImageIcon(getClass().getResource("/imagenes/back1.png"));
                icono2 = new ImageIcon(imagen3.getImage().getScaledInstance(vista.label3.getWidth(), vista.label3.getHeight(), Image.SCALE_DEFAULT));
                vista.label3.setIcon(icono2);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                imagen3 = new ImageIcon(getClass().getResource("/imagenes/back.png"));
                icono2 = new ImageIcon(imagen3.getImage().getScaledInstance(vista.label3.getWidth(), vista.label3.getHeight(), Image.SCALE_DEFAULT));
                vista.label3.setIcon(icono2);
            }

        });
    }

    public void mostrar() {
        vista.setSize(1280, 720);
        vista.setLocationRelativeTo(null);
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setVisible(true);
        vista.setResizable(false);
    }
}
