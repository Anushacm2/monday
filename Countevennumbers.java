package streamapi;
import java.util.List;

import java.util.ArrayList;


public class Countevennumbers {
	public static void main(String[] args) {
	List<Integer> al = new ArrayList<Integer>();

	al.add(2);

	al.add(9);

	al.add(4);

	long c=al.stream().filter(x -> x % 2 == 0).count();

	System.out.println(c);

}
}
