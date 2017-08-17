
public class ConditionalStatement {

	public static void main(String[] args) {
		
		boolean condition =10 ==10;
		
		System.out.println(condition);
		
		System.out.println("*********************");
		
		int val1 =10;
		int val2 =10;
		
		if (val1 == val2) {
		
		System.out.println("Yes, true");
		}
		
		System.out.println("*********************");
		
		val1 =10;
		val2 =20;
		
		if (val1 == val2) {
		
		System.out.println("Yes, true");
		}else {
			System.out.println("No, False");
			
		}
		
		System.out.println("*********************");
		
		if (val1 < val2) {
			
			System.out.println("Yes, true");
			}else {
				System.out.println("No, False");
				
			}
			
			System.out.println("*********************");
		int score =91;
		String grade;
		
		if(score>90) {
			grade ="A";
		}else if (score >80) {
			grade ="B";
		}else {
			grade ="C";
		}
		System.out.println("Score is:  " + score);
		System.out.println("Grade is:  " + grade);
		

	}

}

