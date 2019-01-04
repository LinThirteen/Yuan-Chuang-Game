package Server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataConnect {

	private static Statement stat;
	private static void init() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/game"
				,"root","123456");
		stat = con.createStatement();
		
	}
	public static Statement getStatement() throws ClassNotFoundException, SQLException{
		if(stat==null)
			init();
		return stat;
	}
}
