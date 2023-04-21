public class Main {
	public static void main(String[] args) {
		HotDrink a = new HotDrink("Coffee", 350, 70);
		HotDrink b = new HotDrink("Tea", 500, 60);
		HotDrink c = new HotDrink("Black Coffee", 450, 85);

		HotDrinksTradingAutomate avto = new HotDrinksTradingAutomate();
		avto.addProduct(a);
		avto.addProduct(b);
		avto.addProduct(c);

		System.out.println(avto.getProduct("Coffee", 400, 70));
		System.out.println(avto.getProduct("Black Coffee", 450, 85));
		System.out.println(avto.getProduct("Tea", 500, 60));
	}
}
