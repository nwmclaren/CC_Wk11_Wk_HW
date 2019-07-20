import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "BA4567","MIA","17:45");
        passenger = new Passenger("Mr Mephisto", 2);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, flight.getPlane().getPlaneType());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("BA4567", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("MIA", flight.getDestination());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("17:45", flight.getDepartureTime());
    }

    @Test
    public void canGetPassengersCount(){
        assertEquals(0,flight.getPassengerCount());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void canReturnAvailableSeats(){
        flight.bookPassenger(passenger);
        assertEquals(466,flight.getAvailableSeats());
    }
}
