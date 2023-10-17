//Program to demonstrate stream basic operations
package dayseventeen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		//creating stream from set of values (source)
		Stream<Integer> stream=Stream.of(2,3,4,5,6,7,-5,3,8);
		//to count
		System.out.println("Total Values"+stream.count());
		
		//fetch only positive values
		Stream<Integer> positiveValueStream = stream.filter((no)->no>=0);
		
		//fetch only positive values using predicate object
		 //Predicate<Integer> p2=(n)->n>=0?true:false;
		 //positiveValueStream =stream.filter(p);
		
		//fetch all values and display it
		
		positiveValueStream.forEach(System.out::println);//method reference
		
		//source-array
		Stream[] strArray= {"Amol", "neha", "sneha"};
		Stream<String> stream1=Arrays.stream(strArray);
		
		//mapping each element
		Stream<String> strStream=stream1.map((str)->str.toUpperCase);
		
		//fetch all values and display it
		strStream.forEach(System.out::println);
		
		//function to pass string and return its length
		Function<String,Integer> f=(str)->str.toString().length();
		stream1=Arrays.stream(strArray);
		
		//map each value to its length
		positiveValueStream=stream1.map(f);
		positiveValueStream.forEach(System.out::println);
		
		//source - list
		List<String> cityList;
		/* cityList=new ArrayList<String>();
		cityList.add("Nashik");
		cityList.add("Bangalore");
		cityList.add("pune");
		cityList.add("mumbai");
		*/
		
		String cityArray[]= {"Nashik", "Pune", "Nashik", "Delhi"};
		cityList=Arrays.asList(cityArray);
		System.out.println(cityList);
		System.out.println("-----------------------");
		
		strStream=cityList.stream();
		//Limit - fetch topmost values
		strStream=strStream.limit(3);
		strStream.forEach(System.out::println);
		System.out.println("-----------------------");
		
		//skip -skip no. 
		strStream=cityList.stream();
		strStream=strStream.skip(2);
		strStream.forEach(System.out::println);
		System.out.println("-----------------------");
		
		//distinct - omit duplicate values
		strStream=cityList.stream();
		strStream=strStream.distinct();
		strStream.forEach(System.out::println);
		System.out.println("-----------------------");
		
		
		//source
		for(String s: strArray)
			System.out.println(s+"\t");
		

	}

}
