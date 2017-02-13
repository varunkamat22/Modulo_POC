package dbconnector;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionManager {
	private static Connection _connection;

	public static Connection getConnection() {
		if (_connection != null)
			return _connection;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			_connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/modulo_poc", "root", "mysql");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("connection-->"+_connection);
		return _connection;
	}

}
