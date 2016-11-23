public class Solution {
    public int[] plusOne(int[] digits) {
        
        int [] tmp = new int[digits.length];
        for(int i = 0;i < digits.length;i++) tmp[i] = digits[i];
        int carry = 1;
        for(int i = digits.length - 1;i >= 0;i--){
            
            tmp[i] = (digits[i] + carry >= 10)? digits[i] + carry - 10: digits[i] + carry;
            carry = (digits[i] + carry >= 10)? 1:0;
        }
        if(carry == 0) return tmp;
        else{
            
            int [] newtmp = new int[digits.length + 1];
            newtmp[0] = carry;
            for(int i = 1;i < newtmp.length;i++) newtmp[i] = tmp[i - 1];
            return newtmp;
        }
    }
}