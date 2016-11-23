public class Solution {
    // you need to treat n as an unsigned value
    /*
    public int hammingWeight(int n) {
        int pivot = n;
        int result = 0;
        int tmp_pivot = pivot;
        for(int i = 0;i < 32;i++){
            tmp_pivot = pivot;
            pivot = (pivot >> 1) << 1;
            result += (tmp_pivot - pivot);
            pivot = pivot >> 1;
        }
        return result;
    }*/
    public int hammingWeight(int n) {
        int pivot = n;
        int result = 0;
        int flag = 1;
        for(int i = 0;i < 32;i++){
            if((pivot & flag) != 0) result += 1;
            pivot = pivot >> 1;
          
        }
        return result;
    }
}