package dayfive.covariantoverriding;

public class Child extends Base{
	
	@Override
	public Child show() {
		return this;
	}

}
