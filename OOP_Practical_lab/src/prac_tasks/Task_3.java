package prac_tasks;
import java.util.*;
import java.util.Arrays;
public class Task_3 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s1 = "Hello";
      String s2 = "Hello";              
      String s3 = new String("Hello");  
      System.out.println("Comparing Strings:");
      System.out.println("s1 == s2: " + (s1 == s2));        
      System.out.println("s1 == s3: " + (s1 == s3));            
      System.out.println("s1.equals(s3): " + s1.equals(s3));     
      String original = "Java";
      String modified = original.concat(" Programs");
      System.out.println("\nString Immutability:");
      System.out.println("Original String is: " + original);         
      System.out.println("Modified String is: " + modified);        
      System.out.print("\nEnter no of strings: ");
      int n = sc.nextInt();
      sc.nextLine(); 
      String[] words = new String[n];
      System.out.println("Enter " + n + " strings:");
      for (int i = 0; i < n; i++) {
          words[i] = sc.nextLine();
      }
      System.out.println("\nOriginal array:");
      for (String word : words) {
          System.out.print(word + " ");
      }
      Arrays.sort(words);
      System.out.println("\nSorted array:");
      for (String word : words) {
          System.out.print(word + " ");
      }
      System.out.println("\nReversed array:");
      for (int i = words.length - 1; i >= 0; i--) {
          System.out.print(words[i] + " ");
      }
      StringBuilder sb = new StringBuilder();
      for (String word : words) {
          sb.append(word).append(" ");
      }
      System.out.println("\nConcatenated String: " + sb.toString().trim());
      sc.close();
  }
}