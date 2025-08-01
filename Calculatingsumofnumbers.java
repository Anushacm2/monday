package streamapi;
import java.util.List;

import java.util.ArrayList;



public class Calculatingsumofnumbers {
	public static void main(String[] args) {
	List<Integer> al = new ArrayList<Integer>();

	al.add(10);

	al.add(20);

	al.add(30);

	int sum = al.stream().reduce(0, Integer::sum);

	System.out.println(sum);
	


}
}
