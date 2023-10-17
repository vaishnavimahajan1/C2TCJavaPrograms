package dayfout.multilevelinheritance;

public class Executor {

	public static void main(String[] args) {
		StudentResult r=new StudentResult();
		r.setuId(101);
		r.setName("Reha");
		r.setContactNo(985368268);
		r.setStream("Co");
		r.setsPrint1(70);
		r.setsPrint2(90);
		r.setsQuizzes(85);
		r.settQuizzes(86);
		r.setFinalTest(98);
		r.calculateScore();
		System.out.println(r);
	}

}
