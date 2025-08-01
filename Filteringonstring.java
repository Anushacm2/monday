package streamapi;
import java.util.List;
import java.util.ArrayList;

import java.util.stream.Collectors;

public class Filteringonstring {
	public static void main(String[] args) {
	List<String> al = new ArrayList<String>();
    al.add("admin");
    al.add("user");
    al.add("customer");

	List<String> li=al.stream().filter(s -> s.contains("e")).collect(Collectors.toList());
    System.out.println(li);

}
}
