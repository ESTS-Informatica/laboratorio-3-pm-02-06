
/**
 * Escreva uma descrição da classe AirTransportation aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AirTransportation extends Transport
{
    private final static double AIR_FEES = 0.04;
    
    private String name;
    private int numberOfContainers;
    
    public AirTransportation(){
        super();
        setFees(4.0);
    }
}
