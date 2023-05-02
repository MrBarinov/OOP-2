package Seminar6.DZ;

public class BottleOfWater extends Product {

	private boolean gas;

	/**
	 * 
	 * Реализация принципа single responsibility principle - класс позволяет задать
	 * значение поля характерного именно для этого класса при помощи конструктора
	 * 
	 */

	public BottleOfWater(boolean gas) {
		this.gas = gas;
	}

	@Override
	public String toString() {
		return String.format("Bottle of water gas: %s", gas ? "Yes" : "No") + super.toString();
	}
}
