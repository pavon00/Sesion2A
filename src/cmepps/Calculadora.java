package cmepps;

public class Calculadora {
	public static int suma(int a, int b) {
		return a + b;
	}

	public static int resta(int a, int b) {
		return a - b;
	}

	public static int multiplica(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		int division = 0;
		try {
			division = a / b;
		} catch (java.lang.ArithmeticException e) {
			return -1;
		}
		if (division == 0) {
			return -1;
		}
		return division;
	}
}
