package inter;

public interface SuperBike {
	
	
	public abstract void flip();
	
	public abstract int jump();
	
	default void doSuperStuff() {
		System.out.println("Do super stuff");
	}
	
	

}
