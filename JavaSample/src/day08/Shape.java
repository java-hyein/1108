package day08;
 
enum Gender {
	FEMALE("female"),
	MALE("male");
	
 //이름이 충돌났을때 이 함수의 value를 사용하고싶을때 사용한다.
	private String value;
	private Gender(String value) {
		this.value = value;
	}
//-------------------------------------------------
//열거형과 열거형이 아닌 타입이 변환할 필요가 있을 때 사용하는 방법
	public String value() {
		return this.value;
	}
}
enum Color{ //열거형 선언하기
	RED(0xff0000),
	GREEN(0x00ff00),
	BLUE(0x0000ff);
//--------------------------------------------------	
	private int value;
	
	private Color(int value) {
		this.value = value;
	}
	
	
	public int value() {
		return this.value;
	}
};

	abstract class Shape {
		//클래스(정적) 멤버 상수
		private static final int RED = 0;
		private static final int Green = 1;
		private static final int Blue =  2;
		
	    private int borderColor;
	    private int borderWidth;
	    private Color fillColor;
	    
	    public Shape() {
	    	this.fillColor = Color.RED;  //열거형.멤버
	    	int value = Color.RED.value(); // 정수값을 가지고 오고싶을때 사용하는 방법
	    }
	    public void draw() {
	        System.out.println("Draw shape");
	    }

	    public abstract void move(int x, int y);

	    public abstract void rotate(int radian);

	    public final int getFillColor() {
	        return fillColor;
	    }

	    public final void setFillColor(int color) {
	        this.fillColor = color;
	    }

	    public final int getBorderColor() {
	        return borderColor;
	    }

	    public final void setBorderColor(int color) {
	        this.borderColor = color;
	    }

	    // getter of borderWidth
	    public final int getBorderWidth() {
	        return borderWidth;
	    }

	    // setter of borderWidth
	    public final void setBorderWidth(int width) {
	        this.borderWidth = width;
	    }
	}
