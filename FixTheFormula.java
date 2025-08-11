package day1;

public class FixTheFormula {

	    public static int fixTheFormula(String input1) {
	        // Separate numbers and operators
	        StringBuilder numbers = new StringBuilder();
	        StringBuilder operators = new StringBuilder();

	        for (char ch : input1.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                numbers.append(ch);
	            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
	                operators.append(ch);
	            }
	        }

	        // Convert numbers to integer array
	        int[] nums = new int[numbers.length()];
	        for (int i = 0; i < numbers.length(); i++) {
	            nums[i] = numbers.charAt(i) - '0';
	        }

	        // Perform operations in the given order
	        int result = nums[0];
	        for (int i = 0; i < operators.length(); i++) {
	            char op = operators.charAt(i);
	            int nextNum = nums[i + 1];
	            switch (op) {
	                case '+': result = result + nextNum; break;
	                case '-': result = result - nextNum; break;
	                case '*': result = result * nextNum; break;
	                case '/': result = result / nextNum; break;
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        // Sample test cases
	        System.out.println(fixTheFormula("we8+you2-7to/*32"));  // Output: 2
	        System.out.println(fixTheFormula("i*+t5s-t8h1e4birds35")); // Output: 35
	        System.out.println(fixTheFormula("Fo+23the3*like2+final")); // Output: 17
	    }
	}


