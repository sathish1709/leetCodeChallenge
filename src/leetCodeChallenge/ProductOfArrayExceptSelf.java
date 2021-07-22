package leetCodeChallenge;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4};
		int product = 1;
		int[] arr = new int[nums.length];
		
		for(int i=0; i< nums.length; i++) {
			product *= nums[i];
		}
		
		for (int j=0;j<nums.length; j++) {
			arr[j] = product/nums[j];
		}
	
		System.out.print(arr.length);
	}
}
