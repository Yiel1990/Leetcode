public class Solution {
    public boolean canWinNim(int n) {
        
        boolean result  = false;
        if(n % 4 != 0) result = true;
        return result;
        
    }
}