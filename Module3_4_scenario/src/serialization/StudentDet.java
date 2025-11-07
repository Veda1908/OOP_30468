package serialization;
import java.io.*;
import java.util.ArrayList;

public class StudentDet {
    static class Student implements Serializable {
        String name;
        int id;
        double grade;
        transient String password; 
        Student(String name, int id, double grade, String password) {
            this.name = name;
            this.id = id;
            this.grade = grade;
            this.password = password;
        }

        public String toString() {
            return name + " | ID: " + id + " | Grade: " + grade;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 101, 88.5, "alice123"));
        students.add(new Student("Bob", 102, 76.0, "bob456"));

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            out.writeObject(students);
            System.out.println("Students saved.");
        } catch (IOException e) {
            System.out.println("Save error: " + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.ser"))) {
            ArrayList<Student> loaded = (ArrayList<Student>) in.readObject();
            System.out.println("Students loaded:");
            for (Student s : loaded) {
                System.out.println(s); 
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Load error: " + e.getMessage());
        }
    }
}