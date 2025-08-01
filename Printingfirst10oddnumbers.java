package streamapi;
import java.util.stream.Stream;
public class Printingfirst10oddnumbers {
	public static void main(String[] args)

	{

	Stream.iterate(1, n-> n + 1).filter(n -> n%2 != 0).limit(10).forEach(System.out::println);

	

}
}