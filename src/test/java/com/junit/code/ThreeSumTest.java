package com.junit.code;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ThreeSumTest {

    @Test
    public void testThreeSum() {
    	Lt_31_3SumProblem solution = new Lt_31_3SumProblem();

        // Test case 1: Empty array
        int[] nums1 = {};
        List<List<Integer>> result1 = solution.threeSum(nums1);
        assertTrue(result1.isEmpty());

        // Test case 2: Array with no valid three sum
        int[] nums2 = {1, 2, -2, -1};
        List<List<Integer>> result2 = solution.threeSum(nums2);
        assertTrue(result2.isEmpty());

        // Test case 3: Array with one valid three sum
        int[] nums3 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected3 = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result3 = solution.threeSum(nums3);
        assertEquals(expected3.size(), result3.size());
        for (List<Integer> list : expected3) {
            assertTrue(result3.contains(list));
        }

        // Test case 4: Array with multiple valid three sums
        int[] nums4 = {0, 0, 0, 0};
        List<List<Integer>> expected4 = Arrays.asList(
                Arrays.asList(0, 0, 0)
        );
        List<List<Integer>> result4 = solution.threeSum(nums4);
        assertEquals(expected4.size(), result4.size());
        for (List<Integer> list : expected4) {
            assertTrue(result4.contains(list));
        }

        // Test case 5: Larger array
        int[] nums5 = {-4, -1, -1, 0, 1, 2};
        List<List<Integer>> expected5 = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result5 = solution.threeSum(nums5);
        assertEquals(expected5.size(), result5.size());
        for (List<Integer> list : expected5) {
            assertTrue(result5.contains(list));
        }
    }
}
