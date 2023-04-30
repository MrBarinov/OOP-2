
import java.util.Scanner;

import 5lesson.HW.controller.UserController;
import 5lesson.HW.model.User;

public class Menu {
	private static boolean play = true;
	private static String name;
	private static String surname;
	private static String patronymic;
	private static float balance;

	public static void showMenu() {
		UserController userController = new UserController();
		int menuCase = 0;
		Scanner scanner = new Scanner(System.in);
		int i;
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
					scanner.nextLine();
					name = scanner.nextLine();
					System.out.print("Введите фамилию клиента: ");
					surname = scanner.nextLine();
					System.out.print("Введите отчество клиента: ");
					patronymic = scanner.nextLine();
					userController.saveUser(name, surname, patronymic);
					break;
				case 2:
					i = 0;
					for (User user : userController.getAllUsers()) {
						System.out.println(i + " " + user);
						i++;
					}
					System.out.print("Выберите идентификатор для удаления: ");
					i = scanner.nextInt();
					try {
						userController.deleteUser(userController.getAllUsers().get(i));
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Такого пользователя не существует!");
					}
					i = 0;
					for (User user : userController.getAllUsers()) {
						System.out.println(i + " " + user);
						i++;
					}
					System.out.println();
					break;
				case 3:
					i = 0;
					for (User user : userController.getAllUsers()) {
						System.out.println(i + " " + user);
						i++;
					}
					System.out.print("Выберите идентификатор для изменения: ");
					// Scanner scanner = new Scanner(System.in);
					i = scanner.nextInt();
					System.out.print("Введите имя клиента: ");
					scanner.nextLine();
					name = scanner.nextLine();
					System.out.print("Введите фамилию клиента: ");
					surname = scanner.nextLine();
					System.out.print("Введите отчество клиента: ");
					patronymic = scanner.nextLine();
					// upd.close();
					try {
						balance = userController.getAllUsers().get(i).getBalance();
						User updatedUser = new User(name, surname, patronymic);
						updatedUser.setBalance(balance);
						userController.updateUser(i, updatedUser);
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Такого пользователя не существует!");
					}
					i = 0;
					for (User user : userController.getAllUsers()) {
						System.out.println(i + " " + user);
						i++;
					}
					System.out.println();
					break;
				case 4:
					i = 0;
					for (User user : userController.getAllUsers()) {
						System.out.println(i + " " + user);
						i++;
					}
					System.out.println();
					break;
				case 5:
					i = 0;
					for (User user : userController.getAllUsers()) {
						System.out.println(i + " " + user);
						i++;
					}
					System.out.print("Выберите идентификатор для увеличения баланса: ");
					// Scanner scanner = new Scanner(System.in);
					i = scanner.nextInt();
					System.out.println(
							"Текущий баланс клиента = " + userController.getAllUsers().get(i).getBalance());
					System.out.print("На сколько увеличить баланс клиента: ");
					try {
						userController.addFunds(i, scanner.nextInt());
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Такого пользователя не существует!");
					}

					i = 0;
					for (User user : userController.getAllUsers()) {
						System.out.println(i + " " + user);
						i++;
					}
					System.out.println();
					break;
				case 6:
					i = 0;
					for (User user : userController.getAllUsers()) {
						System.out.println(i + " " + user);
						i++;
					}
					System.out.print("Выберите идентификатор для уменьшения баланса: ");
					i = scanner.nextInt();
					System.out.println(
							"Текущий баланс клиента = " + userController.getAllUsers().get(i).getBalance());
					System.out.print("На сколько уменьшить баланс клиента: ");
					try {
						userController.removeFunds(i, scanner.nextInt());
					} catch (IndexOutOfBoundsException e) {
						System.out.println("Такого пользователя не существует!");
					}
					i = 0;
					for (User user : userController.getAllUsers()) {
						System.out.println(i + " " + user);
						i++;
					}
					System.out.println();
					break;
				case 7:
					play = false;
					scanner.close();
					break;
				default:
					System.out.println("Выбран неверный пункт меню!");
					break;
			}

		}

	}
}
