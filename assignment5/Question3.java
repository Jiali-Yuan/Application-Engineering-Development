/*Giving an array nums, write a function to move all 0's to 
the end of it while maintaining the relative order of the 
non-zero elements
For example:[0,1,0,3,12] return:[1,3,12,0,0]*/

import java.util.Arrays;
class Question3 {
	public static void main(String[] args) {
		int[] test = {0, 1, 0, 3, 12};
		System.out.println(Arrays.toString(move0ToEnd(test)));
	}
	
	public static int[] move0ToEnd(int[] nums) {
		int a = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[a] = nums[i];
				a++;
			}
		}
		for (int i = a; i < nums.length; i++) {
			nums[i] = 0;
		}
		return nums;	
	}
}