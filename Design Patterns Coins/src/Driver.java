import java.util.Scanner;

public class Driver {

    public static void main(String[]args){
        int choice=0;
        String input="";
        Coin c=null;
        CoinBuilder cb=new CoinBuilder();
        Scanner sc=new Scanner(System.in);
        CoinFoundry foundry=CoinFoundry.getInstance();

        while(choice!=4) {
            System.out.println("What do you want to do?\n1- Create coin\n2- Send coin to foundry\n3- Transport foundry coins\n4- Exit");
            input=sc.nextLine();
            choice= Integer.parseInt(input);
            if(choice==1){
                Metal m1=null;
                Metal m2=null;
                int val=0;

                System.out.println("Choose first metal:\n1- Iron\n2- Copper\n3- Aluminium");
                String metal1=sc.nextLine();

                System.out.println("Choose second metal:\n1- Iron\n2- Copper\n3- Aluminium");
                String metal2=sc.nextLine();
                m1=MetalFactory.getMetal(metal1);
                m2=MetalFactory.getMetal(metal2);

                System.out.println("Enter value of coin: ");
                val= Integer.parseInt(sc.nextLine());

                c=cb.metal1(m1).metal2(m2).valueOfCoin(val).build();
                System.out.println("You have successfully created a coin!");
            }
            else if(choice==2){
                if(c!=null){
                    foundry.addCoin(c);
                    c=null;
                    System.out.println("You have successfully sent the coin to the foundry!");
                }
                else{
                    System.err.println("You have to create a coin first!");
                }
            }
            else if(choice==3){
                System.out.println("Choose region to send coins to:\n1- Europe\n2- America\n3- Australia");
                String region=sc.nextLine();
                foundry.transportCoins(region);
            }

        }

    }
}
