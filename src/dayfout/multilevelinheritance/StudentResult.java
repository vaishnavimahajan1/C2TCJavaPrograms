package dayfout.multilevelinheritance;

public class StudentResult extends StudentAssesment {

	public StudentResult() {
		System.out.println("StudentResult class default constructor");
		
	}
	
	public void calculateScore() {
		super.score=0.5f*(getsPrint1()+getsPrint2())/2+0.1f*getsQuizzes()+0.2f*gettQuizzes()+0.2f*getFinalTest();
	}

	@Override
	public String toString() {
		return "StudentResult [toString()=" + super.toString() + "]";
	}


	
	
	

}
