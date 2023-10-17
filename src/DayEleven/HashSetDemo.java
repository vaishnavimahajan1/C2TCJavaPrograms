package DayEleven;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
				//Unordered, unsorted set
				HashSet<Integer> hs=new HashSet<Integer>();
				System.out.println(hs.add(10));//add here is boolean
				hs.add(20);
				hs.add(30);
				hs.add(40);
				//System.out.println(hs.add(10));
				hs.add(50);
				System.out.println(hs);
				
				hs.remove(40);
				System.out.println(hs);
				
				HashSet<Integer> hs1=new HashSet<Integer>();
				hs1.add(11);
				hs1.add(51);
				hs1.add(10);
				hs1.add(21);
				hs1.add(41);
				hs1.add(30);
				System.out.println("First Set : "+hs);
				System.out.println("First Set : "+hs1);
				
				//UNION OF TWO SETS
				hs.addAll(hs1);
				System.out.println("First Set : "+hs);
				System.out.println("First Set : "+hs1);
				
				hs.clear();
				hs.add(20);
				hs.add(30);
				hs.add(40);
				hs.add(20);
				hs.add(60);
				hs.add(10);
				System.out.println("First Set : "+hs);
				System.out.println("Second Set : "+hs1);
				
				//INTERSECTION OF TWO SETS
				hs.retainAll(hs1);
				System.out.println("First Set : "+hs);
				System.out.println("Second Set : "+hs1);
				
				//SET DIIFERENCE hs-hs1
				hs.removeAll(hs1);
				System.out.println("First Set : "+hs);
				System.out.println("Second Set : "+hs1);

	}

}
