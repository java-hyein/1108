
interface IArea {
	double area();
}

class rectangle implements IArea {
	double a, b;

	rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double area() {
		return a * b;
	}
}

class triangle implements IArea {
	double a, b;

	triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double area() {
		return a * b / 2.0;
	}
}
