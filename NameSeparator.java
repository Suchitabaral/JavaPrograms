import java.util.Scanner;

public class NameSeparator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their full name
        System.out.print("Enter your full name (first name, middle name(s), last name): ");
        String fullName = scanner.nextLine();

        // Split the full name into parts
        String[] nameParts = fullName.split(" ");

        // Check if the name has at least two parts (first and last name)
        if (nameParts.length >= 2) {
            String firstName = nameParts[0];
            String lastName = nameParts[nameParts.length - 1];

            // Handle middle names if there are any
            String middleName = "";
            if (nameParts.length > 2) {
                for (int i = 1; i < nameParts.length - 1; i++) {
                    middleName += nameParts[i] + " ";
                }
                middleName = middleName.trim(); // Trim to remove any trailing space
            }

            // Display the names separately
            System.out.println("First Name: " + firstName);
            System.out.println("Middle Name: " + middleName);
            System.out.println("Last Name: " + lastName);
        } else {
            System.out.println("Please enter your full name with at least a first name and a last name.");
        }

        // Close the scanner
        scanner.close();
    }
}