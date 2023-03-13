package in.yash.dailystatusupdateapp.test;

import in.yash.dailystatusupdateapp.dao.UserDAO;
import in.yash.dailystatusupdateapp.daoimpl.UserDAOImpl;
import in.yash.dailystatusupdateapp.modal.User;

public class UserDAOImplSaveUserTest {
	public static void main(String[] args) {

		UserDAO userDao = new UserDAOImpl();

		User user = new User();
		
		user.setName("ramesh");
		user.setContact("8965916591");
		user.setLoginname("ramesh@com");
		user.setPassword("pass123");
		user.setRole("trainer");
		user.setStatus("active");
		userDao.save(user);
		System.out.println("User Saved Successfully!!!");

}
}