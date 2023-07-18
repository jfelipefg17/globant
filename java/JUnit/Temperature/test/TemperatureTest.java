import entities.Temperature;
import org.junit.Before;
import org.junit.Test;
import service.ServiceTemperature;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest {

    Temperature t1;
    ServiceTemperature s1;

    @Before
    public void serUp () {
        t1 = new Temperature(100);
        s1 = new ServiceTemperature();
    }

    @Test
    public void celsius (){
        assertEquals(38.0,s1.celsius(t1.getFar()));
    }

    @Test
    public void kelvin () {
        assertEquals(311.15,s1.kelvin(t1.getFar()));
    }
}