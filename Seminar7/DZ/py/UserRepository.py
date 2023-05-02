from User import User


class UserRepository:
    __usersList = []

    def __init__(self):
        self.__usersList = []

    def saveUser(self, user):
        self.__usersList.append(user)

    def deleteUser(self, user):
        self.__usersList.remove(user)

    def updateUser(self, index, user):
        self.__usersList.pop(index)
        self.__usersList.insert(index, user)

    def getAllUsers(self):
        return self.__usersList

    def addFunds(self, index, funds):
        current = self.getAllUsers()[index]
        current.setBalance(current.getBalance() + funds)
        self.updateUser(index, current)

    def removeFunds(self, index, funds):
        current = self.getAllUsers()[index]
        if (current.getBalance() - funds) < 0:
            print("Баланс не может быть отрицательным!")
        else:
            current.setBalance(current.getBalance() - funds)
            self.updateUser(index, current)
