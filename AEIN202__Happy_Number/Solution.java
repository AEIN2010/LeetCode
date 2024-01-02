package AEIN202__Happy_Number;

import java.util.HashMap;

public class Solution {

    static HashMap<Integer, Integer> myMap = new HashMap<>();
    static boolean isHappy(int n){
       try{
           String s = n+"";
           int x = 0;
           for(int i = 0; i < s.length(); i++){
               x += Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))),2);
           }
           if(x != 1){
               if(myMap.containsKey(x))
                   return false;
               myMap.put(x,x);
               return isHappy(x);
           }
           return true;
       }catch (StackOverflowError e){
           return false;
       }

//        String s = n+"";
//        int x = 0;
//        for(int i = 0; i < s.length(); i++){
//            x += Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))),2);
//        }
//        if(x != 1){
//            isHappy(x);
//        }
//        return true;

    }

    public static void main(String[] args) {
        System.out.println(isHappy(13));
    }
}
