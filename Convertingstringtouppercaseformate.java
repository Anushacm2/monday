package streamapi;
import java.util.List;

import java.util.ArrayList;

public class Convertingstringtouppercaseformate {
	public static void main(String[] args) {
	List<String> li = new ArrayList<String>();

	li.add("wipro");

	li.add("technologies");

	li.add("chennai");

	li.stream()

	.map(String:: toUpperCase)

	.forEach(System.out::println);

}
}
