import java.util.HashSet;
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe ShippingCompany aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ShippingCompany extends HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService;
    
    public ShippingCompany(String name){
        this.name = name;
        this.inService = new ArrayList<>();
    }
    
    public String getName(){
        return name;
    }
    
    public ArrayList<Transport> getInService(){
        return inService;
    }
    
    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        
        for(Transport t : this){
            sb.append(t.toString());
        }
        
        return sb.toString();
    }
}
