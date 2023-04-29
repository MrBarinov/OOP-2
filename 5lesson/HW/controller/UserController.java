
import java.util.List;

import Seminar5.DZ.model.User;
import Seminar5.DZ.service.UserService;
import Seminar5.DZ.service.UserServiceImpl;

public class UserController {

	private UserService userService = new UserServiceImpl();

	public void saveUser(String name, String surname, String patronymic) {
		userService.saveUser(new User(name, surname, patronymic));
	}

	public void deleteUser(User user) {
		userService.deleteUser(user);
	}

	public void updateUser(int index, User user) {
		userService.updateUser(index, user);
	}

	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	public void addFunds(int index, float funds) {
		userService.addFunds(index, funds);
	}

	public void removeFunds(int index, float funds) {
		userService.removeFunds(index, funds);
	}
}
