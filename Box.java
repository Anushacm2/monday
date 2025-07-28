package day3;

public class Box {
 
	    // Dimensions of the box
	    double width;
	    double height;
	    double depth;

	    // Parameterized constructor
	    Box(double w, double h, double d) {
	        width = w;
	        height = h;
	        depth = d;
	    }

	    // Method to calculate volume
	    double getVolume() {
	        return width * height * depth;
	    }

	    public static void main(String[] args) {
	        // Create object of Box class with given dimensions
	        Box myBox = new Box(5.0, 10, 3.0);

	        // Call getVolume and display result
	        double volume = myBox.getVolume();
	        System.out.println("Volume of the box = " + volume);
	    }
	}


