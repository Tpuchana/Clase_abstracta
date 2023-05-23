/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseabstracta;

/**
 *
 * @author SALA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        transporteTerrestre auto1 = new transporteTerrestre(categoriaTTerrestre.AUTO, 4,true,5);
        
        //medioTransporte m1 = new medioTransporte(true,8); -> las clases abstractas no pueden crear objetos
      
        auto1.encender();
        auto1.acelerar();
        auto1.conducir();
        auto1.frenar();
        auto1.apagar();
        
        transporteTerrestre bici1 = new transporteTerrestre(categoriaTTerrestre.BICICLETA, 2, false, 2);
        bici1.encender();
        bici1.acelerar();
        bici1.conducir();
        bici1.frenar();
        bici1.apagar();
        
        Avion avion1 = new Avion(2, 30);
        avion1.encender();
        avion1.acelerar();
        avion1.despegar();
        avion1.frenar();
        avion1.apagar();
        avion1.aterrizar();
                
    }
    
    
    
    
    
    
    
}
