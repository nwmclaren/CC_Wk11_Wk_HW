import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Flight flight2;
    Plane plane;
    Plane plane2;
    Passenger passenger;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.BEECHCRAFT);
        flight = new Flight(plane, "BA4567","MIA","17:45");
        flight2 = new Flight(plane2, "BB8", "Campbeltown", "18:00");
        passenger = new Passenger("Mr Mephisto", 2);
        passenger2 = new Passenger("Zak McCracken", 1);
        passenger3 = new Passenger("Bram Stoker", 1);
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
    public void canBlockBookingCapacityBreached(){
        flight2.bookPassenger(passenger);
        flight2.bookPassenger(passenger2);
        flight2.bookPassenger(passenger3);
        assertEquals(2, flight2.getPassengerCount());
    }

    @Test
    public void canReturnAvailableSeats(){
        flight.bookPassenger(passenger3);
        assertEquals(466,flight.getAvailableSeats());
    }

}
