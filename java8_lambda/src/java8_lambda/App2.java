package java8_lambda;

import java.util.Arrays;
import java.util.*;

public class App2 {

	public static void main(String[] args) {
	
		List<String> names=Arrays.asList("India","Srilanka","Indonesia","Bhutan");

		names.forEach(value->System.out.println(value));
		
		//method reference
		names.forEach(System.out::println);
	}

}
