package dayfive.overloading;

public class Operations {
	public static void add() {
		System.out.println("Method for Addition");
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static float add(int a, float b) {
		return a+b;
	}
	
	public static float add(float a, int b) {
		return a+b;
	}
	
	public static String add(String a,String b) {
		return a+b;
	}

}
