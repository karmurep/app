package in.yash.dailystatusupdateapp.test;

import in.yash.dailystatusupdateapp.dao.UserDAO;
import in.yash.dailystatusupdateapp.daoimpl.UserDAOImpl;
import in.yash.dailystatusupdateapp.modal.User;

public class UserDAOImplUpdateUserTest {

	public static void main(String[] args) {

		UserDAO userDao = new UserDAOImpl();

		User user = new User();
		user.setId(2);
		user.setName("sanket jagtap");
		user.setContact("9158681932");
		userDao.update(user);
	
		System.out.println("User updated Successfully!!!");

	}
}
