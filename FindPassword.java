package day1;
import java.util.*;


public class FindPassword {
	

	

	    // Function to check if a number is stable
	    public static boolean isStable(int num) {
	        String numStr = String.valueOf(num);
	        Map<Character, Integer> freqMap = new HashMap<>();

	        // Count frequency of each digit
	        for (char digit : numStr.toCharArray()) {
	            freqMap.put(digit, freqMap.getOrDefault(digit, 0) + 1);
	        }

	        // Get all frequencies
	        Collection<Integer> frequencies = freqMap.values();
	        int firstFreq = frequencies.iterator().next();

	        // Check if all frequencies are the same
	        for (int f : frequencies) {
	            if (f != firstFreq) {
	                return false; // Not stable
	            }
	        }
	        return true; // Stable
	    }

	    // Function to find password
	    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
	        int[] nums = {input1, input2, input3, input4, input5};
	        int stableCount = 0, unstableCount = 0;

	        for (int num : nums) {
	            if (isStable(num)) {
	                stableCount++;
	            } else {
	                unstableCount++;
	            }
	        }

	        // Formula: (Unstable * 10) + Stable
	        return (unstableCount * 10) + stableCount;
	    }

	    // Main function to test
	    public static void main(String[] args) {
	        // Example from the question
	        int password = findPassword(12, 1313, 122, 678, 898);
	        System.out.println(password); // Expected output: 23
	    }
	}