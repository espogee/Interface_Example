public class Car implements Vehicle {
    public String transportType = "terrestrial";
    public int wheels;
    public Car (int wheels){
        this.wheels = wheels;
    }
    public String getTransportType(){
        return this.transportType;

    }
    public boolean hasWheels(){
        return wheels>0;
    }

    public int getNumberOfWheels(){
        return wheels;
    }
    public String canRideOrSail() {
        if (wheels > 0) {
            return "Can ride on the road";
        } else {
            return "Boat? Sail at the sea";
        }
    }

}
