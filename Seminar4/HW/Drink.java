
public class Drink {
	protected String name;
	protected int volume;

	public Drink(String name, int volume) {
		this.name = name;
		this.volume = volume;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return this.volume;
	}

	@Override
	public String toString() {
		return String.format("name: %s, volume: %d", this.name, this.volume);
	}
}
