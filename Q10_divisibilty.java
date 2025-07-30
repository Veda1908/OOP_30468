package sample_programs;
import java.util.*;
public class Q10_divisibilty {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int n = input.nextInt();
	        if (n % 3 == 0 && n % 5 == 0) {
	            System.out.println(n + " is divisible by both 3 and 5.");
	        } else {
	            System.out.println(n + " is NOT divisible by both 3 and 5.");
	        }
	        input.close();
	    }
}
