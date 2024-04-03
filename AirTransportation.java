
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
    
    public AirTransportation(String name, int numberOfContainers){
        super();
        setFees(AIR_FEES);
        this.name = name;
        this.numberOfContainers = numberOfContainers;
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
    
    @Override
    public String getTransportType() {
        return "Transporte Aereo";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));  
        sb.append(String.format("%15s: %s\n", "ID", getId()));  
        sb.append(String.format("%15s: %s\n", "Nome", name));
        sb.append(String.format("%15s: %d\n", "Numero de Contentores", numberOfContainers));
        sb.append(String.format("%15s: %s\n", "Origem", getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", getFees()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
}
