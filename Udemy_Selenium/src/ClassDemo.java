
public class ClassDemo {
	
	String str2= "Hi There";
	/*cannot have here  :
	 *   System.out.println
		*/
	public static void main(String[] args) {
		String str1 =     "Hello Java";
		System.out.println(str1);
		// now to bring in input from the command line
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		System.out.println("*******************");
		CarClass c1= new CarClass();
		CarClass c2 = new CarClass();
		c1.model = "BMN";
		c1.year = 2015;
		
		System.out.println(c1.year);
		System.out.println(c1.getYear());

	}

}

class CarClass{
	int year =2000;
	String model;
	public int getYear() {
		return this.year;
	}
	
}
