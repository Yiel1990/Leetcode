public class Solution {
    public int getSum(int a, int b) {
        
        int answer = a ^ b;
        int carry  = (a & b) << 1;
        while(carry != 0){
            
            int origin_answer = answer;
            answer = origin_answer ^ carry;
            carry = (origin_answer & carry) << 1;
        }
        return answer;
    }
}