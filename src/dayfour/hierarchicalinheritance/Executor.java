package dayfour.hierarchicalinheritance;

public class Executor {

	public static void main(String[] args) {
		Staff s=new Staff("Ray",986758737,80000); //tight coupling
		System.out.println("Staff details");
		System.out.println(s);
		
		
		//dynamic binding //runtime polymorphism //loose coupling
		Staff s1; //object reference
		s1=new Staff("shrey",986748737,980000);
		if(s1 instanceof Staff) {
		System.out.println(s1);}
		
		s1=new FullTimeStaff("Isha", 728378972, 670000,"policy based on performance");
		System.out.println(s1);
		
		s1=new Adhoc("joy", 998378972, 870000,"2 year");
		System.out.println(s1);
	}

}
