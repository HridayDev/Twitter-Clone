package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Entity.User;

public class UserDAO {

	private Connection con;

	public UserDAO(Connection conn) {
		this.con = conn;
	}

	public boolean addUser(User u) {
		boolean b = false;
		try {

			String sql = "INSERT INTO `twitter-clone`.`user` (`FullName`, `Username`, `Bio`, `ProfilePic`, `Email`) "
			+ "VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, u.getFullName());
			ps.setString(2, u.getUsername());
			ps.setString(3, u.getBio());
			ps.setString(4, u.getProfilePic());
			ps.setString(5, u.getEmail());
			
			b = ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

}
