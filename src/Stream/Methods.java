package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
	public static void main(String[] args)
	{
		//filter(Predicate)
		  //boolean value funcation
		List<String> names = List.of("Akash","Aniket","Ajay","Durgesh"); 
		
		List<String> newNames = names.stream().filter(e-> e.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(newNames);
		
//--------------------------------------------------------------------------------------------------------------	
		
		//map
		List<Integer> numbers = List.of(23,34,45,56,67,8,6,5);
		List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
		
		System.out.println(newNumbers);
		
//-------------------------------------------------------------------------------------------------------------
		
		numbers.stream().forEach(e-> {
			System.out.println(e);
		});
		
//--------------------------------------------------------------------------------------------------------------
		names.stream().forEach(System.out::println);
		
		
//----------------------------------------------------------------------------------------------------------------
		
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("----------------------------------------");

//----------------------------------------------------------------------------------------------------------------
		
		Integer integer = numbers.stream().min((x,y)-> x.compareTo(y)).get();
		System.out.println(integer);
	}

}
