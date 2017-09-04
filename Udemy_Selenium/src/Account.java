import java.sql.*;
public class Account {
	
	public Connection getConn() {
		String url ="jdbc:mysql://";
		String user ="abc";
		String password = "code";
		Connection conn = null;
		//conn = DriverManager.getConnection(url, user, password);
				return conn;
	}
	
	public void withdraw(int amount) throws SQLException {
		getConn();
		
	}

}
