public class Main {
    public static void main(String[] args) {
        Car taxi = new Car(4);
        System.out.println("Taxi has wheels? "+ taxi.hasWheels() + " Number of wheels: "+ taxi.getNumberOfWheels() + " Transport Type "+ taxi.getTransportType() + " "+ taxi.canRideOrSail());

        Motorcycle scooter = new Motorcycle(2);
        System.out.println("Motorcycle has wheels? "+ scooter.hasWheels() + " Number of wheels: "+ scooter.getNumberOfWheels()+ " Transport Type "+ scooter.getTransportType()+ " "+ scooter.canRideOrSail());

        Boat titanic = new Boat();
        System.out.println("Boat has wheels? "+ titanic.hasWheels() + " Number of wheels: "+ titanic.getNumberOfWheels()+ " Transport Type "+ titanic.getTransportType()+ " "+ titanic.canRideOrSail());
    }
}