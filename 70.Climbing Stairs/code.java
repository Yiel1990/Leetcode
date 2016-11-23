public class Solution {
    /*public int climbStairs(int n) {
        
        int result ;
        if(n == 0) return 1;
        if(n == 1) return 1;
        result = climbStairs(n - 1) + climbStairs(n - 2);
        return result;
        
    }*/
    public int climbStairs(int n) {
        
       // d[n] = d[n-1] + d[n-2]
        int [] result = new int[n + 1];
        
        for(int i = 0;i <= n;i++){
            
            if(i == 0 || i == 1) result[i] = 1;
                
            else result[i] = result[i - 1] + result[i - 2];

            
        }
        
        return result[n];
        
    }
}