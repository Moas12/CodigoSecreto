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
public class Concreto implements ServicioFactory {

    public ServicioCartas crearCarta() {
        return new Cartas();
    }

}
