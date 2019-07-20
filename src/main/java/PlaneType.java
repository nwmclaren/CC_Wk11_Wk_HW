public enum PlaneType {

    BOEING747("4 Engine Large Passenger",467, 442000),
    BOEING777("4 Engine Medium Passenger", 350, 350000),
    AIRBUS350("Medium 4 Engine Passenger", 400, 400000);

    private final String type;
    private final int capacity;
    private final int weight;

    PlaneType(String type, int capacity, int weight){
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public String getType(){
        return type;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getWeight(){
        return weight;
    }
}
