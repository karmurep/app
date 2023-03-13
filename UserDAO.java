package in.yash.dailystatusupdateapp.dao;

import java.util.List;

import in.yash.dailystatusupdateapp.modal.User;

public interface UserDAO {
	
	void save(User user);

	List<User> findAll();
	
	void delete(int id);
	
	void update(User user);
	
}
