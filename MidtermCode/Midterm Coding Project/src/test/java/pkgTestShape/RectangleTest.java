package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	public void rectangleTest1() {
		try {
			Rectangle rec = new Rectangle(2,2);
		} catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}

	}
	
	@Test
	public void rectangleTest2() {
		Rectangle rec = new Rectangle(2, 2);
		assertEquals(rec.getWidth(), 2);
	}
	
	@Test
	public void rectangleTest3() {
		Rectangle rec = new Rectangle(2, 2);
		assertEquals(rec.getHeight(), 2);
	}
	
	@Test
	public void rectangleTest4() {
		Rectangle rec = new Rectangle(2, 2);
		int area = (int) rec.area();
		assertEquals(area, 4);
	}
	
	@Test
	public void rectangleTest5() {
		Rectangle rec = new Rectangle(6, 3);
		int perim = (int) rec.perimeter();
		assertEquals(perim, 18);
	}

	@Test(expected = IllegalArgumentException.class)
    public void rectangleTest6() {
        Rectangle rec = new Rectangle(-2,1);
    }
	
}
