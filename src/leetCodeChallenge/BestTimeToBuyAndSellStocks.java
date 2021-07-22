package leetCodeChallenge;

public class BestTimeToBuyAndSellStocks {
	
	public static void main(String[] args) {
		int[] prices = new int[] {7,1,5,3,6,4};
		
		int minValue = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int i =0; i<prices.length; i++) {
			if(prices[i]<minValue) {
				minValue = prices[i];
			}else if(prices[i]-minValue > maxProfit) {
				maxProfit= prices[i] -minValue;
			}
				
		}
		System.out.print("Maximum Profit is "+maxProfit);
		
	}

}
