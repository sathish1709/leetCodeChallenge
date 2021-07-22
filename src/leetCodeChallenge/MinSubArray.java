package leetCodeChallenge;

public class MinSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {2,3,1,2,4,3};
		int target = 7;
		
		int result = Integer.MAX_VALUE;
		int left = 0;
		int value_sum = 0;
		
		for(int i=0; i < nums.length; i++) {
			
			value_sum += nums[i];
			
			while(value_sum >= target) {
				result = Math.min(result, i+1-left);// (Max, 4) => 4
				value_sum -= nums[left]; // decrease the first element value since we need to drop the element
				left ++;
			}
			
		}
		
		System.out.print("Minimal length subarray is " +(result != Integer.MAX_VALUE ? result : 0));

	}

}
