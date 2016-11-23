class Solution {
public:
    string longestPalindrome(string s) {
        map<int, int> p;
        string new_string;
        string result;
        int length = s.length();
        new_string.push_back('$');
        new_string.push_back('#');
        for(int i = 0;i < length;i++){
            new_string.push_back(s[i]);
            new_string.push_back('#');
        }
        //cout << new_string <<endl;
        int id = 0;
        int mx = 0;
        p[0] = 0;
        for(int i = 1; i < new_string.length();i++){
            
            if(mx < i){
               
               p[i] = 1;
               
                
            }else{
                p[i] = (p[2*id - i] < (mx - i) ? p[2*id - i] : (mx - i));
                
                
            }
            while(new_string[p[i]+i]==new_string[-p[i]+i]){p[i]++;}
            if(p[i]+i > mx){
                mx = p[i]+i;
                id = i;
                
            }
            
        }
        int max = 0;
        for(int i = 0; i< new_string.length();i++){
            
            if(p[max]<p[i]){max = i;}
            
        }
        int rad = p[max] - 1;
        for(int i = -rad; i<=rad;i++){
            
            if(new_string[i+max] != '#'){result.push_back(new_string[i+max]);}
            
        }
        
        
       return result; 
    }
};