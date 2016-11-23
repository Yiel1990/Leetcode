public class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        
        List<String> result = new LinkedList<String>();
        //System.out.println(s.substring(0,1));
        for(int i = 0;i < s.length() - 1;i++){
            
            if((s.charAt(i) == '+')&&(s.charAt(i+1) == '+')) {
                
                String tmp = new String(((i - 1) >= 0? s.substring(0,i) : "") + "--" +(i + 2 <= s.length() - 1 ? s.substring(i + 2) : "" ));
                result.add(tmp);
                
            }
            
        }
        
        return result;
    }
}