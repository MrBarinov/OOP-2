class User:

    __name = ""
    __surname = ""
    __patronymic = ""
    __balance = 0

    def __init__(self, name, surname, patronymic):
        self.__name = name
        self.__surname = surname
        self.__patronymic = patronymic
        self.__balance = 0

    def getName(self):
        return self.__name

    def setName(self, name):
        self.__name = name

    def __str__(self):
        return f"name: {self.__name}, surname = {self.__surname}, patronymic = {self.__patronymic}, balance = {self.__balance}"

    def getSurname(self):
        return self.__surname

    def setSurname(self, surname):
        self.__surname = surname

    def getPatronymic(self):
        return self.__patronymic

    def setPatronymic(self, patronymic):
        self.__patronymic = patronymic

    def getBalance(self):
        return self.__balance

    def setBalance(self, balance):
        self.__balance = balance
