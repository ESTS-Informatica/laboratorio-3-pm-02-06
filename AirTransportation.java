
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
        setFees(AIR_FEES);
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        if(name != ""){
            this.name = name;
        }
    }
    
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        if(numberOfContainers > 0){
            this.numberOfContainers = numberOfContainers;
        }
    }
}
