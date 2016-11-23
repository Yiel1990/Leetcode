public class Solution {
    private Map<Character,Integer> table = new HashMap<Character,Integer>();   
    public char findTheDifference(String s, String t) {
        
        int result = 0;
        char ch_result = ' ';
        for(int i = 0;i < s.length();i++) result ^= (s.charAt(i) - 'a');
        for(int i = 0;i < t.length();i++) result ^= (t.charAt(i) - 'a');
        result = result + 'a';
        ch_result = (char) result;
        //System.out.println(ch_result);
        return ch_result;
    }
}