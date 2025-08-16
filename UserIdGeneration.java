package assessment;
import java.util.*;

public class UserIdGeneration {

	    // Function to toggle case
	    public static String toggleCase(String str) {
	        StringBuilder sb = new StringBuilder();
	        for (char ch : str.toCharArray()) {
	            if (Character.isUpperCase(ch))
	                sb.append(Character.toLowerCase(ch));
	            else if (Character.isLowerCase(ch))
	                sb.append(Character.toUpperCase(ch));
	            else
	                sb.append(ch);
	        }
	        return sb.toString();
	    }

	    public static String generateUserId(String firstName, String lastName, String pin, int n) {
	        String smallerName, longerName;

	        // Step 1: Decide smaller and longer name
	        if (firstName.length() < lastName.length()) {
	            smallerName = firstName;
	            longerName = lastName;
	        } else if (lastName.length() < firstName.length()) {
	            smallerName = lastName;
	            longerName = firstName;
	        } else { // equal length
	            if (firstName.compareToIgnoreCase(lastName) < 0) {
	                smallerName = firstName;
	                longerName = lastName;
	            } else {
	                smallerName = lastName;
	                longerName = firstName;
	            }
	        }

	        // Step 2: Build user ID
	        char lastCharOfSmaller = smallerName.charAt(smallerName.length() - 1);
	        char leftDigit = pin.charAt(n - 1);               // Nth digit from left
	        char rightDigit = pin.charAt(pin.length() - n);   // Nth digit from right

	        String userId = "" + lastCharOfSmaller + longerName + leftDigit + rightDigit;

	        // Step 3: Toggle case
	        return toggleCase(userId);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Example input
	        System.out.print("Enter First Name: ");
	        String firstName = sc.nextLine();

	        System.out.print("Enter Last Name: ");
	        String lastName = sc.nextLine();

	        System.out.print("Enter PIN: ");
	        String pin = sc.nextLine();

	        System.out.print("Enter N: ");
	        int n = sc.nextInt();

	        String userId = generateUserId(firstName, lastName, pin, n);
	        System.out.println("Generated User ID: " + userId);

	        sc.close();
	    }

}
