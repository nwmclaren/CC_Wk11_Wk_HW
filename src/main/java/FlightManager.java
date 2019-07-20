public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getReservedBaggageWeight(){
        return this.flight.getPlane().getPlaneType().getWeight()/2;
    }

    public int getWeightOfBagPerPerson(){
        return (this.getReservedBaggageWeight())/(this.flight.getPlane().getPlaneType().getCapacity());
    }

    public int getBaggageWeightBooked(){
        return flight.getPassengerCount() * this.getWeightOfBagPerPerson();
    }

    public int getRemainingAvailableBaggageAmount(){
        return this.getReservedBaggageWeight() - this.getBaggageWeightBooked();
    }

}
