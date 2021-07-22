package leetCodeChallenge;

public class MaxSubArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
				
		int maxCurrent = nums[0];
		int maxGlobal = nums[0];
		
		for (int i =0; i< nums.length; i++) {
			
			maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
			
			if(maxCurrent> maxGlobal) {
				maxGlobal = maxCurrent;
			}
		}
		
		System.out.print(maxGlobal);

	}

}
