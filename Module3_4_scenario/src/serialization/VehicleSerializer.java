package serialization;
import java.io.*;
import java.util.ArrayList;

public class VehicleSerializer {
    static class Vehicle implements Serializable {
        int vehicleId;
        String model;
        double rate;

        Vehicle(int vehicleId, String model, double rate) {
            this.vehicleId = vehicleId;
            this.model = model;
            this.rate = rate;
        }

        public String toString() {
            return "ID: " + vehicleId + ", Model: " + model + ", Rate: " + rate;
        }
    }

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle(1, "Sedan", 2500.0));
        vehicles.add(new Vehicle(2, "SUV", 3500.0));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("vehicles.dat"))) {
            out.writeObject(vehicles);
            System.out.println("Vehicles saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving vehicles: " + e.getMessage());
        }
    }
}