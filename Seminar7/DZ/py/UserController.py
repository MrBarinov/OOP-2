from UserServiceImpl import UserServiceImpl
from User import User


class UserController:

    __userService = UserServiceImpl()

    def __init__(self):
        self.__userService = UserServiceImpl()

    def saveUser(self, name, surname, patronymic):
        self.__userService.saveUser(User(name, surname, patronymic))

    def deleteUser(self, user):
        if isinstance(user, User):
            self.__userService.deleteUser(user)

    def updateUser(self, index, user):
        if isinstance(user, User):
            self.__userService.updateUser(index, user)

    def getAllUsers(self):
        return self.__userService.getAllUsers()

    def addFunds(self, index, funds):
        self.__userService.addFunds(index, funds)

    def removeFunds(self, index, funds):
        self.__userService.removeFunds(index, funds)
