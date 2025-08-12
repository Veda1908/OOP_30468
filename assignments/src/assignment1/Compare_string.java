package assignment1;
import java.util.*;
public class Compare_string {
	public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.print("Enter first student name: ");
        String input1 = scann.nextLine();

        System.out.print("Enter second student name: ");
        String input2 = scann.nextLine();

        String str1 = new String(input1);
        String str2 = new String(input2);

        System.out.println("\n== Comparison:");
        System.out.println("input1 == input2: " + (input1 == input2));
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("\n.equals() Comparison:");
        System.out.println("input1.equals(input2): " + input1.equals(input2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));

        System.out.println("\n.equalsIgnoreCase() Comparison:");
        System.out.println("input1.equalsIgnoreCase(input2): " + input1.equalsIgnoreCase(input2));
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));

        scann.close();
    }
}
