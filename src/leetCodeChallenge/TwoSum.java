package leetCodeChallenge;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {2,7,11,8};
		int target = 9;
		int complement;
		
		HashMap<Integer, Integer> hm = new HashMap();
		
		for(int i=0; i < num.length; i++) {
			complement = target - num[i];
			
			if(hm.containsKey(complement)) {
				System.out.println(i+","+hm.get(complement)) ;
			}
			else {
			hm.put(num[i], i);
			}
		}
		
	}

}
