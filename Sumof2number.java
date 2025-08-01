package pblassignments;

public class Sumof2number {
	    public static void main(String[] args) {
	        // Check if exactly two arguments are provided
	        if (args.length == 2) {
	            try {
	                // Parse the arguments as integers
	                int num1 = Integer.parseInt(args[0]);
	                int num2 = Integer.parseInt(args[1]);

	                // Calculate sum
	                int sum = num1 + num2;

	                // Print the result
	                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
	            } catch (NumberFormatException e) {
	                System.out.println("Please enter valid integers.");
	            }
	        } else {
	            System.out.println("Please provide exactly two integer arguments.");
	        }
	    }
	}



