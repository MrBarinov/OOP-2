package Seminar7.DZ.java.model;

public class User {

	private String name;
	private String surname;
	private String patronymic;
	private float balance;

	public User(String name, String surname, String patronymic) {
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.balance = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User {" +
				"name = \'" + name + '\'' +
				", surname = \'" + surname + '\'' +
				", patronymic = \'" + patronymic + '\'' +
				", balance = \'" + balance + '\'' +
				'}';
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
}
