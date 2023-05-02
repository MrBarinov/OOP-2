from UserController import UserController
from User import User


class Menu:
    __play = True

    def showList(userController):
        i = 0
        for user in userController.getAllUsers():
            print(f"{i} {user}")
            i += 1
        print()

    def showMenu(self):
        userController = UserController()
        menuCase = 0
        while (self.__play):
            print("1. Добавить клиента.",
                  "2. Удалить клиента.",
                  "3. Изменить данные клиента.",
                  "4. Показать список клиентов.",
                  "5. Увеличить баланс клиента.",
                  "6. Уменьшить баланс клиента.",
                  "7. Выход.", sep='\n')
            menuCase = int(input())
            match menuCase:
                case 1:
                    name = input("Введите имя клиента: ")
                    surname = input("Введите фамилию клиента: ")
                    patronymic = input("Введите отчество клиента: ")
                    userController.saveUser(name, surname, patronymic)
                case 2:
                    Menu.showList(userController)
                    i = int(input("Выберите идентификатор для удаления: "))
                    try:
                        userController.deleteUser(
                            userController.getAllUsers()[i])
                    except:
                        print("Такого пользователя не существует!")
                    Menu.showList(userController)
                case 3:
                    Menu.showList(userController)
                    i = int(input("Выберите идентификатор для изменения: "))
                    name = input("Введите имя клиента: ")
                    surname = input("Введите фамилию клиента: ")
                    patronymic = input("Введите отчество клиента: ")
                    try:
                        balance = userController.getAllUsers()[i].getBalance()
                        updatedUser = User(name, surname, patronymic)
                        updatedUser.setBalance(balance)
                        userController.updateUser(i, updatedUser)
                    except:
                        print("Такого пользователя не существует!")
                    Menu.showList(userController)
                case 4:
                    Menu.showList(userController)
                case 5:
                    Menu.showList(userController)
                    i = int(
                        input("Выберите идентификатор для увеличения баланса: "))
                    print(
                        f"Текущий баланс клиента = {userController.getAllUsers()[i].getBalance()}")
                    try:
                        userController.addFunds(
                            i, int(input("На сколько увеличить баланс клиента: ")))
                    except:
                        print("Такого пользователя не существует!")

                    Menu.showList(userController)
                case 6:
                    Menu.showList(userController)
                    i = int(
                        input("Выберите идентификатор для уменьшения баланса: "))
                    print(
                        f"Текущий баланс клиента = {userController.getAllUsers()[i].getBalance()}")
                    try:
                        userController.removeFunds(
                            i, int(input("На сколько уменьшить баланс клиента: ")))
                    except:
                        print("Такого пользователя не существует!")
                    Menu.showList(userController)
                case 7:
                    self.__play = False
                case _:
                    System.out.println("Выбран неверный пункт меню!")
