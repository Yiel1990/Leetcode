
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        vector<int> result;
        map<int, int> candidate;
        map<int, int> candidate_same;
        int index1,index2,tmp_index;
        int length = nums.capacity();

        for(int i = 0;i < length;i++){
            
            int tmp = nums.at(i);
           if(candidate.count(tmp) == 0){
            candidate[tmp] = i;
           }else{candidate_same[tmp] = i;}
        
            
        }
        for(int i = 0;i < length;i++){
            
            int origin = nums.at(i);
            int tmp = target - origin;
            if(candidate.count(tmp) == 1){
                
                if(candidate[tmp] != candidate[origin]){
                    
                    index1 = candidate[origin];
                    index2 = candidate[tmp];
                    break;
                    
                }else{
                    if(candidate_same.count(tmp) == 1){
                     index1 = candidate[origin];
                     index2 = candidate_same[tmp];
                     break;}
                }
                
                
                
            }
            
        }
        
        if(index1 > index2){
            
            tmp_index = index1;
            index1 = index2;
            index2 = tmp_index;
            
        }
        
        result.push_back(index1 + 1);
        result.push_back(index2 + 1);       
        return result;
        
    }
};