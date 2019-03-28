package pkgShape;

import java.util.Comparator;

public class SortByArea implements Comparator<Cuboid> {
	
	public SortByArea() {
		
	}
	
	public int compare(Cuboid cub1, Cuboid cub2) {
		return (int) (cub1.area()-cub2.area());
	}
	
}
