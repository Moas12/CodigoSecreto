/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author camil
 */
public class Vista extends JFrame{
    
    public JScrollPane scroll = new JScrollPane();
    public JPanel panel = new JPanel();
    public JLabel label = new JLabel();
    public JLabel label1 = new JLabel();
    public JLabel label2 = new JLabel();
    public JLabel label3 = new JLabel();
    
    Container c = getContentPane();
    
    public Vista(){
        super("Codigo Secreto");                
        
        /*try{
            //Para que suene la musica cambiar esta direccion xd
            InputStream in = new FileInputStream("C:\\Users\\estudiantes\\Downloads\\CodigoSecreto\\src\\musica\\padrino.wav");       
            AudioStream as = new AudioStream(in);  
            AudioPlayer.player.start(as);
        }catch(Exception e){
            e.printStackTrace();
        }*/
        
        c.add(scroll);
        scroll.setViewportView(panel);
        
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(400, 225));
        
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label);
        
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("/imagenes/mob1.gif"));
        label.setBounds(0, 0, 1280, 720);  
        Icon icono = new ImageIcon(imagen1.getImage().getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icono);
        
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/imagenes/jugar.png"));
        label1.setBounds(50, 50, 200, 200);
        Icon icono1 = new ImageIcon(imagen2.getImage().getScaledInstance(label1.getWidth(),label1.getHeight(), Image.SCALE_DEFAULT));
        label1.setIcon(icono1);
        
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("/imagenes/opciones.png"));
        label2.setBounds(50, 200, 200, 200);
        Icon icono2 = new ImageIcon(imagen3.getImage().getScaledInstance(label2.getWidth(),label2.getHeight(), Image.SCALE_DEFAULT));
        label2.setIcon(icono2);
        
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("/imagenes/back.png"));
        label3.setBounds(50, 350, 200, 200);
        Icon icono3 = new ImageIcon(imagen4.getImage().getScaledInstance(label3.getWidth(),label3.getHeight(), Image.SCALE_DEFAULT));
        label3.setIcon(icono3);
        
    }
    
}
