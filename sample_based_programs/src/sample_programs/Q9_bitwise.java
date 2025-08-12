package sample_programs;
import java.util.*;
public class Q9_bitwise {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = input.nextInt();
        System.out.print("Enter num2: ");
        int b = input.nextInt();
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int l_Sh = a << 1;
        int r_Sh = a >> 1;
        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");
        System.out.println("a & b = " + and + " (" + Integer.toBinaryString(and) + ")");
        System.out.println("a | b = " + or + " (" + Integer.toBinaryString(or) + ")");
        System.out.println("a ^ b = " + xor + " (" + Integer.toBinaryString(xor) + ")");
        System.out.println("a << 1 = " + l_Sh + " (" + Integer.toBinaryString(l_Sh) + ")");
        System.out.println("a >> 1 = " + r_Sh + " (" + Integer.toBinaryString(r_Sh) + ")");
        input.close();
    }
}
