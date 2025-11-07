package exception_file;
import java.io.*;
import java.util.ArrayList;

public class ApplicationHr {
    static class Employee implements Serializable {
        String name;
        int id;
        double salary;
        transient String password;
        Employee(String name, int id, double salary, String password) {
            this.name = name;
            this.id = id;
            this.salary = salary;
            this.password = password;
        }

        public String toString() {
            return name + " | ID: " + id + " | Salary: " + salary;
        }
    }

    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            out.writeObject(new Employee("Alice", 101, 50000, "pass1"));
            out.writeObject(new Employee("Bob", 102, 60000, "pass2"));
            System.out.println("Employees saved.");
        } catch (IOException e) {
            System.out.println("Save error: " + e.getMessage());
        }
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            System.out.println("Employees loaded:");
            System.out.println((Employee) in.readObject());
            System.out.println((Employee) in.readObject());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Load error: " + e.getMessage());
        }
    }
}