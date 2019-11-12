package day1111;

public class Calc {
	int a, b;

	public Calc() {
		this.a = a;
		this.b = b;
	}

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

//----------------------------------------------------------
	static class Add extends Calc {

		public Add() {
			super();
		}

		int calculate() {
			return a + b;
		}
	}

	static class Sub extends Calc {
		public Sub() {
			super();
		}

		int calculate() {
			return a - b;
		}
	}

	static class Mul extends Calc {
		public Mul() {
			super();
		}

		int calculate() {
			return a * b;
		}
	}

	static class Div extends Calc {
		public Div() {
			super();
		}

		int calculate() {
			return a / b;
		}
	}

}
