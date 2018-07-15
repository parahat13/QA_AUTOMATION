package abstarction_project;

public class LocalStudent extends Student {

	public static void main(String[] args) {
		
		LocalStudent ls= new LocalStudent();
		ls.attendClass();

	}

	@Override
	public void attendClass() {
		System.out.println("Attending  class  locally");

	}

}
