package SortingAndStreamAPI;
import java.util.*;

class Candidate {
    private String name;
    private double cgpa;
    private int yearOfPassing;

    Candidate(String name, double cgpa, int year) {
        this.name = name;
        this.cgpa = cgpa;
        this.yearOfPassing = year;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getYearOfPassing() {
        return yearOfPassing;
    }

    public String toString() {
        return String.format("%s - CGPA: %.2f - Year: %d", name, cgpa, yearOfPassing);
    }
}
public class StudentPlacement {
    public static void main(String[] args) {
        List<Candidate> candidates = Arrays.asList(
            new Candidate("Vaishnavi", 9.2, 2024),
            new Candidate("Ravi", 8.5, 2023)
        );
        candidates.sort(
            Comparator.comparingDouble(Candidate::getCgpa).reversed()
                      .thenComparingInt(Candidate::getYearOfPassing)
        );
        System.out.println("Sorted Candidate List:");
        candidates.forEach(System.out::println);
    }
}