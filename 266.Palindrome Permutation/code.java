public class Solution {
    public boolean canPermutePalindrome(String s) {
        Map <Character,Integer>char_table = new HashMap<Character,Integer>();
        boolean result = true;
        int flag = 0;
        for(int i = 0; i < s.length();i++){
            
            if(char_table.containsKey(s.charAt(i))) char_table.put(s.charAt(i),char_table.get(s.charAt(i)) + 1);
            else char_table.put(s.charAt(i),1);
            
        }
        for(Integer freq : char_table.values()){
            
            if((freq % 2) == 1){
                
                flag++;       
                if(flag > 1) {result = false;break;}
            }
            
        }
        return result;
    }
}