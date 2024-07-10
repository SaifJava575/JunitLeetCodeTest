package com.junit.code;

public class Lt_30_MostWaterContainer {

	// T(C)=O(n) and S(C)=O(1)
	public int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;

		while (left < right) {
			int currentArea = Math.min(height[left], height[right]) * (right - left);
			maxArea = Math.max(maxArea, currentArea);

			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}

		return maxArea;
	}

	public static void main(String[] args) {
		int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		Lt_30_MostWaterContainer ans=new Lt_30_MostWaterContainer();
		int response = ans.maxArea(height);
		System.out.println("Expected Result is ::" + response);

	}

}
