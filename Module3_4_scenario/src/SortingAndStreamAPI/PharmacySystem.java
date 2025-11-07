package SortingAndStreamAPI;
import java.util.*;
class Medicine {
    private String name;
    private double price;
    private int expiryYear;

    Medicine(String name, double price, int expiryYear) {
        this.name = name;
        this.price = price;
        this.expiryYear = expiryYear;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getExpiryYear() {
        return expiryYear;
    }
    public String toString() {
        return String.format("%s - ₹%.2f - Expiry: %d", name, price, expiryYear);
    }
}
public class PharmacySystem {
    public static void main(String[] args) {
        List<Medicine> meds = Arrays.asList(
            new Medicine("Paracetamol", 25.0, 2026),
            new Medicine("Ibuprofen", 25.0, 2025),
            new Medicine("Amoxicillin", 30.0, 2027)
        );
        meds.sort(
            Comparator.comparingDouble(Medicine::getPrice)
                      .thenComparing(Comparator.comparingInt(Medicine::getExpiryYear).reversed())
        );
        System.out.println("Sorted Medicines:");
        meds.forEach(System.out::println);
    }
}