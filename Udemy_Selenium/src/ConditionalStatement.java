
public class ConditionalStatement {

	public static void main(String[] args) {
		
		boolean condition =10 ==10;
		
		System.out.println("boolean condition:  " +condition);
		
		System.out.println("*********************");
		
boolean condition1 =10 ==20;
		
		System.out.println("boolean condition:  "+condition1);
		
		System.out.println("*********************");
		
		int val1 =10;
		int val2 =10;
		
		if (val1 == val2) {
		
		System.out.println("val1== val2:  Yes, true");
		}
		
		System.out.println("*********************");
		
		val1 =10;
		val2 =20;
		
		if (val1 == val2) {
		
		System.out.println("val1== val2:  Yes, true");
		}else {
			System.out.println("val1 == val2:  No, False");
			
		}
		
		System.out.println("*********************");
		
		if (val1 < val2) {
			
			System.out.println("val1< val2:  Yes, true");
			}else {
				System.out.println("val1< val2:  No, False");
				
			}
			
			System.out.println("*********************");
		int score =91;
		String grade;
		
		if(score > 90) {
			grade ="A";
		}else if (score >80) {
			grade ="B";
		}else {
			grade ="C";
		}
		System.out.println("Score is:  " + score);
		System.out.println("Grade is:  " + grade);
		
		System.out.println("*********************");
		
		int score2 =90;
		String grade2;
		
		if(score2 > 90) {
			grade2 ="A";
		}else if (score2 >80) {
			grade2 ="B";
		}else {
			grade2 ="C";
		}
		System.out.println("Score is:  " + score2);
		System.out.println("Grade is:  " + grade2);
		
		System.out.println("*********************");
		int score3 =79;
		String grade3;
		
		if(score3 > 90) {
			grade3 ="A";
		}else if (score3 >80) {
			grade3 ="B";
		}else {
			grade3 ="C";
		}
		System.out.println("Score is:  " + score3);
		System.out.println("Grade is:  " + grade3);
		
		System.out.println("*********************");
		
		

	}

}

