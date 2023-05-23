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
    }
    
    
    
}
