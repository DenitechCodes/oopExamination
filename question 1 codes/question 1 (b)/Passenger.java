public class Passenger {
    private Location pickup;
    private Location destination;

    public Passenger(Location pickup, Location destination) {
        this.pickup = pickup;
        this.destination = destination;
    }

    public Location getPickup() {
        return pickup;
    }

    public Location getDestination() {
        return destination;
    }
}
