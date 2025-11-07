 package java_Generics;

 import java.util.*;

 class Product {
     String name;
     double price;
     double rating;

     Product(String name, double price, double rating) {
         this.name = name;
         this.price = price;
         this.rating = rating;
     }

     public String toString() {
         return name + " - ₹" + price + " - Rating: " + rating;
     }
 }

 public class Ecom_System {
     public static void main(String[] args) {
         List<Product> products = new ArrayList<>();
         products.add(new Product("Shoes", 2500, 4.5));
         products.add(new Product("Bag", 1500, 4.7));

         Collections.sort(products, (p1, p2) -> {
             int ratingCompare = Double.compare(p2.rating, p1.rating);
             return (ratingCompare != 0) ? ratingCompare : Double.compare(p1.price, p2.price);
         });

         System.out.println("🛒 Sorted Products:");
         products.forEach(System.out::println);
     }
 }