package pmaven.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banks", "root", "");
		String s="select * from banks.details;";
		PreparedStatement ps=c.prepareStatement(s);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int empid=rs.getInt("id");
			String name=rs.getString("name");
			System.out.println(empid);
			System.out.println(name);
		}
		

	}

}
