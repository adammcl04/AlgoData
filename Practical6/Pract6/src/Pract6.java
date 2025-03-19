import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Pract6 {

    public static void main(String[] args) {
        // Path to the input file
        String filePath = "src/alice30.txt"; // Replace with your file path

        // TreeMap to store word frequencies (automatically sorts by key)
        Map<String, Integer> frequencies = new TreeMap<>();

        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Read the file word by word
            while (scanner.hasNext()) {
                String word = scanner.next();

                // Remove non-letter characters from the word
                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                // Skip empty strings (in case the word was all non-letters)
                if (word.isEmpty()) {
                    continue;
                }

                // Update the frequency map
                if (frequencies.containsKey(word)) {
                    frequencies.put(word, frequencies.get(word) + 1);
                } else {
                    frequencies.put(word, 1);
                }
            }

            // Print the word frequencies in alphabetical order
            for (Map.Entry<String, Integer> entry : frequencies.entrySet()) {
                System.out.println("•"+entry.getKey() + " " + entry.getValue());
            }

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        }
    }
}

