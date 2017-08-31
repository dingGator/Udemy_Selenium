package automobile;

public class InterfaceDemo implements CarInterface, BMWCarsInterface {

	@Override
	public void engineStart(String engineType, boolean isKeyLess) {
		System.out.println("This is implementation");}
		@Override
		public void headsUpNavigation() {
			System.out.println("This is the headup navigation");}
		
		
	}
	


