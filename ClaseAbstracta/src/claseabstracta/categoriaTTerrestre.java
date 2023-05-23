package claseabstracta;

/**
 *
 * @author SALA
 */
public enum categoriaTTerrestre {
    AUTO(true), BUS(true), BICICLETA(false), MOTO(true), SCOOTER(true), TREN(true), PATINETA(false);
    
    //atributos
    
    private boolean deMotor;

    private categoriaTTerrestre(boolean deMotor) {
        this.deMotor = deMotor;
    }
    
    public boolean isdeMotor(){
        return deMotor;
    }
    
    
    
}
