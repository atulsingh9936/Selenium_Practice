package Core_Java.Interface;

public class Australian_traffic implements Central_traffic,Continent_traffic {
    public static void main(String[] args) {
        Central_traffic australianTraffic = new Australian_traffic();
        australianTraffic.Redstop();
        australianTraffic.greenGo();
        australianTraffic.flashyellow();


        Australian_traffic australianTraffic1 = new Australian_traffic();
        australianTraffic1.walkonsymbol();

        Continent_traffic continentTraffic = new Australian_traffic();
      continentTraffic.trainsymbol();


    }

    @Override
    public void greenGo() {
        System.out.println("greengo implementation");
        // code
    }

    @Override
    public void Redstop() {
        System.out.println("Redstop implementation");

    }

    public void walkonsymbol(){
        System.out.println("walking");
    }

    @Override
    public void flashyellow() {
        System.out.println("Flashyellow implementation");

    }


    @Override
    public void trainsymbol() {
        System.out.println("train symbol");

    }
}
