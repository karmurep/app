package in.yash.dailystatusupdateapp.test;

import java.util.List;

import in.yash.dailystatusupdateapp.dao.UserDAO;
import in.yash.dailystatusupdateapp.daoimpl.UserDAOImpl;
import in.yash.dailystatusupdateapp.modal.User;

public class UserDAOImplFindAllUserTest {

	public static void main(String[] args) {

		UserDAO userDao = new UserDAOImpl();


		List<User> users = userDao.findAll();
		
		for (User user: users) {
			System.out.println(user);
		}

	}
}
