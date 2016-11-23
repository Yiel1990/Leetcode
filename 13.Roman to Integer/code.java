public class Solution {
    private Map<Character,Integer> table = new HashMap<Character ,Integer>();
    public int romanToInt(String s) {
        
        int result = 0;
        char pre_c = s.charAt(s.length() - 1);
        char tmp_c = pre_c;
        table.put('I',1);table.put('V',5);table.put('X',10);table.put('L',50);
        table.put('C',100);table.put('D',500);table.put('M',1000);
        
        result = table.containsKey(pre_c) ? table.get(pre_c) : 0;
        
        for(int i = s.length() - 2;i >= 0;i--){
            
             tmp_c = s.charAt(i);
            // System.out.println(tmp_c);
            // System.out.println(table.get(tmp_c)+"# "+table.get(pre_c));
             if(table.get(tmp_c) >= table.get(pre_c)){
                 result += table.get(tmp_c);
            }else{result -= table.get(tmp_c);}
            pre_c = tmp_c;
           
        }
        
        return result;
    }
}