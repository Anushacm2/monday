package day1;
import java.util.*;


public class JumbleWords {
	    
	    public static String jumbleWord(String word, int method) {
	        StringBuilder result = new StringBuilder();
	        
	        // Step 1: pick every odd letter starting from first letter (index 0)
	        for (int i = 0; i < word.length(); i += 2) {
	            result.append(word.charAt(i));
	        }
	        
	        if (method == 1) {
	            // Method 1: second part from right to left, picking even letters from end
	            for (int i = word.length() - 1; i >= 0; i--) {
	                if ((word.length() - 1 - i) % 2 == 0) { 
	                    // pick alternate letters starting from last
	                    if (i % 2 != 0) {
	                        result.append(word.charAt(i));
	                    }
	                }
	            }
	        } 
	        else if (method == 2) {
	            // Method 2: second part from left to right, picking even letters starting from index 1
	            for (int i = 1; i < word.length(); i += 2) {
	                result.append(word.charAt(i));
	            }
	        }
	        
	        return result.toString();
	    }
	    
	    public static String jumbleSentence(String sentence, int method) {
	        String[] words = sentence.split(" ");
	        StringBuilder jumbledSentence = new StringBuilder();
	        
	        for (String word : words) {
	            jumbledSentence.append(jumbleWord(word, method)).append(" ");
	        }
	        
	        return jumbledSentence.toString().trim();
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter the sentence:");
	        String sentence = sc.nextLine();
	        
	        System.out.println("Enter method type (1 or 2):");
	        int method = sc.nextInt();
	        
	        String result = jumbleSentence(sentence, method);
	        System.out.println("Jumbled Sentence: " + result);
	    }
	}


