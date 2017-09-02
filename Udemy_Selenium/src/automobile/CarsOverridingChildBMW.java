package automobile;
/*****
 * Rules
 * 1. Arguments List: Arguments list in the overriding method 
 * 		should be the same as the parent class overridden method
 * 2. Access Modifier: Access modifier of the overriding method 
 * 		canNOT be MORE restrictive than the overridden method
 * 3. private, static, and final methods canNOT be overridden
 * 	 	as they are local to the class 
 */


public class CarsOverridingChildBMW  extends CarsOverridingParent{
	public static void main(String[] args) {
		CarsOverridingChildBMW c1 = new CarsOverridingChildBMW();
		System.out.println("engineStart(2): c1 step1");
		c1.engineStart(2);
		
		CarsOverridingParent c2 = new CarsOverridingParent();
		System.out.println("increaseSpeed: c2 step2 ");
		
		c2.increaseSpeed();
		System.out.println("engineStart: c2 step2 ");
		c2.engineStart(8);
		
		CarsOverridingParent c3 = new CarsOverridingChildBMW();
		System.out.println("increaseSpeed: c3 step3 ");
		
		c3.increaseSpeed();
		System.out.println("engineStart: c3 step3 ");
		c3.engineStart(9);
	}
	@Override
	public void engineStart(int cyl) {
		System.out.println("engineStart : super.engineStart(10)");
		super.engineStart(10);
		System.out.println("engineStart:  I am from the child class: " + cyl);
	}

}
