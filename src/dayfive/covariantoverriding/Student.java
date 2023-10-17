//Program to define class with Covariant Method Overriding 
package dayfive.covariantoverriding;

public class Student implements Cloneable{
	int rollNo;
	String className;
	String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	// Class constructor
	public Student(int rollNo, String className, String name) {
		super();
		this.rollNo = rollNo;
		this.className = className;
		this.name = name;
	}
	//print method
	public void PrintData() {
		System.out.println("Name : " + name + ", RollNo: " + rollNo + ", Class Name : " + className);
	}
	
	// Override the clone method - Covariant overriding
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return (Student) super.clone();
	}
	
	
}
