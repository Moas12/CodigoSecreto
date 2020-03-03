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
public class CivilAdapter implements TargetAgente {

    private CivilInocente civil;

    public CivilAdapter() {
        this.civil = new CivilInocente();
    }

    @Override
    public String mostrarColor() {
        return civil.getStatus();
    }

}
