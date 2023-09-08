package AEIN205__Isomorphic_Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

//    static public boolean isIsomorphic(String s, String t) {
//
//        if(s.length() != t.length())
//            return false;
//
//        HashMap<Character, Character> passed = new HashMap<>();
//
//        for(int i = 0; i < s.length(); i++){
//            if((passed.containsKey(s.charAt(i))) || (passed.containsValue(t.charAt(i))))
//                continue;
//            else{
//                passed.put(s.charAt(i), t.charAt(i));
//                t = t.substring(0,i) + t.substring(i, t.length()).replace(t.charAt(i), s.charAt(i));
//            }
//
//        }
//
//        if (s.equals(t))
//            return true;
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isIsomorphic("egcd", "adfd"));
//    }
}
