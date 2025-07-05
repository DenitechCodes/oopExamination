import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompanyTest {

    @Test
    public void testSchedulePickupWhenVehicleAvailable() {
        Company company = new Company(true);
        Passenger passenger = new Passenger(new Location(10, 20), new Location(30, 40));
        boolean result = company.schedulePickup(passenger);
        assertTrue(result, "Vehicle was available, so pickup should be scheduled.");
    }

    @Test
    public void testSchedulePickupWhenVehicleNotAvailable() {
        Company company = new Company(false);
        Passenger passenger = new Passenger(new Location(50, 60), new Location(70, 80));
        boolean result = company.schedulePickup(passenger);
        assertFalse(result, "Vehicle was not available, so pickup should be denied.");
    }
}
