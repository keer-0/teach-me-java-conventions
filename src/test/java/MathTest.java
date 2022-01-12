import org.junit.Test;
import powerpackage.Math;
import static org.junit.Assert.assertEquals;

public class MathTest {


    @Test
    public void onePowerOne() {
        assertEquals(Math.power(1, 1), 1);
    }
    @Test
    public void twoPowerTwo() { assertEquals(Math.power(2,1),2);
    }

    @Test
    public void twoPowerFour() {
        assertEquals(Math.power(2,2),4);
    }

    @Test
    public void threePowerTwo() { assertEquals(Math.power(3,2),9);}
}
