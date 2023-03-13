package in.yash.dailystatusupdateapp.serviceimpl;

import java.util.List;

import in.yash.dailystatusupdateapp.dao.UserDAO;
import in.yash.dailystatusupdateapp.daoimpl.UserDAOImpl;
import in.yash.dailystatusupdateapp.modal.User;
import in.yash.dailystatusupdateapp.service.UserService;

public class UserServiceImpl implements UserService {

	UserDAO userDao;

	public UserServiceImpl() {
		userDao = new UserDAOImpl();
	}
		
	@Override
	public void addUser(User user) {
		userDao.save(user);

	}

	@Override
	public List<User> showUser() {
		
		return userDao.findAll();
	}

	@Override
	public void deleteUser(int id) {
		userDao.delete(id);

	}

	@Override
	public void editUser(User user) {
		userDao.update(user);

	}

}
