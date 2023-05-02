package Seminar7.DZ.java.service;

import java.util.List;

import Seminar7.DZ.java.model.User;

public interface UserService {
	void saveUser(User user);

	void deleteUser(User user);

	void updateUser(int index, User user);

	List<User> getAllUsers();

	void addFunds(int index, float funds);

	void removeFunds(int index, float funds);
}