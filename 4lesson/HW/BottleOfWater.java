
public class BottleOfWater extends Product {

	private boolean gas;

	public BottleOfWater(boolean gas) {
		this.gas = gas;
	}

	@Override
	public String toString() {
		return String.format("Bottle of water gas: %s", gas ? "Yes" : "No") + super.toString();
	}
}
