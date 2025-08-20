package important;

public class VowelConsonantCount {
	 public static void main(String[] args) {
	        String str = "Programming";
	        str = str.toLowerCase();
	        int vowels = 0, consonants = 0;

	        for (char c : str.toCharArray()) {
	            if ("aeiou".indexOf(c) != -1) vowels++;
	            else if (c >= 'a' && c <= 'z') consonants++;
	        }

	        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
	    }

}
