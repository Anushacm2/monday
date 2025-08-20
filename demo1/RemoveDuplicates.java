package important;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
        String str = "programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) set.add(c);

        StringBuilder sb = new StringBuilder();
        for (char c : set) sb.append(c);
        System.out.println("After removing duplicates: " + sb);
    }

}
