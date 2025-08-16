package assessment;
import java.util.*;


public class StableUnstablePassword {
	
	
	    
	    public static boolean isStable(int num) {
	        String str = String.valueOf(num);
	        Map<Character, Integer> freqMap = new HashMap<>();
	        
	        // Count frequency of each digit
	        for (char ch : str.toCharArray()) {
	            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
	        }
	        
	        // Get all frequencies
	        Set<Integer> freqSet = new HashSet<>(freqMap.values());
	        
	        // Stable if all frequencies are same (set size = 1)
	        return freqSet.size() == 1;
	    }

	    // Function to calculate password
	    public static int findPassword(int[] inputs) {
	        int sum = 0;
	        for (int num : inputs) {
	            if (isStable(num)) {
	                sum += num;
	            }
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        // Example input
	        int[] inputs = {12, 1313, 122, 678, 898};
	        
	        int password = findPassword(inputs);
	        System.out.println("Password = " + password);
	    }
	

}
