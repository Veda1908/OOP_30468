package fileIO;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RestaurantSys {
    public static void appendOrders(ArrayList<String> orders) {
        String fileName = "orders.log";
        try (FileWriter writer = new FileWriter(fileName, true)) { 
            for (String order : orders) {
                writer.write(order + System.lineSeparator());
            }
            System.out.println("✅ Orders successfully logged to " + fileName);
        } catch (IOException e) {
            System.err.println("❌ Error writing to file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        ArrayList<String> sampleOrders = new ArrayList<>();
        sampleOrders.add("2025-10-13 12:30: Pizza $15");
        sampleOrders.add("2025-10-13 12:45: Pasta $12");
        sampleOrders.add("2025-10-13 13:00: Salad $8");

        appendOrders(sampleOrders);
    }
}