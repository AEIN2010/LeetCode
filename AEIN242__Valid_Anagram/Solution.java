package AEIN242__Valid_Anagram;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() == t.length()){
            char[] newS = s.toCharArray();
            Arrays.sort(newS, 0, s.length());

            char[] newT = t.toCharArray();
            Arrays.sort(newT, 0, t.length());

            for(int j = 0; j < newS.length; j++){
                if(newS[j] != newT[j]){
                    return false;
                }
            }

            return true;
        }else{
            return false;
        }


        // this solution will fail in the following case:
        // s ="ac"
        // t ="bb"
        // int sCharCount = 0;
        // int tCharCount = 0;
        // for(int i = 0; i < s.length(); i++){
        //     sCharCount += s.charAt(i);
        // }
        // System.out.println(sCharCount);

        // for(int j = 0; j < t.length(); j++){
        //     tCharCount += t.charAt(j);
        // }
        // System.out.println(tCharCount);

        // return tCharCount == sCharCount;
    }
}