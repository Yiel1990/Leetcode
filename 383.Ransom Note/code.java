public class Solution {
    Map<Character,Integer> magzineTable = new HashMap <Character,Integer> ();
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        for(int i = 0;i < magazine.length();i++){
            
            if(magzineTable.containsKey(magazine.charAt(i))){
                
                magzineTable.put(magazine.charAt(i),magzineTable.get(magazine.charAt(i)) + 1);
                
            }else{magzineTable.put(magazine.charAt(i),1);}
            
        }
        
        
        for(int i = 0;i < ransomNote.length();i++){
            
            if(magzineTable.containsKey(ransomNote.charAt(i))){
                
                magzineTable.put(ransomNote.charAt(i),magzineTable.get(ransomNote.charAt(i)) - 1);
                
                if(magzineTable.get(ransomNote.charAt(i)) < 0){result = false;break;}
                
            }else{result = false;break;}
            
        }
        return result;
    }
}