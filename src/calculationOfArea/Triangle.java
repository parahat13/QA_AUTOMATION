package calculationOfArea;

public class Triangle extends Shape {

	double leng1;
	double leng2;
	double leng3;

	public Triangle() {
		super("Triangle");
	}

	public Triangle(double leng1, double leng2, double leng3) {
		this();
		this.leng1 = leng1;
		this.leng2 = leng2;
		this.leng3 = leng3;
	}

	@Override
	public double calculateArea() {

		return 0;
	}

	@Override
	public void draw() {

	}

			@Override //// this  is  coming  from  SuperShape class
			public void superDraw() {
		
			}

	public static void main(String[] args) {

		Triangle t = new Triangle();
		t.draw();
		double result = t.calculateArea();
		System.out.println("The Triangle");

	}

}
