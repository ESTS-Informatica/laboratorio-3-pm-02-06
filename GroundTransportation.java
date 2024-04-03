
/**
 * Escreva uma descrição da classe GroundTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GroundTransportation extends Transport
{
    private final static double GROUND_FEES = 0.03;
    
    private String licensePlate;
    
    public GroundTransportation(){
        super();
        setFees(GROUND_FEES);
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        if(licensePlate != ""){
            this.licensePlate = licensePlate;
        }
    }
}
