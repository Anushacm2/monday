package pblassignments;

public class Welcomemessage {
	    public static void main(String[] args) {
	        // Check if exactly one argument is passed
	        if (args.length == 1) {
	            System.out.println("Welcome " + args[0]);
	        } else {
	            System.out.println("Please provide exactly one argument.");
	        }
	    }
	}



