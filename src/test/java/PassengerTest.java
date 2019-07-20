import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void setup(){
        passenger = new Passenger("Mr Mephisto", 2);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Mr Mephisto", passenger.getName());
    }

    @Test
    public void canGetPassengerBags(){
        assertEquals(2,passenger.getNumberOfBags());
    }
}
