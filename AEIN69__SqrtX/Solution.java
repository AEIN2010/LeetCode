package AEIN69__SqrtX;

class Solution {
    public int mySqrt(int x) {
        long num =-5;
        for(long i = 0; i < 46342; i++){
            num = i*i;
            if(num == x){
                return (int)i;
            }else if(num > x){
                return (int)i-1;
            }
        }
        return 0;
    }
}