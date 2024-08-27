import entities.Birthdate;
import org.junit.Before;
import org.junit.Test;
import service.ServiceBirthdate;

import static org.junit.Assert.*;

public class BirthdateTest {

    ServiceBirthdate s1;
    Birthdate b1;
    @Before
    public void setUp()  {

        s1 = new ServiceBirthdate();
        b1 = s1.createBirth("2003-10-17");
    }

    @Test
    public void ageTest () {
        assertEquals(19,s1.age(b1));
    }

    @Test
    public void leapYearTest () {
        assertTrue(s1.leapYear(2000));
    }
}
