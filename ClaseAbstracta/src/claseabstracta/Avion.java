package claseabstracta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import claseabstracta.transporteAereo;

/**
 *
 * @author SALA
 */
public class Avion extends transporteAereo {
    private int numTurbinas;

    public Avion(int numTurbinas, int cantidadPasajeros) {
        super(true, true, cantidadPasajeros);
        this.numTurbinas = numTurbinas;
    }
    
    
    
}
