package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	private static String link;
	private static String user;
	private static String pass;
	private static Connection conn;
	private static String DbName = "twitter-clone";

	static {
		Connect.link = "jdbc:mysql://localhost:3306/" + DbName;
		Connect.user = "root";
		Connect.pass = "root";
	}

	public static Connection getConn() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connect.conn = DriverManager.getConnection(Connect.link, Connect.user, Connect.pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Connect.conn;
	}
}
