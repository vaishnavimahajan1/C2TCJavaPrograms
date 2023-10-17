package dayfour.hierarchicalinheritance;

public class FullTimeStaff extends Staff {
	private String incrementPolicy;

	public String getIncrementPolicy() {
		return incrementPolicy;
	}

	public void setIncrementPolicy(String incrementPolicy) {
		this.incrementPolicy = incrementPolicy;
	}
	

	public FullTimeStaff() {
		super();
		System.out.println("FullTimeStaff class default constructor");
	}
	

	public FullTimeStaff(String name, long contactNo, float salary, String incrementPolicy) {
		super(name, contactNo, salary);
		this.incrementPolicy = incrementPolicy;
	}

	@Override
	public String toString() {
		return "FullTimeStaff [incrementPolicy=" + incrementPolicy + ", toString()=" + super.toString() + "]";
	}

	

	
	
	
}
