package pkgShape;

public class Rectangle extends Shape {

	private int Width;
	private int Height;
	
	public Rectangle(int width, int height) {
		if(width > 0 && height > 0) {
			this.Width = width;
			this.Height = height;
		}
		else throw new IllegalArgumentException("Width and Height must be positive.");
	}
		
	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	@Override
	public double area() {
		return this.Height*this.Width;
	}

	@Override
	public double perimeter() {
		return 2*this.Height+2*this.Width;
	}
	
	public int compareTo(Object object) {
		return 0;
	}
	
}
