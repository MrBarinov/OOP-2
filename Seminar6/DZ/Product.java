package Seminar6.DZ;

public abstract class Product {

	/**
	 * 
	 * Класс сделан абстрактным для реализации принципа dependency inversion
	 * principle и отсутствия возможно создавать товары неопределнного класса
	 * (Product)
	 * 
	 * Также, для реализации принципа single responsibility principle, класс
	 * позаоляет только задавать и получать значения полей товара
	 * 
	 */

	private float price;
	private String name;
	private float volume;

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format(", name: %s, price: %s, volume: %s", name, price, volume);
	}
}
