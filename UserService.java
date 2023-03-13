package in.yash.dailystatusupdateapp.service;

import java.util.List;

import in.yash.dailystatusupdateapp.modal.User;

public interface UserService {

	void addUser(User user);
	
	List<User> showUser();
	
	void deleteUser(int id);
	
	void editUser(User user);
}
