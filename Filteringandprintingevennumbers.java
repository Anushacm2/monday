package streamapi;
import java.util.List;
import java.util.ArrayList;



public class Filteringandprintingevennumbers {
	public static void main(String[] args) {
	List<Integer> al = new ArrayList<Integer>();

	al.add(5);

	al.add(6);

	al.add(8);

	al.stream() //source

	.filter(x -> x % 2 == 0) //intermediate operation

	.forEach(x -> System.out.print(x+" ")); 
	

}
}
