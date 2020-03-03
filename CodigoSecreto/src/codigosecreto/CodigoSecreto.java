/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigosecreto;

import Controlador.Controlador;
import Vista.Vista;

/**
 *
 * @author camil
 */
public class CodigoSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vista v = new Vista();      
        Controlador c = new Controlador(v);
        
        c.mostrar();
    }
    
}
