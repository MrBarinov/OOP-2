
import java.util.List;

import Seminar5.DZ.model.User;
import Seminar5.DZ.repository.UserRepository;

public class UserServiceImpl implements UserService {

	private UserRepository userRepository = new UserRepository();

	@Override
	public void saveUser(User user) {
		if (user != null) {
			userRepository.saveUser(user);
		} else {
			System.out.println("User is null");
		}
	}

	@Override
	public void deleteUser(User user) {
		if (user != null) {
			userRepository.deleteUser(user);
		} else {
			System.out.println("User is null");
		}
	}

	@Override
	public void updateUser(int index, User user) {
		if (user != null) {
			userRepository.updateUser(index, user);
		} else {
			System.out.println("User is null");
		}
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}

	@Override
	public void addFunds(int index, float funds) {
		userRepository.addFunds(index, funds);
	}

	@Override
	public void removeFunds(int index, float funds) {
		userRepository.removeFunds(index, funds);
	}

}
