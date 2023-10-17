package DayTwelve.map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		//key - emailid , value - Employee details
		//unordered, unsorted dictionary
		//allows null key as well as value
		//allows unique keys
		
		HashMap<String, Employee> hs=new HashMap<String, Employee>();
		hs.put("ands@nakjs.org", new Employee(101,"xyz","IT",68000));
		hs.put("nty@gamil.org", new Employee(105,"abc","IT",67800));
		hs.put("bryt@gamil.org", new Employee(109,"okk","HR",78000));
		hs.put("ookk@nakjs.org", new Employee(102,"noway","sales",80000));
		hs.put(null, null);
		System.out.println(hs);

	}

}
