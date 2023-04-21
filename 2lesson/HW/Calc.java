
public class Calc extends Actions implements Cast {
	public Double sum(Double a, Double b) {
		return a + b;
	}

	public Double sum(Double a, Integer b) {
		return this.sum(a, this.intToDouble(b));
	}

	public Double sum(Integer a, Double b) {
		return this.sum(this.intToDouble(a), b);
	}

	public Long sum(Integer a, Integer b) {
		Double s = this.sum(this.intToDouble(a), this.intToDouble(b));
		Long zero = (long) 0;
		if (this.isInteger(s)) {
			return this.doubleToInt(s);
		}
		return zero;
	}

	public Double subtract(Double a, Double b) {
		return a - b;
	}

	public Double subtract(Double a, Integer b) {
		return subtract(a, this.intToDouble(b));
	}

	public Double subtract(Integer a, Double b) {
		return subtract(this.intToDouble(a), b);
	}

	public Long subtract(Integer a, Integer b) {
		Double s = this.subtract(this.intToDouble(a), this.intToDouble(b));
		Long zero = (long) 0;
		if (this.isInteger(s)) {
			return this.doubleToInt(s);
		}
		return zero;
	}

	public Double mult(Double a, Double b) {
		return a * b;
	}

	public Double mult(Double a, Integer b) {
		return mult(a, this.intToDouble(b));
	}

	public Double mult(Integer a, Double b) {
		return mult(this.intToDouble(a), b);
	}

	public Long mult(Integer a, Integer b) {
		Double m = this.mult(this.intToDouble(a), this.intToDouble(b));
		Long zero = (long) 0;
		if (this.isInteger(m)) {
			return this.doubleToInt(m);
		}
		return zero;
	}

	public Double division(Double a, Double b) {
		if (b == 0) {
			System.out.println("Деление на 0 невозможно");
			return 0.;
		}
		return a / b;
	}

	public Double division(Double a, Integer b) {
		return division(a, this.intToDouble(b));
	}

	public Double division(Integer a, Double b) {
		return division(this.intToDouble(a), b);
	}

	public Double division(Integer a, Integer b) {
		return this.division(this.intToDouble(a), this.intToDouble(b));
	}

	@Override
	public Double intToDouble(Integer a) {
		return Double.valueOf(a);
	}

	@Override
	public Long doubleToInt(Double a) {
		return Math.round(a);
		// return Integer.valueOf(b);
	}

	public boolean isInteger(Double a) {
		String b = String.valueOf(a);
		if (b.charAt(b.length() - 1) == '0') {
			return true;
		}
		return false;
	}
}
