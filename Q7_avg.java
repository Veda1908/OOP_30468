package sample_programs;
import java.util.*;
public class Q7_avg {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter number1: ");
	        double n1 = input.nextDouble();
	        System.out.print("Enter number2: ");
	        double n2 = input.nextDouble();
	        System.out.print("Enter number3: ");
	        double n3 = input.nextDouble();
	        double avg = (n1 + n2 + n3) / 3;
	        System.out.println("\nAverage = " + avg);
	        input.close();
	    }
}
