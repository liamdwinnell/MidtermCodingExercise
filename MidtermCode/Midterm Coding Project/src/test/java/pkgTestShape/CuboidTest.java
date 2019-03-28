package pkgTestShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;
import pkgShape.SortByArea;
import pkgShape.SortByVolume;

public class CuboidTest {

	@Test
	public void cuboidTest1() {
		try {
			Cuboid cuboid = new Cuboid(2,2,2);
		} catch(Exception e) {
			fail("Test failed to build a Cuboid.");
		}
	}
	
	@Test
	public void cuboidTest2() {
		Cuboid cuboid = new Cuboid(3,1,2);
		assertEquals(cuboid.getDepth(),2);
	}
	
	@Test
	public void cuboidTest3() {
		Cuboid cuboid = new Cuboid(3,1,2);
		cuboid.setDepth(15);
		assertEquals(cuboid.getDepth(),15);
	}
	
	@Test
	public void cuboidTest4() {
		Cuboid cuboid = new Cuboid(4,4,4);
		assertEquals((int) cuboid.area(), 96);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void cuboidTest5() {
		Cuboid cuboid = new Cuboid(3,1,2);
		cuboid.perimeter();
	}

	@Test(expected = IllegalArgumentException.class)
    public void cuboidTest6() {
        Cuboid cuboid = new Cuboid(1,1,-2);
    }
	
	@Test
	public void cuboidTest7() {
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		
		ar.add(new Cuboid(2,2,2));
		ar.add(new Cuboid(1,1,1));
		ar.add(new Cuboid(5,5,5));
		
		Collections.sort(ar, new SortByArea());
		assertEquals((int) ar.get(0).area(), 6);
		
	}
	
	@Test
	public void cuboidTest8() {
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		
		ar.add(new Cuboid(2,2,2));
		ar.add(new Cuboid(1,1,1));
		ar.add(new Cuboid(5,5,5));
		
		Collections.sort(ar, new SortByArea());
		assertEquals((int) ar.get(1).area(), 24);
		
	}
	
	@Test
	public void cuboidTest9() {
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		
		ar.add(new Cuboid(2,2,2));
		ar.add(new Cuboid(1,1,1));
		ar.add(new Cuboid(5,5,5));
		
		Collections.sort(ar, new SortByArea());
		assertEquals((int) ar.get(2).area(), 150);
		
	}
	
	@Test
	public void cuboidTest10() {
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		
		ar.add(new Cuboid(2,2,2));
		ar.add(new Cuboid(1,1,1));
		ar.add(new Cuboid(3,3,3));
		
		Collections.sort(ar, new SortByVolume());
		assertEquals((int) ar.get(0).volume(), 1);
		
	}
	
	@Test
	public void cuboidTest11() {
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		
		ar.add(new Cuboid(2,2,2));
		ar.add(new Cuboid(1,1,1));
		ar.add(new Cuboid(3,3,3));
		
		Collections.sort(ar, new SortByVolume());
		assertEquals((int) ar.get(1).volume(), 8);
		
	}
	
	@Test
	public void cuboidTest12() {
		ArrayList<Cuboid> ar = new ArrayList<Cuboid>();
		
		ar.add(new Cuboid(2,2,2));
		ar.add(new Cuboid(1,1,1));
		ar.add(new Cuboid(3,3,3));
		
		Collections.sort(ar, new SortByVolume());
		assertEquals((int) ar.get(2).volume(), 27);
		
	}
	
}
