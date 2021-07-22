package leetCodeChallenge;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {-2,0,-1};
		
		int maxCurrent = 1;
		int maxGlobal = nums[0];
		
		for (int i =0; i< nums.length; i++) {
			
			maxCurrent = Math.max(nums[i], maxCurrent * nums[i]);
			
			if(maxCurrent> maxGlobal) {
				maxGlobal = maxCurrent;
			}
		}
		
		System.out.print(maxGlobal);

	}

	

}
