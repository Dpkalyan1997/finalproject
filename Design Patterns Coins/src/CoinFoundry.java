import java.util.ArrayList;

/**
 * this class implements singleton design pattern
 */
public class CoinFoundry {
    private static CoinFoundry foundry=new CoinFoundry();
    ArrayList<Coin> coins;
    TransportFacade transport;

    private CoinFoundry(){
        coins=new ArrayList<>();
        transport=new TransportFacade();

    }

    public void addCoin(Coin c){
        coins.add(c);
    }

    public void transportCoins(String region){
        if(coins.size()>0) {
            if (region.equalsIgnoreCase("Australia")) {
                transport.transportToAustralia();
            } else if (region.equalsIgnoreCase("America")) {
                transport.transportToAmerica();
            } else if (region.equalsIgnoreCase("Europe")) {
                transport.transportToEurope();
            }
            coins = new ArrayList<>();
        }
        else{
            System.out.println("No coins available to transport!");
        }
    }

    public static CoinFoundry getInstance(){
        return foundry;
    }

}
