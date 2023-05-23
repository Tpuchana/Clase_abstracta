/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseabstracta;

/**
 *
 * @author SALA
 */
public class transporteTerrestre extends medioTransporte {
    //atributos
    private String categoria;
    private int numeroLlantas;
    private boolean conTecho;
    //constructor
    public transporteTerrestre(String categoria, int numeroLlantas, boolean conTecho, boolean deMotor, int cantidadPasajeros, boolean motorOn){
        super(deMotor, cantidadPasajeros, motorOn);
        this.categoria = categoria;
        this.numeroLlantas = numeroLlantas;
        this.conTecho = conTecho;
        
        
    }

    
}
