public class Boat implements Vehicle{
    public String transportType = "marine";
    public static int wheels = 0;

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
