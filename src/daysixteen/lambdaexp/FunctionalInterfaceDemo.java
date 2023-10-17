package daysixteen.lambdaexp;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		// Inbuilt functional interfaces
		// consumer
		// predicate
		// supplier
		// function
		//consumer interface accepts value but does not return any value 
		Consumer<Integer> c=(n)-> System.out.println(n);
		c.accept(10);
		
		Consumer<String> c1=(str)-> System.out.println("Welcome" +str);
		c1.accept("Bachho");
		
		Supplier<String> s1=()->"Hii";
		System.out.println(s1.get());
		
		Supplier<Integer> s2=()->10;
		System.out.println(s2.get());
		
		//predicate always returns boolean value
		Predicate<Integer> p1=(n)->n%2==0?true:false;
		System.out.println(p1.test(10));
		System.out.println(p1.test(5));
		
		Predicate<Integer> p2=(n)->n>=0?true:false;
		System.out.println(p2.test(-12));
		System.out.println(p2.test(2));
		
		//function
		// when you want to supply single parameter and return single value
		Function<String, Integer> f1=(name)->name.length();
		System.out.println(f1.apply("vaishnavi"));
		
		//multiple parameter
		BiFunction<Integer, Integer, Integer> f2=(n1,n2)->n1>n2?n1:n2;
		System.out.println(f2.apply(10, 60));

	}

}
