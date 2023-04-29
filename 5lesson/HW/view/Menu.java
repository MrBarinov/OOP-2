
import java.util.Scanner;

import Seminar5.DZ.controller.UserController;
import Seminar5.DZ.model.User;

public class Menu {
	private static boolean play = true;
	private static String name;
	private static String surname;
	private static String patronymic;
	private static float balance;
	private static int index;

	public static void showMenu() {
		UserController userController = new UserController();
		int menuCase = 0;
		Scanner scanner = new Scanner(System.in);
		while (play) {
			System.out.println("1. Добавить клиента.\n" +
					"2. Удалить клиента.\n" +
					"3. Изменить данные клиента.\n" +
					"4. Показать список клиентов.\n" +
					"5. Увеличить баланс клиента.\n" +
					"6. Уменьшить баланс клиента.\n" +
					"7. Выход.");
			menuCase = scanner.nextInt();
			switch (menuCase) {
				case 1:
					System.out.print("Введите имя клиента: ");
					Scanner add = new Scanner(System.in);
					name = add.nextLine();
					System.out.print("Введите фамилию клиента: ");
					surname = add.nextLine();
					System.out.print("Введите отчество клиента: ");
					patronymic = add.nextLine();
					add.close();
					userController.saveUser(name, surname, patronymic);
					break;
				case 2:
					for (User user : userController.getAllUsers()) {
						System.out.println(user);
					}
					System.out.print("Выберите идентификатор для удаления: ");
					Scanner del = new Scanner(System.in);
					userController.deleteUser(userController.getAllUsers().get(del.nextInt()));
					for (User user : userController.getAllUsers()) {
						System.out.println(user);
					}
					System.out.println();
					break;
				case 3:
					for (User user : userController.getAllUsers()) {
						System.out.println(user);
					}
					System.out.print("Выберите идентификатор для изменения: ");
					Scanner upd = new Scanner(System.in);
					index = upd.nextInt();
					System.out.print("Введите имя клиента: ");
					name = upd.nextLine();
					System.out.print("Введите фамилию клиента: ");
					surname = upd.nextLine();
					System.out.print("Введите отчество клиента: ");
					patronymic = upd.nextLine();
					upd.close();
					balance = userController.getAllUsers().get(index).getBalance();
					User updatedUser = new User(name, surname, patronymic);
					updatedUser.setBalance(balance);
					userController.updateUser(index, updatedUser);
					for (User user : userController.getAllUsers()) {
						System.out.println(user);
					}
					System.out.println();
					break;
				case 4:
					for (User user : userController.getAllUsers()) {
						System.out.println(user);
					}
					System.out.println();
					break;
				case 5:
					for (User user : userController.getAllUsers()) {
						System.out.println(user);
					}
					System.out.print("Выберите идентификатор для увеличения баланса: ");
					Scanner addFunds = new Scanner(System.in);
					index = addFunds.nextInt();
					System.out.println(
							"Текущий баланс клиента = " + userController.getAllUsers().get(index).getBalance());
					System.out.print("На сколько увеличить баланс клиента: ");
					userController.addFunds(index, addFunds.nextInt());
					for (User user : userController.getAllUsers()) {
						System.out.println(user);
					}
					System.out.println();
					break;
				case 6:
					for (User user : userController.getAllUsers()) {
						System.out.println(user);
					}
					System.out.print("Выберите идентификатор для уменьшения баланса: ");
					Scanner removeFunds = new Scanner(System.in);
					index = removeFunds.nextInt();
					System.out.println(
							"Текущий баланс клиента = " + userController.getAllUsers().get(index).getBalance());
					System.out.print("На сколько уменьшить баланс клиента: ");
					userController.addFunds(index, removeFunds.nextInt());
					for (User user : userController.getAllUsers()) {
						System.out.println(user);
					}
					System.out.println();
					break;
				case 7:
					play = false;
					// scanner.close();
					break;
				default:
					System.out.println("Выбран неверный пункт меню!");
					break;
			}

		}

	}
}
