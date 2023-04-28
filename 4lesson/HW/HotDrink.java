public class HotDrink extends Drink {
	private int temperature;

	public HotDrink(String name, int volume, int temperature) {
		super(name, volume);
		this.temperature = temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature() {
		return this.temperature;
	}

	@Override
	public String toString() {
		return super.toString() + ", temp: " + this.temperature;
	}
}
