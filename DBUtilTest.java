package in.yash.dailystatusupdateapp.test;

import java.sql.PreparedStatement;

import in.yash.dailystatusupdateapp.util.DBUtil;

public class DBUtilTest {
	public static void main(String[] args) {

		DBUtil dbUtil = new DBUtil();

		String sql = "insert into users(name, contact,loginname,password,status,role) values(?,?,?,?,?,?)";
		PreparedStatement ps = dbUtil.prepareStatement(sql);

		try {
			ps.setString(1, "pandurang");
			ps.setString(2, "8080979711");
			ps.setString(3, "pk@gmail.com");
			ps.setString(4, "pass123");
			ps.setString(5, "active");
			ps.setString(6, "trainee");
			ps.execute();
			System.out.println("User added successfullY!!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			dbUtil.closePrepareStatement();
		}

	}

}
