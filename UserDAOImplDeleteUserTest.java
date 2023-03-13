package in.yash.dailystatusupdateapp.test;

import in.yash.dailystatusupdateapp.dao.UserDAO;
import in.yash.dailystatusupdateapp.daoimpl.UserDAOImpl;

public class UserDAOImplDeleteUserTest {
	public static void main(String[] args) {

		UserDAO userDao = new UserDAOImpl();

		userDao.delete(3);
		
		System.out.println("User deleted Successfully!!!");

	}
}
