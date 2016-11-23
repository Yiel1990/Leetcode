class Solution {
public:
    string convert(string s, int numRows) {
        
        
        map<int, string> pos2string;
        string result;
        string tmp;
        int len = 2 * numRows - 2;
        int len2 = numRows - 2;
        int temp_result = 0;
        int pos = 0;
        int index = 0;
        if((numRows <= 1)or(s.length() == 0)){return s;}
        
        
        for(int i = 0;i < s.length();i++){
            
           // for(int j = 0; j < numRows;j++){
            pos = i % len;        
            if(pos < numRows){
                
                index = pos % numRows;
                //tmp = pos2string[index];
                //tmp.push_back(i);
                //pos2string[index] = tmp;
                pos2string[index].push_back(s[i]);
                
            }else{
                
                index = len2 - pos % numRows;
                pos2string[index].push_back(s[i]);
               // tmp = pos2string[index];
              // tmp.append(i);
               // pos2string[index] = tmp;
                
            }
        }
        for(int i = 0; i < numRows;i++){
            
            for(int j = 0;j < pos2string[i].length();j++){
                
                result.push_back(pos2string[i].at(j));
                
            }
            
            
        }
        //cout << result <<endl;
       // cout <<s <<endl;
        //return result;
        return result;
        
    }
};