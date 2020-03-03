/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author ccv
 */
public class AgenteAzul implements TargetAgente {

    private boolean continuarJugando;

    public AgenteAzul() {
    }

    @Override
    public String mostrarColor() {
        return "azul";
    }

}
