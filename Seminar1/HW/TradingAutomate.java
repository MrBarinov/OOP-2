import java.util.ArrayList;
import java.util.List;

public interface TradingAutomate {
	List<Drink> drinks = new ArrayList<>();

	Drink getProduct(String name, int volume);
}
