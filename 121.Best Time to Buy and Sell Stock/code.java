public class Solution {
    public int maxProfit(int[] prices) {//P[i] = MAX{P[i-1], A[i] - lowest price befire i}
        if(prices.length < 2) return 0;
        int result = 0;
        int lowest = prices[0];
        int tmp_result;
        
        for(int i  = 0;i < prices.length;i++){
            
            if(lowest > prices[i]) lowest = prices[i]; 
            else {tmp_result = (prices[i] - lowest);result = result > tmp_result ? result : tmp_result;}
        }
        
        
        return result;
    }
}