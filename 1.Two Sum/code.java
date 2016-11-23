public class Solution {
    private Map<Integer, Integer> table = new HashMap<Integer, Integer>();
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        for(int i = 0;i < nums.length;i++) table.put(nums[i],i);
        for(int i = 0;i < nums.length;i++){
            
            if((table.containsKey(target - nums[i]))&&(table.get(target - nums[i]) != i)) {
                System.out.println(table.get(target - nums[i]));
                System.out.println(i);
                result[0] = table.get(target - nums[i]) > i ? i : table.get(target - nums[i]);
                result[1] = table.get(target - nums[i]) > i ? table.get(target - nums[i]) : i;
                
            }
            
        }
        
        return result;
    }
}