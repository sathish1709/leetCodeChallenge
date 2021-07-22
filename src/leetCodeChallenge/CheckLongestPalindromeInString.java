package leetCodeChallenge;
/*
 * To find the longest palindrome in a given string
 */
public class CheckLongestPalindromeInString {

	static int startPosition ;
	static int endLength ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcvcbafd";
		
		if(str.length()<2)
			System.out.print(str);

		for(int start = 0; start <str.length()-1; start++) {
			// when the given string length is odd
			checkLongestPanlindrome(str, start, start);
			//when the given string length is even
			checkLongestPanlindrome(str, start, start+1);
			
		}
		
		System.out.print(str.substring(startPosition, startPosition+endLength));
		
	}

	private static void checkLongestPanlindrome(String str, int begin, int end) {
		// TODO Auto-generated method stub
		while(begin>=0 && end < str.length() && str.charAt(begin)== str.charAt(end)) {
			begin --;
			end++;
		}
		
		// if the existing substring is lesser than new substring found with end and begin
		if(endLength < end-begin-1) {
			startPosition = begin + 1;
			endLength = end-begin-1;
	
		}
	}

}
