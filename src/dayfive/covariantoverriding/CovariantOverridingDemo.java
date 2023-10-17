package dayfive.covariantoverriding;

public class CovariantOverridingDemo {

	public static void main(String[] args) throws CloneNotSupportedException{
		// new student object created
		Student student1 = new Student(1, "MCA", "Kapil");
		student1.PrintData();
		// Student object created using clone method
		// assuming type casting is required
		Student student2=(Student) student1.clone();
		student2.PrintData();
		
		Student s=student1;
		s.PrintData();
		System.out.println(s);
		System.out.println(student1);
	}

}
