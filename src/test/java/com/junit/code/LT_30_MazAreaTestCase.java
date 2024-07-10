package com.junit.code;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LT_30_MazAreaTestCase {

	Lt_30_MostWaterContainer res = new Lt_30_MostWaterContainer();

	@Test
	public void testMaxArea() {
		assertEquals(49, res.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
		assertEquals(1, res.maxArea(new int[] { 1, 1 }));
		assertEquals(16, res.maxArea(new int[] { 4, 3, 2, 1, 4 }));
		assertEquals(2, res.maxArea(new int[] { 1, 2, 1 }));
		assertEquals(0, res.maxArea(new int[] { 1 }));
		assertEquals(0, res.maxArea(new int[] {}));
	}

}
