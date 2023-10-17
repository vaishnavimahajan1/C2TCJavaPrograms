package dayfive.covariantoverriding;

public class Executor {

	public static void main(String[] args) {
		Base b1=new Base();
		System.out.println(b1.show());
		
		Child c1=new Child();
		System.out.println(c1.show());
		
		System.out.println("-----------------------");
		Base b;
		b=b1;
		System.out.println(b.show());
		
		b=c1;
		System.out.println(b.show());
		
		System.out.println(c1.show());
		Child cc=c1;
		System.out.println(cc.show());
		
	}

}
