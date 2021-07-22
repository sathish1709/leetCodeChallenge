package leetCodeChallenge;

public class RotateArrayToFindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {4,5,6,7,0,1,2};
		
		for (int i=0; i<nums.length-1; i++) {

			if(nums[i]> nums[i+1]) {
				reversed(nums, 0, i); // reverse the first half till ith position
				reversed(nums, i+1, nums.length-1); // reverse i+1 till end of arr
				reversed(nums, 0, nums.length-1); // reverse whole array
			}
			
					
		}
		
		for(int i=0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("Minimum value in an array is "+ nums[0]);
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
