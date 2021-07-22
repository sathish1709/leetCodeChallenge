package leetCodeChallenge;

import java.util.HashSet;

public class ContainsDuplicateInArray {
	
	public static boolean containsDuplicate(int[] nums) {
	        HashSet hs = new HashSet();
	        
	        for(int i =0; i< nums.length; i++){
	            if(hs.contains(nums[i]))
	                return true;
	            hs.add(nums[i]);
	        }
	        return false;
	    }
	    
	    public static void main(String args[]){
	        int[] nums = {1,2,3};
	        boolean flag = containsDuplicate(nums);
	        System.out.println (flag);
	    }
	}

