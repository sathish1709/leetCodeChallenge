package leetCodeChallenge;

public class ReverseStringAndInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Reverse a String
		String str = "Hello";
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.print("Reversed String "+ sb);
		System.out.print("\n");
		
		//Reverse an integer
		int input = 54321;
		int reversed = 0;
				
		while(input != 0) {
			reversed = reversed * 10 + (input % 10);
			input = input/10;
		}
		System.out.print("Reversed Number is "+ reversed);
	}

}
