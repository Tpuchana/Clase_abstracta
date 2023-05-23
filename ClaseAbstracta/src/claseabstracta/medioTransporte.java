package claseabstracta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SALA
 */
public class medioTransporte {
    protected boolean deMotor;
    protected int cantidadPasajeros;
    protected boolean motorOn;

    public medioTransporte(boolean deMotor, int cantidadPasajeros) {
        this.deMotor = deMotor;
        this.cantidadPasajeros = cantidadPasajeros;
        this.motorOn = false;
    }
    public boolean encender (){
        if(deMotor){
            if(motorOn){
                System.out.println("El motor está encendido");
            }else{
                System.out.println("Encendiendo motor...");
                this.motorOn = true;
                System.out.println("Motor encendido");
            }
        }else{
            System.out.println("El vehículo no tiene motor.");
        }
        return this.motorOn;
    }
    public boolean apagar(){
    if(deMotor){
        if(motorOn){
            System.out.println("Apagando motor...");
            this.motorOn = false;
            System.out.println("Motor apagado");
        }else{
            System.out.println("El motor ya está apagado");
        }
    }else{
        System.out.println("El vehículo no tiene motor");
    }
    return this.motorOn;
}
    public void acelerar(){
        if(motorOn || !this.deMotor){
            System.out.println("Acelerando");
        }else{
            System.out.println("El motor no está encendido");
        }
    }
    
     public void frenar(){
        if(motorOn || !this.deMotor){
            System.out.println("Frenando...");
        }else{
            System.out.println("El motor no está encendido");
        }
    }
    
}

