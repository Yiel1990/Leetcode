public class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonZero = 0;
        
        for(int i = 0;i < nums.length;i++){
                
                if(nums[i] != 0){nums[nonZero] = nums[i];nonZero++;}
   
        }
        for(int i = nonZero;i <  nums.length;i++) nums[i] = 0;
    }
}