package abstarction_project;

public class OnlineStudent extends Student {
	
	
	public static void main(String[] args) {
		OnlineStudent on= new OnlineStudent();
		on.attendClass();
	}

	@Override
	public void attendClass() {
		
		System.out.println("Attending  class  online");
		
	}

}
