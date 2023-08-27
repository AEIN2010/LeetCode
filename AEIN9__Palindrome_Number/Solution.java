package AEIN9__Palindrome_Number;


//
//https://leetcode.com/submissions/detail/950279224/
//


class Solution {
    public boolean isPalindrome(int x) {


        if(x == 0)
            return true;
        if(x < 0)
            return false;

        int y = 0;
        int x2 = x;

        while(x > 0){
            y = (y*10) + (x % 10);
            x = x / 10;
        }

        if(x2 == y)
            return true;
        return false;
    }
}


