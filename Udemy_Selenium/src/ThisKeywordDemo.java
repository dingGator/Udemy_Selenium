
public class ThisKeywordDemo {

	public static void main(String[] args) {
		Car c1= new Car();
		Car c2 = new Car();
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		c1.setMake("Benz");
		System.out.println(c1.getMake());

	}

}
