package pkgShape;

public class Cuboid extends Rectangle {
	private int Depth;

	public Cuboid(int width, int height, int depth) {
		super(width, height);
		if(depth > 0) this.Depth = depth;
		else throw new IllegalArgumentException("Depth must be positive.");
		
	}

	public int getDepth() {
		return Depth;
	}

	public void setDepth(int depth) {
		Depth = depth;
	}
	
	public double volume() {
		return this.getWidth()*this.getHeight()*this.Depth;
	}
	
	public double area() {
		return 2*(this.getWidth()*this.getHeight())+
				2*(this.getWidth()*Depth)+
				2*(this.getHeight()*Depth);
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException("Perimeter method not applicable here.");
	}
	
}
