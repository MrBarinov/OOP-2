
import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T extends Product> {
	List<T> products = new ArrayList<>();

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
