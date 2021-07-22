package leetCodeChallenge;

import java.util.HashMap;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {4,5,6,7,0,1,2};
		int target = 4;
		int complement;
		HashMap<Integer, Integer> hs = new HashMap();
		
		for (int i=0; i<nums.length-1; i++) {

			if(nums[i]> nums[i+1]) {
				reversed(nums, 0, i); // reverse the first half till ith position
				reversed(nums, i+1, nums.length-1); // reverse i+1 till end of arr
				reversed(nums, 0, nums.length-1); // reverse whole array
			}		
		}
		
		for(int i=0; i < nums.length; i++) {
			
			hs.put(nums[i], i);
		}
	
		if(hs.containsKey(target)) {
			System.out.println("Target element is in position "+ hs.get(target));
		
		}
		}
		

	private static void reversed(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		int temp;
		while(start<end ) {
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		
		}

	}

}
