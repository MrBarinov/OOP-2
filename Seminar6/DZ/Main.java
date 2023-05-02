package Seminar6.DZ;

public class Main {
	public static void main(String[] args) {
		BottleOfWater bottle = new BottleOfWater(false);
		bottle.setName("Aqua");
		bottle.setPrice(100);
		bottle.setVolume(500);

		Chips chips = new Chips("Crab");
		chips.setName("Lay's");
		chips.setPrice(125);
		chips.setVolume(190);

		Coffe coffe = new Coffe(true);
		coffe.setName("Capuccino");
		coffe.setPrice(75);
		coffe.setVolume(250);

		VendingMachine<BottleOfWater> VenMachBOW = new VendingMachine<>();
		VenMachBOW.addProduct(bottle);

		VendingMachine<Chips> VenMachChips = new VendingMachine<>();
		VenMachChips.addProduct(chips);

		VendingMachine<Coffe> VenMachCoffe = new VendingMachine<>();
		VenMachCoffe.addProduct(coffe);

		System.out.println(VenMachBOW.getProducts());
		System.out.println(VenMachChips.getProducts());
		System.out.println(VenMachCoffe.getProducts());
	}
}
