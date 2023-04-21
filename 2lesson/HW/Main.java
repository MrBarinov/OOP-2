
public class Main {
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		double c = 15.7;
		double d = 2.6;

		Calc calc = new Calc();
		System.out.println(calc.sum(a, b));
		System.out.println(calc.subtract(b, c));
		System.out.println(calc.mult(c, d));
		System.out.println(calc.division(d, a));
		System.out.println(calc.division(a, 0));
	}
}
