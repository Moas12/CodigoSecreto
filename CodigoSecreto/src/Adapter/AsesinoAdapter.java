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
public class AsesinoAdapter implements TargetAgente {
    
    private Asesino asesino;
    
    public AsesinoAdapter() {
        this.asesino = new Asesino();
    }

    @Override
    public String mostrarColor() {
        return asesino.getStatus();
    }
    
    
            
}
