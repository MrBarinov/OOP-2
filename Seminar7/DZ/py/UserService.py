from abc import ABC, abstractmethod


class UserService:
    @abstractmethod
    def saveUser(self, user):
        pass

    @abstractmethod
    def deleteUser(self, user):
        pass

    @abstractmethod
    def updateUser(self, index, user):
        pass

    @abstractmethod
    def getAllUsers(self):
        pass

    @abstractmethod
    def addFunds(self, index, funds):
        pass

    @abstractmethod
    def removeFunds(self, index, funds):
        pass
