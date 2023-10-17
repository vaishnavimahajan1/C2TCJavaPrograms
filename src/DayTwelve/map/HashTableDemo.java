package DayTwelve.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		//Unordered, unsorted 
		Hashtable<Integer, Float> ht=new Hashtable<Integer, Float>();
		ht.put(1,  67.70f);
		ht.put(5,  77.00f);
		ht.put(9,  82.20f);
		ht.put(1,  91.50f);
		ht.put(19,  81.50f);
		ht.put(2,  62f);
		ht.put(13,  78f);
		
		//throws NullPointerException
		/*
		ht.put(3,  null); ht.put(null, 45f);
		*/
		System.out.println(ht);
		System.out.println("Percentage are as follows");
		Enumeration<Float> e=ht.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		Set<Integer> k=ht.keySet();
		System.out.println(k);
		
		System.out.println(ht.get(19));
		ht.replace(19, 80f);
		System.out.println(ht.get(19));
		
		Set<Entry<Integer, Float>> ss=ht.entrySet();
		Iterator<Entry<Integer, Float>> it=ss.iterator();
		
		
		

	}


}
