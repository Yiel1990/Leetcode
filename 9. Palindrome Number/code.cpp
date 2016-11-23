class Solution {
public:
    bool isPalindrome(int x) {
        
        string num2string;
        int res = 0;
        int dive = 0;
        if(x < 0){return false;}
        int new_x = x;
        if(x>=0 && x<=9){return true;}
        while(1){
            
            res = new_x % 10;
            dive = new_x / 10;
            num2string.push_back(res);
            if(dive < 1){break;}
            new_x = dive;
        }
        cout <<num2string<<endl;
        int flag = 1;
        int length = num2string.length();
        for(int i = 0; i < length;i++){
            
            if(num2string[i] != num2string[length - i - 1]){flag = 0;break;}
        }
        if(flag == 1){return true;}else{return false;}
    }
};