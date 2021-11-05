package com.ss.jb.assignment4.Tests;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.ss.jb.assignment4.Line;

public class LineTests {

	Line line1 = new Line(1, 1, 2, 2);
	Line line2 = new Line(2, 2, 3, 3);
	
	public void main(String[] args) {
		System.out.println(line1.getDistance());
	}
	@Test
	public void getSlopeTest() {
		assertEquals(1d, line1.getSlope(), 0.001);
		assertNotEquals(2d, line1.getSlope(), 0.001);
	}
	
	@Test
	public void getDistanceTest() {
		assertEquals(1.414214, line1.getDistance(), 0.001);
		assertNotEquals(1, line1.getDistance(), 0.001);
	}
	
	@Test
	public void parallelToTest() {
		assertEquals(true, line1.parallelTo(line2));
	}
 }
