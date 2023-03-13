package in.yash.dailystatusupdateapp.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.yash.dailystatusupdateapp.dao.UserDAO;
import in.yash.dailystatusupdateapp.modal.User;
import in.yash.dailystatusupdateapp.util.DBUtil;

public class UserDAOImpl extends DBUtil implements UserDAO {

	@Override
	public void save(User user) {
		String sql = "insert into users(name, contact,loginname,password,status,role) values(?,?,?,?,?,?)";
		PreparedStatement ps = prepareStatement(sql);
		try {
			ps.setString(1, user.getName());
			ps.setString(2, user.getContact());
			ps.setString(3, user.getLoginname());
			ps.setString(4, user.getPassword());
			ps.setString(5, user.getStatus());
			ps.setString(6, user.getRole());
			ps.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		User user = null;
		String sql = "select * from users";
		PreparedStatement pstmt = prepareStatement(sql);
		try {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				user = new User();
				user.setName(rs.getString("name"));
				user.setContact(rs.getString("contact"));
				user.setLoginname(rs.getString("loginname"));
				user.setPassword(rs.getString("password"));
				user.setStatus(rs.getString("status"));
				user.setRole(rs.getString("role"));
				user.setId(rs.getInt("id"));
				users.add(user);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return users;
	}

	@Override
	public void delete(int id) {
		String sqlDelete = "delete from users where id=?";
		PreparedStatement ps = prepareStatement(sqlDelete);
		try {
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void update(User user) {
		String sqlUpdate = "update users SET name=?, contact=? where id =?";
		PreparedStatement ps = prepareStatement(sqlUpdate);
				try {
				ps.setString(1, user.getName());
				ps.setString(2, user.getContact());
				ps.setInt(3, user.getId());
				ps.executeUpdate();
					
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

	}

}
