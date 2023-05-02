package Seminar6.DZ;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T extends Product> {
	List<T> products = new ArrayList<>();

	/**
	 * 
	 * Класс позволяет выполнять только действия связанные с вендинговым аппаратом,
	 * а именно: видеть перечень товаров в аппарате и добавлять новые
	 * Реализация принципа single responsibility principle
	 * 
	 */

	public T getProduct(String name, int volume) {
		for (T prod : products) {
			if ((prod.getName() == name) && (prod.getVolume() == volume)) {
				return prod;
			}
		}
		return null;
	}

	public void addProduct(T prod) {
		products.add(prod);
	}

	public List<T> getProducts() {
		return products;
	}
}
