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

    private Transport getTransportation(String id){
        for(Transport t: this){
            if(t.getId() == id){
                return t;
            }
        }
        return null;
    }

    public void makeTransportation(String id, String origin, String destination, double price){
        Transport t = getTransportation(id);
        if(t.isAvailable() && t != null){
            t.setOrigin(origin);
            t.setDestination(destination);
            t.setPrice(price);
            t.setAvailable(false);
            inService.add(t);
            this.remove(t);
        }
    }

    public void finalizeTransportation(String id){
        Transport t = getTransportation(id);
        if(inService.contains(t)){
            inService.remove(t);
        }
        t.setOrigin("");
        t.setDestination("");
        t.setPrice(0.0);
        t.setAvailable(true);
        this.add(t);
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
