/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseabstracta;

/**
 *
 * @author SALA
 */
public class Helicoptero extends transporteAereo {
    private int numAspas;

    public Helicoptero(int numAspas, boolean alAire, boolean deMotor, int cantidadPasajeros) {
        super(alAire, deMotor, cantidadPasajeros);
        this.numAspas = numAspas;
    }
    
}
