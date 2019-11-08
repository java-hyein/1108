package day08;
 
enum Gender {
	FEMALE("female"),
	MALE("male");
	
 //�̸��� �浹������ �� �Լ��� value�� ����ϰ������ ����Ѵ�.
	private String value;
	private Gender(String value) {
		this.value = value;
	}
//-------------------------------------------------
//�������� �������� �ƴ� Ÿ���� ��ȯ�� �ʿ䰡 ���� �� ����ϴ� ���
	public String value() {
		return this.value;
	}
}
enum Color{ //������ �����ϱ�
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
		//Ŭ����(����) ��� ���
		private static final int RED = 0;
		private static final int Green = 1;
		private static final int Blue =  2;
		
	    private int borderColor;
	    private int borderWidth;
	    private Color fillColor;
	    
	    public Shape() {
	    	this.fillColor = Color.RED;  //������.���
	    	int value = Color.RED.value(); // �������� ������ ��������� ����ϴ� ���
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
