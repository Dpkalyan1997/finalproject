import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Testing {


    @Test
    public void metalFactoryTest(){
        Metal m=MetalFactory.getMetal("Copper");
        assertNotEquals(m,null);
    }

    @Test
    public void coinBuilderTest(){
        Metal m1=MetalFactory.getMetal("Copper");
        Metal m2=MetalFactory.getMetal("Iron");

        CoinBuilder builder=new CoinBuilder();
        Coin c=builder.metal1(m1).metal2(m2).valueOfCoin(10).build();

        assertNotEquals(c,null);

    }

    @Test
    public void transportFacadeTest(){

       ByteArrayOutputStream outContent = new ByteArrayOutputStream();
       PrintStream originalOut = System.out;
       System.setOut(new PrintStream(outContent));
       TransportFacade facade=new TransportFacade();
       facade.transportToAustralia();

       assertEquals("Coins transported to Australia!", outContent.toString().trim());
       System.setOut(originalOut);

    }
}
