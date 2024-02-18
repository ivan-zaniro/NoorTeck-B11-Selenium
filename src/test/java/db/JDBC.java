package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String query = "SELECT * FROM hr.employees WHERE job_id = 'it_prog';";
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "123456";

		// 1 pom.xml

		// 2 upd scriptr
		Class.forName("com.mysql.cj.jdbc.Driver");

		// 3 connection
		Connection con = DriverManager.getConnection(url, username, password);

		Statement stm = con.createStatement();

		// 5
		ResultSet rs = stm.executeQuery(query);

		while (rs.next()) {
			System.out.println(rs.getString("employee_id"));
			System.out.println(rs.getString("first_Name"));
			System.out.println(rs.getString("last_Name"));
			System.out.println(rs.getString("job_id"));
			System.out.println(rs.getString("salary"));
			System.out.println("*******");

		}

		con.close();
		rs.close();
	}
}