import java.util.ArrayList;
import java.util.List;

public class HotDrinksTradingAutomate implements TradingAutomate {
	List<HotDrink> hotDrinks = new ArrayList<>();

	@Override
	public Drink getProduct(String name, int volume) {
		for (Drink drink : drinks) {
			if ((drink.getName() == name) && (drink.getVolume() == volume)) {
				return drink;
			}
		}
		return null;
	}

	public HotDrink getProduct(String name, int volume, int temperature) {
		for (HotDrink drink : hotDrinks) {
			if ((drink.getName() == name) && (drink.getVolume() == volume) && (drink.getTemperature() == temperature)) {
				return drink;
			}
		}
		return null;
	}

	public void addProduct(HotDrink drink) {
		hotDrinks.add(drink);
	}
}
