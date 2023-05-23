/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseabstracta;

/**
 *
 * @author SALA
 */
public class transporteAereo extends medioTransporte {
    //Atributos
    protected boolean alAire;
    
    //Métodos

    public transporteAereo(boolean alAire, boolean deMotor, int cantidadPasajeros) {
        super(deMotor, cantidadPasajeros);
        this.alAire = false;
    }
    
    
    public void despegar(){
        if(this.motorOn && !alAire){
            this.acelerar();
            System.out.println("Despegando...");
            this.alAire = true;
        }else{
            System.out.println("El vehículo no está listo para despegar");
        }
        
        
    }
    public void aterrizar(){
        if(this.alAire){
            this.frenar();
            System.out.println("Aterrizando...");
            this.alAire = false;
        }else{
            System.out.println("el vehículo está en tierra");
        }
        
    }
    public void ascender(){
        if(this.alAire){
            System.out.println("Ascendiendo...");
        }else{
            System.out.println("El vehículo está en tierra");
        }
        
    }
    public void descender(){
        if(this.alAire){
            System.out.println("Descendiendo...");
            
        }else{
            System.out.println("No se puede descender más");
        }
        
    }
    
}
