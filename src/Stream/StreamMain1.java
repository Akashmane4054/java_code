package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);
		
		Stream<Integer> stream = list3.stream();

		List<Integer> newList = list3.stream().filter(i -> i > 100).collect(Collectors.toList());

		System.out.println(newList);
	}

}
