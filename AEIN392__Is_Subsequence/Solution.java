package AEIN392__Is_Subsequence;

class Solution {
    static public boolean isSubsequence(String s, String t) {

        if((s.length() == 0) || ((s.length() == 0) && (t.length() == 0)))
            return true;
        else if(s.length() > t.length())
            return false;

        int sp = 0;

        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(sp)){
                sp++;
                if(sp == s.length())
                    break;
            }
        }
        if(sp == s.length()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
}