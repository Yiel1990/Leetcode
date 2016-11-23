class Solution {
public:
    int reverse(int x) {
        
        int s_result[20];
        long result = 0;;
        int tmp_x;
        int flag = 1;
        if(x <= 0){flag = -1;x = -x;}
        int iter = 10;
        int res = 0;
        int dive = 0;
        tmp_x = x;
        int length = 0;
        //cout <<x <<endl;
       if(x>2147483647||x <-2147483647){return 0;}
        while(1){
            
            res = tmp_x % iter;
            dive = tmp_x / iter;
            s_result[length] = res;
            if(dive < 1){break;
                
            }
            tmp_x = dive;
            length++;
        }
        for(int i = 0; i<= length;i++){cout <<s_result[i];}
      cout <<length<<endl;
      
        //int b = s_result[0];
        //cout<<b;
        //int b;
        for(int j = 0;j <= length;j++){
            
            
            result += s_result[j] * (long)(pow(iter, length - j));
            
            
        }
        result = result * flag;
        if(result> 2147483647||result < -2147483647 ) return 0;
      return result;  
    }
};