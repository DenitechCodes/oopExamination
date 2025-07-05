import java.util.Scanner;

public class UgandaPearl {
    public static void main(String[] args) {
        Scanner librarianInput = new Scanner(System.in);

        //  to enter the book description
        System.out.println("Enter the book description:");
        String description = librarianInput.nextLine();

        // Convert to lowercase 
        String lowerDescription = description.toLowerCase();

        // Define the word to search for
        String targetWord = "uganda";
        int count = 0;

        // description into words
        String[] words = lowerDescription.split("\\s+");

        // number of times "uganda" appears
        for (String word : words) {
            if (word.equals(targetWord)) {
                count++;
            }
        }

        // results
        System.out.println("The word 'Uganda' appears " + count + " time(s) in the description.");
        
        librarianInput.close();
    }
}
