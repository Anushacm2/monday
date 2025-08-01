package streamapi;
import java.util.List;

import java.util.ArrayList;

public class Maximumnumberfromlist {
	public static void main(String[] args) {
	List<Integer> al = new ArrayList<Integer>();

	al.add(23);

	al.add(34);

	al.add(67);

	int m = al.stream().max((x, y) -> x > y ? 1 : -1).get();

	System.out.println(m);
	

}
}
