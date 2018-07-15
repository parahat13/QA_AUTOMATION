package calculationOfArea;

public class Circle extends Shape{
	
	
	double radius;

	
    public Circle() {
		super("Circle");
	}
    public Circle(double radius) {
      this();
	  this.radius=radius;
	}

	@Override
	public double calculateArea() {
		double result=3.14*radius*radius;
		return result;
	}

	@Override
	public void draw() {
	 System.out.println("Drawing  "+name+" Circle with  radius "+radius);	
	}
	
	
	
	
	public static void main(String[] args) {
		// when  I  creare  objrct   I  want  circle  have 
		// have  name  of  circle and radius
		Circle c = new Circle(5.6);
		c.draw();
		double result=c.calculateArea();
		System.out.println("The  Triangle  area: "+result);
		
	}
					@Override
					public void superDraw() {
						System.out.println("lkjfsdklfjad");
						
					}
	
	
										
	
}
