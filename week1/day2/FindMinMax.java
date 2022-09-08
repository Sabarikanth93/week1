package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {

		int[] nums = {22, 3981, -19, 82, 0, 45, 37};

		Arrays.sort(nums);

		System.out.println(nums[0]+" Min");

		System.out.println(nums[nums.length-1]+" Max");
	}
}
