package sample_programs;
import java.util.*;
public class Q5_ascii {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter character:");
	        char ch = input.next().charAt(0);
	        int asc = (int) ch;
	        System.out.println("ascii value:" + asc);
	        input.close();
	    }
}
