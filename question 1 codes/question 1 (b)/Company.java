public class Company {
    private boolean vehicleAvailable = true;  // Simulate vehicle availability

    public boolean schedulePickup(Passenger passenger) {
        if (vehicleAvailable) {
            System.out.println("Vehicle scheduled for pickup at (" +
                passenger.getPickup().getX() + ", " + passenger.getPickup().getY() +
                ") to destination (" +
                passenger.getDestination().getX() + ", " +
                passenger.getDestination().getY() + ")");
            return true;
        } else {
            System.out.println("No vehicles available. Pickup request lost.");
            return false;
        }
    }

}
