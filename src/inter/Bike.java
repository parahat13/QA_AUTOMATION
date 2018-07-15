package inter;

public interface Bike extends SuperBike, Motorcycle {
	
	public static final String BIKENAME="Bike";
	
	public  abstract void stepOnPaddle();
	public  abstract void changeDirection(String direction);
	public  abstract void speedUp();
	
	public  default void startTheBike() {
		System.out.println("This is  default");
	}
	
	// create   a  default  method called stop the  bike
	
	 
	 public  default void stopTheBike() {
		 System.out.println("Stop the  Bike");
	 }
	 // redeclaring  from  superBike
	// void doSuperStuff();
	 
	 default void doSuperStuff() {
			System.out.println("Do super stuff in Bike interface");
		}
		

}
