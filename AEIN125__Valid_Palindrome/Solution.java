package AEIN125__Valid_Palindrome;



class Solution {
    static public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9%27]+","");
        s = s.toLowerCase();
        int p1 = 0, p2 = s.length()-1;
        while((p1 < p2)){
            if (s.charAt(p1) == s.charAt(p2)){
                p1++;
                p2--;
            }else{
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome("0P"));
    }
}


