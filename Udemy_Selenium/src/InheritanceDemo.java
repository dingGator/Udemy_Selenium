

import automobile.BMW;
import automobile.Cars;

public class InheritanceDemo {

	public static void main(String[] args) {
		int speed=0;
		Cars c1 = new Cars(speed);
		c1.increaseSpeed();
		c1.publicSpeed =10;
		//c1.protectedSpeed not available
		//c1.decreaseSpeed not available
		
		BMW bmw1 = new BMW(speed);
		bmw1.increaseSpeed();
		
		bmw1.headupDisplayNavigation();
		//  c1.headupDisplayNavigation(); //does not exist for c1
	}

}
