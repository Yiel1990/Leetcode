public class Solution {
    public int addDigits(int num) {
        int result = 0;
        if(num == 0) return 0;
        else {result = num % 9; if(result == 0) result = 9;}
        return result;
    }
}