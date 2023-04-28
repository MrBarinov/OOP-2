
public class Coffe extends Product {

	private boolean milk;

	public Coffe(boolean milk) {
		this.milk = milk;
	}

	@Override
	public String toString() {
		return String.format("Coffe milk: %s", milk ? "Yes" : "No") + super.toString();
	}
}
