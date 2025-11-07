package exception_file;
import java.time.LocalTime;
public class FlightSystem {
    static class LateCheckInException extends Exception {
        public LateCheckInException(String message) {
            super(message);
        }
    }

    public static void checkIn(String passengerName, LocalTime departureTime, LocalTime checkInTime) throws LateCheckInException {
        if (checkInTime.isAfter(departureTime.minusMinutes(30))) {
            throw new LateCheckInException("Check-in failed for " + passengerName + ": Too late!");
        } else {
            System.out.println("Check-in successful for " + passengerName);
        }
    }

    public static void main(String[] args) {
        LocalTime departure = LocalTime.of(10, 0);

        try {
            checkIn("Alice", departure, LocalTime.of(9, 20)); 
        } catch (LateCheckInException e) {
            System.out.println(e.getMessage());
        }

        try {
            checkIn("Bob", departure, LocalTime.of(9, 45)); 
        } catch (LateCheckInException e) {
            System.out.println(e.getMessage());
        }
    }
}