public class Solution {
    public boolean isHappy(int n) {
        Map<Integer,Integer> table = new HashMap<Integer,Integer>();
        int tmp = n;
        //System.out.println(tmp);
        while(true){
        
            tmp = happyResult(tmp);
            
            if(tmp == 1) return true;
            
            if(table.containsKey(tmp)) return false;
            else table.put(tmp,1);
        }
       
    }
    public static int happyResult(int n){
        int result = 0;
        int tmp = n;
        //System.out.println(tmp);
        while(tmp != 0){
        
            result += (tmp % 10) * (tmp % 10);
            tmp = (int) tmp / 10;
        
        }
        return result;
    }
}