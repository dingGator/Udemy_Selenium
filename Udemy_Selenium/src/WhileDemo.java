
public class WhileDemo {

	public static void main(String[] args) {
	int i =5;
	boolean condition = 10<20;
	while(i < 20) {
		System.out.println("Value of i before :  " +i);
		i++;
		
		if(i== 18) {
			System.out.println("break..."+i );

			break;
		}
		
		if(i== 12) {
			System.out.println("Value of i i==12 before continue:  " +i);
					
			continue;
		}
		System.out.println("Value of i after:  " +i);
	
	}
	System.out.println("Outside Loop...");
	
	do {
		System.out.println("in doWhile Loop...");
		i++;
	}while(i<20);
	

	}

}
