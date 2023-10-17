package dayseven.array;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a,b;   //int a[],b;
		a=new int[5];
		b=new int[3];
		//index loop
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		
		System.out.println("------------------------------");
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+"\t");
		
		//for..each loop
		for(int ele:a)
			System.out.println(ele);
		
		char ch[]= {'a','b','c','d'};
		String[] cities= {"Mumbai", "Pune", "Delhi"};
		
		for(char c:ch)
			System.out.print(c+" ");
		
		for(String city:cities)
			System.out.print(city+"  ");
		
		for(int i=0;i<=a.length;i++)
			a[i]=i*10;
		
		for(int ele:a)
			System.out.print(ele+"\t");
		
		System.out.println("--------END OF MAIN-------");
		
		//get the array
		int intArr[]= {10,20,56,48,89};
		System.out.println(Arrays.toString(intArr)); //toString will print elements of array not there index
		
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		//binary serach
		int key=60;
		System.out.println(Arrays.binarySearch(intArr, key)); //will return index of key
		
		System.out.println(Arrays.binarySearch(intArr, 0, 3, 89));
		
		
		
		
		
	}

}
