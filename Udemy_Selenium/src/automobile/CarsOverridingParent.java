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
public class CarsOverridingParent {
	
	public void engineStart(int cyl) {
		System.out.println("engineStart:  I am from the parent class: "+ cyl);

	}
	public void increaseSpeed() {
		System.out.println("increaseSpeed:  I am the increase speed from the parent class: ");
	}
	public static void staticExample() {
		System.out.println("I am the static method from the parent class");
	}

}
