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
    private categoriaTTerrestre categoria;
    private int numeroLlantas;
    private boolean conTecho;
    //constructor
    public transporteTerrestre(categoriaTTerrestre categoria, int numeroLlantas, boolean conTecho,int cantidadPasajeros){
        super(categoria.isdeMotor(), cantidadPasajeros);        
        this.numeroLlantas = numeroLlantas;
        this.conTecho = conTecho;
        
        
    }
    public void conducir(){
        if (this.motorOn){
            System.out.println("Conduciendo... ");
        }else{
            System.out.println("El motor está apagado");
        }
    }

    
}
