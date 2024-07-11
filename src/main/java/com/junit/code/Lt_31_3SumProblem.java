package com.junit.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lt_31_3SumProblem {

	//T(C)=O(n^2)  and S(C)=O(n)
	public List<List<Integer>> threeSum(int[] nums) {
		 List<List<Integer>> res = new ArrayList<>();
	        Arrays.sort(nums);

	        for (int i = 0; i < nums.length; i++) {
	            if (i > 0 && nums[i] == nums[i-1]) {
	                continue;
	            }
	            
	            int j = i + 1;
	            int k = nums.length - 1;

	            while (j < k) {
	                int total = nums[i] + nums[j] + nums[k];

	                if (total > 0) {
	                    k--;
	                } else if (total < 0) {
	                    j++;
	                } else {
	                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                    j++;

	                    while (nums[j] == nums[j-1] && j < k) {
	                        j++;
	                    }
	                }
	            }
	        }
	        return res;        
	}

	public static void main(String[] args) {
		int nums[] = { -1, 0, 1, 2, -1, -4 };
		Lt_31_3SumProblem ans = new Lt_31_3SumProblem();
		List<List<Integer>> response = ans.threeSum(nums);
		for (List<Integer> a : response) {
			for (Integer b : a)
				System.out.print(b + " ");
			System.out.println();
		}

	}

}
