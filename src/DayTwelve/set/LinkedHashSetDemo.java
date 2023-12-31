package DayTwelve.set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Spliterator;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//ordered, unordered set
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(60);
		lhs.add(30);
		lhs.add(90);
		lhs.add(20);
		
		System.out.println(lhs);
		Spliterator<Integer> sp=lhs.spliterator(); //splits one by one
		while(sp.tryAdvance((no)->System.out.println(no*no)));
		System.out.println("-----------------------------------");
		String str[]={"Hello", "How are you?"};
		Spliterator<String> s = Arrays.spliterator(str);
		while(s.tryAdvance( (ss)->System.out.println(ss.toUpperCase())));
		
		

	}

}
