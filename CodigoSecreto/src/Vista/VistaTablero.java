/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author camil
 */
public final class VistaTablero extends JFrame {

    public JScrollPane scroll = new JScrollPane();
    public JPanel panel = new JPanel();
    public JLabel label[] = new JLabel[50];
    public ImageIcon carta;
    public Icon cartaIcon;

    private final String cartas[] = {"Alpes", "Antartida", "Azteca", "Barra", "Blanco", "Bosque", "Caballero",
        "Caballo", "Cabeza", "Casco", "Cinturon", "Corneta", "Cura", "Dragon", "Granada",
        "Guante", "Limusina", "Luna", "Monitor", "Motor", "Muerte", "Oso", "Pista",
        "Puente", "Sobre"};

    Container c = getContentPane();

    public VistaTablero() {
        super("Codigo Secreto");

        c.add(scroll);
        scroll.setViewportView(panel);

        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(400, 225));

        for (int i = 0; i < label.length; i++) {
            label[i] = new JLabel();
            panel.add(label[i]);
        }

        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/imagenes/tablero.jpg"));
        label[49].setBounds(0, 0, 1280, 720);
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(label[49].getWidth(), label[49].getHeight(), Image.SCALE_DEFAULT));
        label[49].setIcon(icono);

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/imagenes/cigarro.gif"));
        label[48].setBounds(0, 580, 100, 100);
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(label[48].getWidth(), label[48].getHeight(), Image.SCALE_DEFAULT));
        label[48].setIcon(icono2);

        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/imagenes/agenteRojo.png"));
        label[47].setBounds(0, 50, 300, 350);
        Icon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(label[47].getWidth(), label[47].getHeight(), Image.SCALE_DEFAULT));
        label[47].setIcon(icono3);

        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/imagenes/agenteAzul.png"));
        label[46].setBounds(0, 150, 300, 350);
        Icon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(label[46].getWidth(), label[46].getHeight(), Image.SCALE_DEFAULT));
        label[46].setIcon(icono4);

        ImageIcon imagen5 = new ImageIcon(getClass().getResource("/imagenes/inocente.png"));
        label[45].setBounds(0, 220, 300, 350);
        Icon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(label[45].getWidth(), label[45].getHeight(), Image.SCALE_DEFAULT));
        label[45].setIcon(icono5);

        ImageIcon imagen6 = new ImageIcon(getClass().getResource("/imagenes/asesino.png"));
        label[44].setBounds(0, 320, 300, 350);
        Icon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(label[44].getWidth(), label[44].getHeight(), Image.SCALE_DEFAULT));
        label[44].setIcon(icono6);

        ImageIcon imagen7 = new ImageIcon(getClass().getResource("/imagenes/equipoRojo.png"));
        label[17].setBounds(1000, 5, 200, 200);
        Icon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(label[17].getWidth(), label[17].getHeight(), Image.SCALE_DEFAULT));
        label[17].setIcon(icono7);

        ImageIcon imagen8 = new ImageIcon(getClass().getResource("/imagenes/equipoAzul.png"));
        label[16].setBounds(1000, 300, 200, 200);
        Icon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(label[16].getWidth(), label[16].getHeight(), Image.SCALE_DEFAULT));
        label[16].setIcon(icono8);

        acomodar(0, 0, 43, 0);
    }

    public void acomodar(int y1, int y2, int z, int x1) {
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {

                int j = (int) (Math.random() * cartas.length);
                while (cartas[j] == null) {
                    j = (int) (Math.random() * cartas.length);
                }
                carta = new ImageIcon(getClass().getResource("/cartas/carta" + cartas[j] + ".jpg"));
                cartas[j] = null;

                label[z - x].setBounds(400 + y1, 50 + y2, 80, 80);
                cartaIcon = new ImageIcon(carta.getImage().getScaledInstance(label[43 - x].getWidth(), label[43 - x].getHeight(), Image.SCALE_DEFAULT));
                label[z - x].setIcon(cartaIcon);

                x1 += 1;
                y1 += 100;
            }

            y2 += 100;
            y1 = 0;
            z = z - 5;
        }
    }

}
