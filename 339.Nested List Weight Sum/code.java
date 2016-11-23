/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {
    private static int level = 0;
    public int depthSum(List<NestedInteger> nestedList) {
       level += 1;    
       int result = 0; 
       for(int i = 0;i < nestedList.size();i++){
           
           if(nestedList.get(i).isInteger()){
               result += nestedList.get(i).getInteger() * level;
           }else{
               
               result += depthSum(nestedList.get(i).getList());
               
           }
       }
       level -= 1;
      
       return result;
    }
}