package leetCodeChallenge;

import java.util.HashMap;
import java.util.HashSet;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {-1,0,1,3,-1,-4};
		
		int target = 0;
		
		HashSet hs = new HashSet();
		
		// brut force attack
		for (int i =0; i< nums.length; i++) {
			for (int j =i+1; j< nums.length; j++) {
				for (int k =j+1; k< nums.length; k++) {
					if(nums[i]+ nums[j]+ nums[k] == target) {
						System.out.println(nums[i] +","+nums[j]+","+ nums[k]);
					}
				}
			}
		}

		//O(n^2) using hashSet
		for (int i =0; i< nums.length-2; i++) {
			int complement = target - nums[i];
			for(int j=i+1; j< nums.length; j++) {
				if(hs.contains(complement - nums[j])) {
					System.out.println(nums[i]+","+ nums[j]+","+(complement - nums[j]));
				}
				else {
					hs.add(nums[j]);
				}
			}
			
			
		}
	}

}
