public class Solution {
    private Map <Integer, Integer> table = new HashMap<Integer, Integer>();
    public int majorityElement(int[] nums) {
        
        int result = 0;
        int threshold = nums.length / 2;
        //System.out.println(threshold);
        for(int i = 0;i < nums.length;i++){
            
            if(table.containsKey(nums[i])) table.put(nums[i],table.get(nums[i]) + 1); else table.put(nums[i],1);
            if(table.get(nums[i]) > (threshold)){result = nums[i];break;}
        }
        
        return result;
    }
}