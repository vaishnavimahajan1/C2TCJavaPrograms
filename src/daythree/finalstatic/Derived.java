package daythree.finalstatic;

public class Derived extends Base{
	@Override
	public void greet() {
		System.out.println("Good Morning\tHow you doin");
	}
	

	//final method can't be override
	
	/*
	@Override
	public final void show()
	{
		System.out.println("C2TC JFS Training");
	}*/

}
