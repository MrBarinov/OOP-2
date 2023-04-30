package lesson5.HW.view;
// package Seminar5.DZ.view;

// import java.util.Scanner;

// import Seminar5.DZ.controller.UserController;
// import Seminar5.DZ.model.User;

// public class UserView {
// 	private final static int USERS_COUNT = 10;
// 	public static void main(String[] args) {
// 		Menu.showMenu();
// 		UserController userController = new UserController();
// 		Scanner scanner = new Scanner(System.in);
// 		String userName;
// 		String userSurname;
// 		String userPatronymic;
// 		for (int i = 0; i < USERS_COUNT; i++) {
// 		System.out.println("Введите ФИО для пользователя " + i + ": ");
// 		userName = scanner.nextLine();
// 		userSurname = scanner.nextLine();
// 		userPatronymic = scanner.nextLine();
// 		userController.saveUser(userName, userSurname, userPatronymic);
// 		}

// 		int i = 0;
// 		for (User user : userController.getAllUsers()) {
// 		System.out.println(i + " " + user);
// 		i++;
// 		}
// 		System.out.println("Input id for delete: ");
// 		i = scanner.nextInt();
// 		userController.deleteUser(userController.getAllUsers().get(i));
// 		System.out.println("Input index to update: ");
// 		i = scanner.nextInt();
// 		System.out.println("Input new data for user " + i + ": ");
// 		scanner.close();
// 		scanner = new Scanner(System.in);
// 		String newName = scanner.nextLine();
// 		int newAge = scanner.nextInt();
// 		userController.updateUser(i, new User(newName, newAge));
// 		for (User user : userController.getAllUsers()) {
// 		System.out.println(i + " " + user);
// 		i++;
// 		}
// 		scanner.close();
// 	}
// }