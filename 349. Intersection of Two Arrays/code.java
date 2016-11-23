public class Solution {
    Map <Integer, Integer> intersect = new HashMap<Integer, Integer> ();
    public int[] intersection(int[] nums1, int[] nums2) {
       
       Map <Integer, Integer> tmp = new HashMap<Integer, Integer> ();
       for(int i = 0;i < nums1.length;i++) intersect.put(nums1[i],0);
       for(int i = 0;i < nums2.length;i++) if(intersect.containsKey(nums2[i])) tmp.put(nums2[i],1);
       int [] result =  new int[tmp.size()];
       int i = 0;
       for (Integer key : tmp.keySet()){result[i] = key;i++;}
      
       return result;
    }
}