public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer,Integer> table = new HashMap <Integer,Integer>();
        //boolean result = false;
        for(int i = 0;i < nums.length;i++){
        
            if(table.containsKey(nums[i])) return true;
            else table.put(nums[i],1);
        }
        return false;
    }
}