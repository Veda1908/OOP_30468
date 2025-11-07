package fileIO;
import java.io.*;
public class LibrarySystem {
    public static void main(String[] args) {
        String inputFile = "books.txt";
        String outputFile = "available_books.txt";
        int count = 0;

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", 2);
                if (parts.length == 2 && parts[0].startsWith("B1")) {
                    writer.write(line + System.lineSeparator());
                    count++;
                }
            }
            System.out.println("Number of books processed: " + count);
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }
}