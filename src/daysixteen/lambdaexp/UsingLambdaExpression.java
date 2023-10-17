package daysixteen.lambdaexp;

public class UsingLambdaExpression {

	public static void main(String[] args) {
		Statement st=()->"Hello. how are you!";
		System.out.println(st.show());
		
		//returns boolean value
		INumber num=(no)->no%2!=0?true:false;
		System.out.println(num.isOdd(50));
		System.out.println(num.isOdd(55));
	}

}
