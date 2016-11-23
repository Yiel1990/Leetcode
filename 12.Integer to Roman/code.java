public class Solution {
   
    public String intToRoman(int num) {
        
            String result = "";
            String[] Unit = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
            int[] Value =  {1000,900,500,400,100,90,50,40,10,9,5,4,1};
            
            for(int i = 0;i < Unit.length;i++){
                
                if(num == 0) break;    
                
                while(true){
                    
                    if(num >= Value[i]){num -= Value[i];result += Unit[i];}   
                    else break;
                }
            }
            
            return result;
    }
}