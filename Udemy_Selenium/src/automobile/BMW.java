package automobile;

public class BMW extends Cars {

	public BMW(int startSpeed) {
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		//protectedSpeed is available to subclass of Cars class
		//and same package
		// can use protectedSpeed straight without reference 
		protectedSpeed++;
		
		Cars c1 = new Cars();
		c1.decreaseSpeed();
		System.out.println("Increase speed of BMW");
	}
	
	public void headupDisplayNavigation() {
		System.out.println("BMW Specific Functionality");
	}

}
