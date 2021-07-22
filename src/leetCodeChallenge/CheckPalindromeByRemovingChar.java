package leetCodeChallenge;
/*
 * To find a palindrome by removing any exisiting character
 */

public class CheckPalindromeByRemovingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcbaf";
		
		int index = possiblePalindromeByRemovingChar(str);
		
		if(index==-2) {
			System.out.print("Palindrome present without removing the index ");
		}else if(index==-1) {
			System.out.print("No Palindrome present");
		}else {
			System.out.print( "Possible Palindrome by removing index at "+ index);
		}

	}

	private static int possiblePalindromeByRemovingChar(String str) {
		// TODO Auto-generated method stub
		
		int low = 0, high = str.length()-1;
		
		while(low< high) {
			if(str.charAt(low)== str.charAt(high)) {
				low ++;
				high --;
			}
			else {
				//if the first element in low is not matching then increment it
				if(checkPalindrome(str, low+1, high)) {
					return low;
				}
				if(checkPalindrome(str, low, high-1)) {
					return high;
				}
				return -1;
			}
		}
		return -2;
	}

	private static boolean checkPalindrome(String str, int low, int high) {
		// TODO Auto-generated method stub
		while(low< high) {
			if(str.charAt(low)!= str.charAt(high)) 
				return false;
			low++;
			high--;
		}		
	
		return true;
	}
}
