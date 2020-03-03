/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author ccv
 */
public class Cartas implements ServicioCartas {

    private String palabra;
    private String pista;

    public String getPalabra() {
        return palabra;
    }

    public String getPista() {
        return pista;
    }

}
