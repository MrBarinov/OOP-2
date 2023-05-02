from UserService import UserService
from UserRepository import UserRepository


class UserServiceImpl(UserService):
    __userRepository = UserRepository()

    def __init__(self):
        self.__userRepository = UserRepository()

    def saveUser(self, user):
        if user is not None:
            self.__userRepository.saveUser(user)
        else:
            print("User is null")

    def deleteUser(self, user):
        if user is not None:
            self.__userRepository.deleteUser(user)
        else:
            print("User is null")

    def updateUser(self, index, user):
        if user is not None:
            self.__userRepository.updateUser(index, user)
        else:
            print("User is null")

    def getAllUsers(self):
        return self.__userRepository.getAllUsers()

    def addFunds(self, index, funds):
        self.__userRepository.addFunds(index, funds)

    def removeFunds(self, index, funds):
        self.__userRepository.removeFunds(index, funds)
