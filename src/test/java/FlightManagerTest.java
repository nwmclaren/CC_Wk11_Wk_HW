import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    Flight flight;
    Plane plane;
    Passenger passenger;
    Passenger passenger2;
    FlightManager flightManager;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "BA4567","MIA","17:45");
        flightManager = new FlightManager(flight);
        passenger = new Passenger("Mr Mephisto", 2);
        passenger2 = new Passenger("Zak McCracken", 1);
    }

    @Test
    public void canGetReservedBaggageWeight(){
        assertEquals(221000, flightManager.getReservedBaggageWeight());
    }

    @Test
    public void canGetWeightOfBagPerPerson(){
        assertEquals(473,flightManager.getWeightOfBagPerPerson());
    }

    @Test
    public void canGetBaggageWeightOfPassengersOnFlight(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger2);
        assertEquals(946, flightManager.getBaggageWeightBooked());
    }

    @Test
    public void getRemainingAvailableBaggageAmount() {
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger2);
        assertEquals(220054, flightManager.getRemainingAvailableBaggageAmount());

    }
}
