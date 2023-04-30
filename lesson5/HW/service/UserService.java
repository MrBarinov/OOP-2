package lesson5.HW.service;

import java.util.List;

import lesson5.HW.model.User;

public interface UserService {
	void saveUser(User user);

	void deleteUser(User user);

	void updateUser(int index, User user);

	List<User> getAllUsers();

	void addFunds(int index, float funds);

	void removeFunds(int index, float funds);
}