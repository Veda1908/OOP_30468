package sample_programs;
import java.util.*;
public class Q11_circle{
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double rad = sc.nextDouble();
        double area = PI * rad * rad;
        double circ = 2 * PI * rad;
        System.out.println("circle area is: " + area);
        System.out.println("circle circumference is: " + circ);

        sc.close();
    }
}

