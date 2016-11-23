public class Solution {
    public String largestNumber(int[] nums) {
        String result = "";
        int tmp = 0;
        for(int i = 0;i < nums.length - 1;i++){
            
            for(int j = 0;j < nums.length - 1 - i;j++){
            
                if(which_larger(nums[j],nums[j + 1])){
                
                    tmp = nums[j + 1];
                    nums[j + 1] = nums[j]; 
                    nums[j] = tmp;
                }
            }
        }
        tmp = 0;
        for(int i = nums.length - 1;i >= 0;i--) {result += String.valueOf(nums[i]);if(nums[i] == 0) tmp++;}
        
        return (tmp == nums.length?String.valueOf(0):result);
    }
    
    public boolean which_larger(int num1, int num2){
        //boolean result = true;
        String new_num1 = String.valueOf(num1) + String.valueOf(num2);
        String new_num2 = String.valueOf(num2) + String.valueOf(num1);
        int flag = new_num1.compareTo(new_num2);
        
        
 
        return flag >= 0? true : false;
    }
}