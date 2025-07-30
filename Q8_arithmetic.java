package sample_programs;
import java.util.*;
public class Q8_arithmetic {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int remain = a % b;
        System.out.println("\nArithmetic Operations:");
        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + remain);
        input.close();
    }
}
