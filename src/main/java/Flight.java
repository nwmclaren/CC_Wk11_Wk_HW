import java.util.ArrayList;

public class Flight {

    private String plane;
    private String flightNumber;
    private String destination;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(String plane, String flightNumber, String destination, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public String getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

}
