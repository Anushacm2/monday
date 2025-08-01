package pblassignments;

public class Twostrings {
	    public static void main(String[] args) {
	        // Check if exactly two command-line arguments are provided
	        if (args.length == 2) {
	            String company = args[0];
	            String location = args[1];

	            // Output format: <Company> Technologies <Location>
	            System.out.println(company + " Technologies " + location);
	        } else {
	            // Show error message if the number of arguments is not 2
	            System.out.println("Error: Please provide exactly two command-line arguments.");
	            System.out.println("Example: java CompanyLocation Wipro Bangalore");
	        }
	    }
	}



