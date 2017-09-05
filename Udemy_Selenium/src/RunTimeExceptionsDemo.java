
public class RunTimeExceptionsDemo {

	public static void main(String[] args) {
		int a =10;
		int b =0;
		int c;
		try {
			c=a/b;
			System.out.println("the result is: " + c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Division by zero is not possible");
		}
		int[] number = {1, 2, 3};
		try {
			for(int i =0;i<=3;i++) {
				System.out.println(number[i]);
			}
		}catch(Exception e) {
			System.out.println("There is no index available after 2");
			System.out.println(e.getMessage());
			
		}
	}

}
