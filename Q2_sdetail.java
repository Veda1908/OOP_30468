package sample_programs;
import java.util.*;
public class Q2_sdetail {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        String name = input.nextLine();
	        System.out.print("Enter rollno: ");
	        int rollno = input.nextInt();
	        System.out.print("Enter age: ");
	        int age = input.nextInt();
	        System.out.print("Enter gender: ");
	        char gender = input.next().charAt(0);
	        System.out.print("Enter percentage: ");
	        float perc = input.nextFloat();
	        System.out.printf("Name:%s%n", name);
	        System.out.printf("Roll number:%d%n", rollno);
	        System.out.printf("Age:%d%n", age);
	        System.out.printf("Gender:%c%n", gender);
	        System.out.printf("Percentage:%.2f%%%n", perc);
	        input.close();
	    }
}
