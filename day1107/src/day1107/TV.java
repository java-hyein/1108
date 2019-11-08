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
//출력결과
// 32 인치 1024 컬러.
//TV를 상속받은 ColorTV 클래스를 작성하라.
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
			System.out.println(super.getSize() + "인치 " + color + " 컬러");
		}
	}
