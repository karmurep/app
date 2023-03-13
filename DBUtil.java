package in.yash.dailystatusupdateapp.util;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	
	public class DBUtil {
		// Gather DB info:

		String url="jdbc:mysql://localhost/taskdb";
		String user="root";
		String password="root";
		// Load Driver and create connection:

		private String driverClassName = "com.mysql.cj.jdbc.Driver";
		private Connection conn = null;
		private PreparedStatement ps = null;

		private Connection connect() {
			try {
				Class c = Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, user, password);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			return conn;
		}
		// Create prepared Statement using conneection:
			public PreparedStatement prepareStatement(String sql) {
					try {
						ps=	connect().prepareStatement(sql);
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					}					
				return ps;			
			}

			// 6. close Resources:
		public void closePrepareStatement() {
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}	
		}
}
