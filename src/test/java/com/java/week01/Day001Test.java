package com.java.week01;

import org.junit.jupiter.api.Test;

public class Day001Test {
	int[] items = { 10, -2, 30, 2, 7, 5, 90, 76, 100, 45, 55 };
	
	@Test
	public void testMinValue() {
		int value = Day001.getMinValue(items);
		assert(value==-2);
	}
	
	@Test
	public void testMaxValue() {
		int value = Day001.getMaxValue(items);
		assert(value==100);
	}
	
	// Write a test case, if items array is empty //
}
