package automobile;
//1.Number of parameter could be different
// 2. Data type of parameters are different
// 3. Sequence of data type is different
// 4. Cannot oveload just on return type
public class CarsOverloadingQuestions {

	public static void main(String[] args) {
		increaseSeatHeight("2",2);
		increaseSeatHeight("8","8");
	}
	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("I am the 1st overload");
	}
	public static void increaseSeatHeight(String variable3, String variable4) {
		System.out.println("I am the 2nd overload");
	}
	/*public static int increaseSeatHeight(String variable3, String variable4) {
		System.out.println("I am the 2nd overload");
		return 0;
	}*/

}
