package inter;

public  class MountainBike implements Bike{
	
	String name;
	int  gear;
	
	public MountainBike() {
		
	}
	
	
	public MountainBike(String name, int  gear) {
		
		this.name=name;
		this.gear=gear;
		System.out.println(BIKENAME);
		
	}
	
	
		void rideOnMountain() {
			System.out.println("ride on  Mountain"+BIKENAME);
		}


				@Override
				public void stepOnPaddle() {
				}
					
				@Override
				public void changeDirection(String direction) {
				
				}
			
				@Override
				public void speedUp() {
				}


				@Override
				public void flip() {
					// TODO Auto-generated method stub
					
				}


				@Override
				public int jump() {
					// TODO Auto-generated method stub
					return 0;
				}

				@Override
				 public  void stopTheBike() {
					 System.out.println("General the stop  in  the  main ");
				 }

				public static void main(String[] args) {
					 MountainBike m= new MountainBike();
					 m.stopTheBike();
					 m.doSuperStuff();
					
				}


				@Override
				public void doSuperStuff() {
					// TODO Auto-generated method stub
					
				}


	
}
