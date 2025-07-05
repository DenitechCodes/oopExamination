import java.util.Random;

public class PassengerSource {
    private Company company;
    private Random random;

    // Constructor
    public PassengerSource(Company company) {
        this.company = company;
        this.random = new Random();
    }

    // random location
    private Location generateRandomLocation() {
        int x = random.nextInt(101);
        int y = random.nextInt(101);
        return new Location(x, y);
    }

    // request pickup
    public boolean requestPickup() {
        Location pickup = generateRandomLocation();
        Location destination = generateRandomLocation();
        Passenger passenger = new Passenger(pickup, destination);
        return company.schedulePickup(passenger);
    }

    // testing
    public static void main(String[] args) {
        Company myCompany = new Company();
        PassengerSource source = new PassengerSource(myCompany);

        boolean success = source.requestPickup();
        System.out.println("Request success: " + success);
    }
}
