public class MetalFactory {

    public static Metal getMetal(String metal){

        if(metal.equals("Iron")){
            return new Iron();
        }
        else if(metal.equals("Copper")){
            return new Copper();
        }
        else if(metal.equals("Aluminium")){
            return new Aluminium();
        }
        else{
            return null;
        }

    }
}
