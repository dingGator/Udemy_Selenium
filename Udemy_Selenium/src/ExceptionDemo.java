

import java.sql.SQLException;

public class ExceptionDemo {

	public static void main(String[] args) {
		Account acc = new Account();
		try {
			System.out.println("try first");
		}catch(Exception e) {
			System.out.println("Try again at some other point");
		}finally {
			System.out.println("Always executes");
		}
		
	}
}