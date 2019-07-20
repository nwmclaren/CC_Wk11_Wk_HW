import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureTime;
    private ArrayList<Passenger> passengers;

    public Flight(Plane plane, String flightNumber, String destination, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }

    public Plane getPlane() {
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

    public int getPassengerCount(){
        return passengers.size();
    }

    public void bookPassenger(Passenger passenger){
        if (this.plane.getPlaneType().getCapacity() > this.passengers.size()){
            this.passengers.add(passenger);
        }
    }

    public int getAvailableSeats(){
        return this.plane.getPlaneType().getCapacity() - this.passengers.size();

    }

}
