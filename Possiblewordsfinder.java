package assessment;

public class Possiblewordsfinder {
	

	    public static String identifyPossibleWords(String input1, String input2) {
	        input1 = input1.toLowerCase();
	        String[] wordList = input2.split(":");
	        StringBuilder result = new StringBuilder();

	        for (String word : wordList) {
	            String lowerWord = word.trim().toLowerCase();

	            // Check length match
	            if (lowerWord.length() != input1.length()) {
	                continue;
	            }

	            boolean match = true;
	            for (int i = 0; i < input1.length(); i++) {
	                if (input1.charAt(i) != '_' && input1.charAt(i) != lowerWord.charAt(i)) {
	                    match = false;
	                    break;
	                }
	            }

	            if (match) {
	                if (result.length() > 0) {
	                    result.append(":");
	                }
	                result.append(word.trim().toUpperCase());
	            }
	        }

	        return result.length() > 0 ? result.toString() : "ERROR-009";
	    }

	    public static void main(String[] args) {
	        String input1 = "Fi_er";
	        String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
	        String output = identifyPossibleWords(input1, input2);
	        System.out.println(output);
	    }
	}
	


