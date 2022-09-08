package week1.day2;

import java.util.Arrays;

public class FindDuplicates {
	public static void main(String[] args){
  int[] nums = {12, 25, 12, 56, 89, 25, 56};
    Arrays.sort(nums);
    for(int i=0; i<nums.length; i++) {
    	if (nums[i] == nums[i+1]) {
   System.out.println("Duplicate: "+ nums[i]);
    	}
    }
	}
}