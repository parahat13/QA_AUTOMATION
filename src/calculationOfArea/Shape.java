package calculationOfArea;

public abstract class Shape extends SuperShape {

	String name;
	double area;
	
	
	public Shape() {
		
	}


	public Shape(String name) {
		this.name = name;
	}

	public abstract double calculateArea();
	public abstract void draw();


	
	
	//optional
	public  void superDraw() {
		System.out.println("Super Drawing");
	}

}
