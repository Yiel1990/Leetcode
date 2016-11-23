/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
       // ListNode* carry;
        ListNode* result = NULL;
        ListNode* tmp_result = NULL;
        ListNode* start1;
        ListNode* start2;
        int carry;
        start1 = l1;
        start2 = l2;
        int temp;
        int length1 = 0;
        int length2 = 0;
        int length_max = 0;
        int length_min = 0;
        int length = 0;
        int number1 = 0;
        int number2 = 0;
        
        while(1){
            
            if(start1 != NULL){
                length1++;cout<<start1->val<<endl;
            }else{break;}   
            start1 = start1->next;
        }
        
        while(1){
            
            if(start2 != NULL){
                length2++;
            }else{break;}
            start2 = start2->next;
        }
       // cout<<length1<<" "<<length2<<endl;
        start1 = l1;
        start2 = l2;
        length_max = length1;
        length_min = length2;
        
        if(length1 == 0) return l2;
        if(length2 == 0) return l1;
        
        if(length1 < length2) {start1 = l2;start2 = l1;length_max = length2;length_min = length1;}
        carry = 0; 
		//tmp_result = (result);
        for(int i = 0;i < length_max;i++){
            
			
			number1 = start1->val;
			if(i < length_min){
				number2 = start2->val;
			}else{number2 = 0;}
          
			temp = carry + number1 + number2;
         
			if(temp >= 10) {
              temp = temp - 10;
              carry = 1;
			}else{carry = 0;}
          
			//tmp_result->val = temp;
			//cout<<temp<<endl;
			start1 = start1->next;
			if(i < length_min){
				start2 = start2->next;
			}
			
			if(tmp_result == NULL){
			    
			    tmp_result = new ListNode(temp);
			    result = tmp_result;
			    if((carry == 1)&&(i == length_max - 1)){tmp_result->next = new ListNode(1);}
			    
			}else{
			//ListNode *new_node = (ListNode *)malloc(sizeof(ListNode));
		    	//if(i != length_max - 1){
			      tmp_result->next = new ListNode(temp);
			      tmp_result = tmp_result->next;
			    
		    	//}else{
			    
			      //if(carry == 0){tmp_result->next = NULL;}
			      if((carry == 1)&&(i == length_max - 1)){tmp_result->next = new ListNode(1);}
			    
		    	//}
			}
          
        }
		
        return result;
        
    }
};