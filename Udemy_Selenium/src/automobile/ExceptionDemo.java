package automobile;

import java.sql.SQLException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Account acc =new Account();
	//acc.withdraw(100);
	try {
		acc.withdraw(100);
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}

}
