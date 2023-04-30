
import java.util.ArrayList;
import java.util.List;

import 5lesson.HW.model.User;

public class UserRepository {
	private List<User> usersList = new ArrayList<>();

	public void saveUser(User user) {
		usersList.add(user);
	}

	public void deleteUser(User user) {
		usersList.remove(user);
	}

	public void updateUser(int index, User user) {
		usersList.set(index, user);
	}

	public List<User> getAllUsers() {
		return usersList;
	}

	public void addFunds(int index, float funds) {
		User current = getAllUsers().get(index);
		current.setBalance(current.getBalance() + funds);
		updateUser(index, current);
	}

	public void removeFunds(int index, float funds) {
		User current = getAllUsers().get(index);
		if ((current.getBalance() - funds) < 0) {
			System.out.println("Баланс не может быть отрицательным!");
		} else {
			current.setBalance(current.getBalance() - funds);
			updateUser(index, current);
		}
	}
}
