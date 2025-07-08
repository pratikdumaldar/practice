package test;

import java.util.Arrays;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 1, 3, 4 };
		int target = 3;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

}
