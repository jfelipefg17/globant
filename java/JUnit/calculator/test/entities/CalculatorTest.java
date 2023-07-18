package entities;


import org.junit.Before;
import org.junit.Test;
import services.ServiceCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator c1;
    ServiceCalculator s1;

    @Before
    public void setUp() {
        c1 = new Calculator(100);
        s1 = new ServiceCalculator();
    }

    @Test
    public void discount10(){
    assertEquals(90.0,s1.discount10(c1.getNum1()));
    }
}