public class Solution {
   
    /*
    public int countPrimes(int n) {
        int result = 0;
        for(int i = 2;i < n;i++) result += whetherPrimes(i);
        return result;
    }
    public int whetherPrimes(int n){
        
        int result = 1;
        //int threshold = (int)Math.sqrt(n); 
        
        if(n % 2 == 1){
            for(int i = 2;i * i <= n;i++){
                
                if((n % i) == 0){result = 0;break;}
                
            }
        }else{result = (n==2 ? 1:0);}
        return result;
    }*/
    public int countPrimes(int n) {
    
        boolean[] isprime = new boolean[n];
        int result = 0;
        for(int i = 2;i < n;i++){
            
            isprime[i] = true;
            
        }
        for(int i = 2; i * i < n;i++){
            
            if(isprime[i]) for(int j = i * i;j < n;j += i) isprime[j] = false;
            
            
        }
        for(int i = 2;i < n;i++) if(isprime[i]) result++;
        return result;
    }
}