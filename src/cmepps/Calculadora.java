package cmepps;

public class Calculadora {
	public int suma(int a, int b) {
		return a + b;
	}

	public int resta(int a, int b) {
		return a - b;
	}

	public int multiplica(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		int division = a / b;
		if (division == 0) {
			return -1;
		}
		return division;
	}
}
