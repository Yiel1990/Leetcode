public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] result = new int[nums.length + 1];
        for(int i = 0;i <= nums.length;i++){
         
             if(i == 0) result[0] = 0;
             else if(i == 1) result[1] = nums[0];
             else result[i] = result[i - 1] > result[i - 2] + nums[i - 1] ? result[i - 1] : result[i - 2] + nums[i - 1];
             
        }
        return result[nums.length];
    }
}