public class TransportFacade {
    TransportToEurope europe;
    TransportToAmerica america;
    TransportToAustralia australia;

    public TransportFacade(){
        europe=new TransportToEurope();
        america=new TransportToAmerica();
        australia=new TransportToAustralia();
    }

    public void transportToAustralia(){
        australia.transport();
    }

    public void transportToAmerica(){
        america.transport();
    }

    public void transportToEurope(){
        europe.transport();
    }
}
