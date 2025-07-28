package day3;

public class Calculator {


	    // Static method for int power calculation
	    public static int powerInt(int num1, int num2) {
	        return (int) Math.pow(num1, num2);
	    }

	    // Static method for double power calculation
	    public static double powerDouble(double num1, int num2) {
	        return Math.pow(num1, num2);
	    }

	    public static void main(String[] args) {
	        // Test powerInt
	        int result1 = Calculator.powerInt(2, 3); // 2^3 = 8
	        System.out.println("2^3 (int) = " + result1);

	        // Test powerDouble
	        double result2 = Calculator.powerDouble(2.5, 3); // 2.5^3 = 15.625
	        System.out.println("2.5^3 (double) = " + result2);
	    }
	}

