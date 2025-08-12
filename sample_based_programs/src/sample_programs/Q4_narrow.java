package sample_programs;
import java.util.Scanner;
public class Q4_narrow {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double val_d = input.nextDouble();
        int val_i = (int) val_d;
        System.out.println("\nType Conversion");
        System.out.println("Original double value: " + val_d);
        System.out.println("Converted int value  : " + val_i);
        input.close();
    }
}
