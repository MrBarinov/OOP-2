
public class Chips extends Product {

	private String taste;

	public Chips(String taste) {
		this.taste = taste;
	}

	@Override
	public String toString() {
		return String.format("Chips taste: %s", taste) + super.toString();
	}
}
