//class TV {
//	private int size;
//	public TV(int size) { this.size = size; }
//	protected int getSize() { return size; }
//}
//
//public static void main(String args[]) {
//		colorTV myTV = new ColorTV(32, 1024);
//		myTV.printProperty();
//}
//��°��
// 32 ��ġ 1024 �÷�.
//TV�� ��ӹ��� ColorTV Ŭ������ �ۼ��϶�.
package day1107;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}
	class ColorTV extends TV {
		private int color;

		ColorTV(int size, int color) {
			super(size);
			this.color = color;
		}
		int getColor() {
			return color;
		}

		public void printProperty() {
			System.out.println(super.getSize() + "��ġ " + color + " �÷�");
		}
	}
