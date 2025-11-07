import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SplitTextFile {
    public static void main(String[] args) {
        // Path to your text file
        String filePath = "C:\\Users\\isaac\\OneDrive\\Documents\\int x = 1;.txt";

        try {
            // Read the entire file content as a single string
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Split at each semicolon
            String[] entries = content.split(";");

            // Create a 2D array to hold words for each entry
            String[][] allWords = new String[entries.length][];

            // Split each entry into words by whitespace
            for (int i = 0; i < entries.length; i++) {
                // Trim to remove leading/trailing spaces or newlines
                allWords[i] = entries[i].trim().split("\\s+");
            }

            // Print results
            for (int i = 0; i < allWords.length; i++) {
                System.out.println("Entry " + (i + 1) + ":");
                for (String word : allWords[i]) {
                    System.out.println("  " + word);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
