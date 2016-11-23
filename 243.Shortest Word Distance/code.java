public class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        
        int distance = 0;
        List <Integer> L1 = new LinkedList <Integer>();
        List <Integer> L2 = new LinkedList <Integer>();
        for(int i = 0;i < words.length;i++){
            
            if(word1.equals(words[i])) L1.add((int)i); 
            else if(word2.equals(words[i])) L2.add((int)i);
            
        }
        distance =Math.abs(L1.get(0)-L2.get(0));
        for(int i = 0;i < L1.size();i++){
            
            for(int j = 0;j < L2.size();j++){
                
                distance = distance > Math.abs(L1.get(i) - L2.get(j)) ? Math.abs(L1.get(i) - L2.get(j)) : distance;
            }
        }
        
        return distance;
    }
}