package dayfour.hierarchicalinheritance;

public class Adhoc extends Staff{
	private String contract_Period;

	public String getContract_Period() {
		return contract_Period;
	}

	public void setContract_Period(String contract_Period) {
		this.contract_Period = contract_Period;
	}
	

	public Adhoc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adhoc(String name, long contactNo, float salary, String contract_Period) {
		super(name, contactNo, salary);
		this.contract_Period = contract_Period;
	}

	@Override
	public String toString() {
		return "Adhoc [contract_Period=" + contract_Period + ", toString()=" + super.toString() + "]";
	}
	

}
