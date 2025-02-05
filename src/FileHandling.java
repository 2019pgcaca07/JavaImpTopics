import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class FileHandling {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String content = "Hello, this is a sample text written to the file!";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            writer.newLine(); // Write a newline
            writer.write("This is the second line.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }

        HashMap<String,Integer> hss = new HashMap<>();



    }
}




