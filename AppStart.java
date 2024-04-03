
/**
 * Escreva uma descrição da classe AppStart aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppStart
{
    public static void main(String args[]){
        ShippingCompany sc = new ShippingCompany("RELIABLE-MOVING");
        sc.add(new GroundTransportation("ola123"));
        sc.add(new AirTransportation("F11", 0));
        sc.add(new AirTransportation("B96", 8));
        sc.add(new Lorry(2, 3, "HAAHAH"));
        sc.add(new Van(77, "IAHQFWIU"));
        
        sc.toString();
    }
}
