package dayonebasic;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student();
		s.accept(1, "Vaishnavi", 95);
		s.display();
		
		Student s1=new Student();
		s.accept(2, "Sneha", 85);
		s.display();
		
		Student s2=new Student();
		s.accept(3, "Neha", 80);
		s.display();

	}

}
